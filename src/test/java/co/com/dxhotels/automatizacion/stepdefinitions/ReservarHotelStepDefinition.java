package co.com.dxhotels.automatizacion.stepdefinitions;

import co.com.dxhotels.automatizacion.questions.ValidarMensaje;
import co.com.dxhotels.automatizacion.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.LBL_MENSAJE_CIUDAD;
import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.LBL_MENSAJE_REQUERIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservarHotelStepDefinition {

    @Cuando("procede a llegar los datos de la reservacion")
    public void procedeALlegarLosDatosDeLaReservacion(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(LlenarInformacion.hotel(datos));
    }

    @Y("realizar los filtros")
    public void realizarLosFiltros() {
        theActorInTheSpotlight().attemptsTo(AplicarFiltros.hoteles());
    }

    @Y("escoger el hotel de precio mas bajo")
    public void escogerElHotelDePrecioMasBajo() {
        theActorInTheSpotlight().attemptsTo(RecolectarDatos.hoteles(),
                EscogerProducto.hotelMenosPrecio());
    }

    @Y("llenar la informacion de la reserva")
    public void llenarLaInformacionDeLaReserva() {
        theActorInTheSpotlight().attemptsTo(InformacionReserva.hotel());
    }

    @Entonces("se valida que muestre el siguiente mensaje")
    public void seValidaQueMuestreElSiguienteMensaje() {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.
                deElementos(LBL_MENSAJE_CIUDAD.resolveFor(theActorInTheSpotlight()).getText(),
                        "Location must be selected")));
    }

    @Entonces("se valida que concuerden con el {string}")
    public void seValidaQueConcuerdenConEl(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.
                deElementos(LBL_MENSAJE_REQUERIDO   .resolveFor(theActorInTheSpotlight()).getText(),
                        mensaje)));
    }


}
