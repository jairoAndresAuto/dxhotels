package co.com.dxhotels.automatizacion.tasks;

import co.com.dxhotels.automatizacion.interactions.Recolectar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.BTN_SIGUIENTE;
import static co.com.dxhotels.automatizacion.util.Constantes.*;

public class RecolectarDatos implements Task {

    List<String> precios1 = new ArrayList<String>();
    List<String> estrellas1 = new ArrayList<String>();
    List<String> precios2 = new ArrayList<String>();
    List<String> estrellas2 = new ArrayList<String>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Recolectar.informacion(precios1, estrellas1),
                Click.on(BTN_SIGUIENTE));
        precios1 = actor.recall(PRECIOS);
        estrellas1 = actor.recall(ESTRELLAS);
        actor.attemptsTo(Recolectar.informacion(precios2, estrellas2));
        precios2 = actor.recall(PRECIOS);
        estrellas2 = actor.recall(ESTRELLAS);
        precios1.addAll(precios2);
        estrellas1.addAll(estrellas2);
        actor.remember(PRECIOS, precios1.toString());
        actor.remember(ESTRELLA_FILTRO, estrellas1.toString());
    }

    public static RecolectarDatos hoteles() {
        return Tasks.instrumented(RecolectarDatos.class);
    }
}
