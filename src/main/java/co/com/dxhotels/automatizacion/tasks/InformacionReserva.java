package co.com.dxhotels.automatizacion.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dxhotels.automatizacion.userinterfaces.InformacionReservaUI.*;
import static co.com.dxhotels.automatizacion.util.Constantes.CORREO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InformacionReserva implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();
        String nombre = faker.name().firstName();
        actor.attemptsTo(WaitUntil.the(TXT_NOMBRE, isVisible()),
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(faker.name().lastName()).into(TXT_APELLIDO),
                Enter.theValue(nombre + CORREO).into(TXT_EMAIL),
                Scroll.to(TXT_CORREO_TARJETA),
                Enter.theValue(nombre).into(TXT_NOMBRE_TARJETA),
                Enter.theValue(nombre + CORREO).into(TXT_CORREO_TARJETA),
                Scroll.to(BTN_RESERVAR),
                Click.on(BTN_RESERVAR));
    }

    public static InformacionReserva hotel() {
        return Tasks.instrumented(InformacionReserva.class);
    }

}
