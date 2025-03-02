package co.com.dxhotels.automatizacion.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;

import static co.com.dxhotels.automatizacion.util.Constantes.LISTA_FILTRADA;

@AllArgsConstructor
public class FiltrarEstrellas implements Interaction {

    private String lista;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] elementos = lista.replaceAll("[\\[\\]]", "").split(",\\s*");
        List<String> listaFiltrada = new ArrayList<>();
        for (int i = 2; i < elementos.length; i += 3) {
            listaFiltrada.add(elementos[i]);
        }
        actor.remember(LISTA_FILTRADA, listaFiltrada);
    }


    public static FiltrarEstrellas hoteles(String lista) {
        return new FiltrarEstrellas(lista);
    }
}
