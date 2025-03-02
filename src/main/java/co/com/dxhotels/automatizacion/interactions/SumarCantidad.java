package co.com.dxhotels.automatizacion.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor
public class SumarCantidad implements Interaction {

    private int cantidad;
    private Target elemento;

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < cantidad; i++) {
            actor.attemptsTo(Click.on(elemento));
        }
    }

    public static SumarCantidad con(int cantidad, Target elemento) {
        return new SumarCantidad(cantidad,elemento);
    }
}
