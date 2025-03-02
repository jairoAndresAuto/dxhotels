package co.com.dxhotels.automatizacion.tasks;

import co.com.dxhotels.automatizacion.interactions.SumarCantidad;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.dxhotels.automatizacion.userinterfaces.InformacionHotelUI.*;
import static co.com.dxhotels.automatizacion.util.Constantes.*;
import static co.com.dxhotels.automatizacion.util.Util.obtenerFecha;

@AllArgsConstructor
public class LlenarInformacion implements Task {

    private List<Map<String, String>> datos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!(datos.get(CERO).get(CIUDAD) == null)) {
            actor.attemptsTo(Click.on(SLC_CIUDAD),
                    Click.on(OPT_CIUDAD.of(datos.get(CERO).get(CIUDAD))));
        }
        if (!(datos.get(CERO).get(DIAS_IDA) == null)) {
            actor.attemptsTo(Enter.theValue(obtenerFecha(
                    Integer.parseInt(datos.get(CERO).get(DIAS_IDA)))).into(TXT_CHECKIN));
        }
        actor.attemptsTo(SumarCantidad.con(2, BTN_SUMAR_ADULTOS),
                SumarCantidad.con(2, BTN_SUMAR_CHILD),
                Click.on(SLC_HABITACIONES),
                Click.on(OPT_HABITACIONES.of(datos.get(CERO).get(POSICION_HABITACIONES))));
        if (!(datos.get(CERO).get(DIAS_VUELTA) == null)) {
            actor.attemptsTo(Enter.theValue(obtenerFecha(
                    Integer.parseInt(datos.get(CERO).get(DIAS_VUELTA)))).into(TXT_CHECKOUT));
        } else {
            actor.attemptsTo(Clear.field(TXT_CHECKOUT));
        }
        if (datos.get(0).get(DIAS_IDA) == null) {
            actor.attemptsTo(Clear.field(TXT_CHECKIN));
        }
        actor.attemptsTo(Click.on(BTN_BUSCAR));
    }

    public static LlenarInformacion hotel(List<Map<String, String>> datos) {
        return Tasks.instrumented(LlenarInformacion.class, datos);
    }

}
