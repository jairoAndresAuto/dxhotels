package co.com.dxhotels.automatizacion.interactions;

import co.com.dxhotels.automatizacion.util.Constantes;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.ESTRELLAS;
import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.PRECIO;
import static co.com.dxhotels.automatizacion.util.Constantes.PRECIOS;

@AllArgsConstructor
public class Recolectar implements Interaction {

    private List<String> precios;
    private List<String> estrellas;

    @Override
    public <T extends Actor> void performAs(T actor) {
        precios = PRECIO.resolveAllFor(actor).texts();
        estrellas= ESTRELLAS.resolveAllFor(actor).texts();
        actor.remember(PRECIOS, precios);
        actor.remember(Constantes.ESTRELLAS, estrellas);
    }

    public static Recolectar informacion(List<String> precios, List<String> estrellas) {
        return new Recolectar(precios, estrellas);
    }
}
