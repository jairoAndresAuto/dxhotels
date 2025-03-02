package co.com.dxhotels.automatizacion.stepdefinitions;

import co.com.dxhotels.automatizacion.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Cuando("que el usuario procede a loguearse en la pagina")
    public void queElUsuarioProcedeALoguearseEnLaPagina(List<Map<String, String>> credenciales) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.con(credenciales));
    }

    @Entonces("el sistema debera mostrar el siguente {string}")
    public void elSistemaDeberaMostrarElSiguente(String string) {

    }
}
