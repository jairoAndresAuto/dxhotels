package co.com.dxhotels.automatizacion.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static co.com.dxhotels.automatizacion.userinterfaces.IniciarSesionUI.*;
import static co.com.dxhotels.automatizacion.util.Constantes.*;

@AllArgsConstructor
public class IniciarSesion implements Task {

    private List<Map<String,String>> credenciales;

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(BTN_LOGIN),
               Enter.theValue(credenciales.get(CERO).get(USUARIO)).into(TXT_USUARIO).thenHit(Keys.TAB),
               Enter.theValue(credenciales.get(CERO).get(CONTRASENIA)).into(TXT_CLAVE));
    }

    public static IniciarSesion con(List<Map<String,String>> credenciales) {
        return Tasks.instrumented(IniciarSesion.class,credenciales);
    }
}
