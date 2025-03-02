package co.com.dxhotels.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Map;

import static co.com.dxhotels.automatizacion.userinterfaces.FiltroHotelesUI.BTN_APLICAR;
import static co.com.dxhotels.automatizacion.userinterfaces.FiltroHotelesUI.CHK_ESTRELLAS;
import static co.com.dxhotels.automatizacion.util.Constantes.CERO;
import static co.com.dxhotels.automatizacion.util.Constantes.UNO;

public class AplicarFiltros implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        CHK_ESTRELLAS.resolveAllFor(actor).get(CERO).click();
        CHK_ESTRELLAS.resolveAllFor(actor).get(UNO).click();
        actor.attemptsTo(Scroll.to(BTN_APLICAR),
                Click.on(BTN_APLICAR));
    }

        public static AplicarFiltros hoteles() {
            return Tasks.instrumented(AplicarFiltros.class);
        }
}
