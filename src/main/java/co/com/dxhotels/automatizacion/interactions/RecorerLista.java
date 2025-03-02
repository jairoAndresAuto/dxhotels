package co.com.dxhotels.automatizacion.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static co.com.dxhotels.automatizacion.util.Constantes.PRECIOS_FILTRO;

@AllArgsConstructor
public class RecorerLista implements Interaction {

    private String lista;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] elementos = lista.replaceAll("[\\[\\]]", "").split(",\\s*");
        List<Double> lista = new ArrayList<>();
        for (String elemento : elementos) {
            lista.add(Double.parseDouble(elemento.trim().replace("$","")));
        }
        Collections.sort(lista);
        actor.remember(PRECIOS_FILTRO, lista);
    }

    public static RecorerLista quitarSimbolo(String lista) {
        return new RecorerLista(lista);
    }
}
