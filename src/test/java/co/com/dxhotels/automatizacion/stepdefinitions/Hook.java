package co.com.dxhotels.automatizacion.stepdefinitions;

import io.cucumber.java.es.Dado;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import static co.com.dxhotels.automatizacion.util.Constantes.DXHOTELS_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Managed(driver = "chrome")
    public static WebDriver driver;

    @Before
    public static void setTheStage()  {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Calidad");
    }

    @Dado("que el usuario ingreso a la pagina de dxhotels")
    public void queElUsuarioIngresoALaPaginaDeDxhotels() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver)).
                attemptsTo(Open.url(DXHOTELS_URL));
    }

}
