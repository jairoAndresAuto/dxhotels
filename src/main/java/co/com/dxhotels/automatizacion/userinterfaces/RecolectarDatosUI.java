package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecolectarDatosUI {

    public static final Target PRECIO = Target.the("boton login")
            .located(By.className("price"));
    public static final Target ESTRELLAS = Target.the("boton login")
            .located(By.xpath("//div[@class='stat']//span"));
    public static final Target BTN_SIGUIENTE = Target.the("boton login")
            .located(By.id("MainContentPlaceHolder_HotelsDataView_PGB_PBN"));
    public static final Target BTN_SELECCIONAR = Target.the("boton login")
            .locatedBy("//div[@class='price' and contains(.,'{0}')]//..//div[@class='dxb']");
    public static final Target LBL_MENSAJE_CIUDAD = Target.the("boton login")
            .located(By.xpath("//a[contains(.,'Location must be selected')]"));
    public static final Target LBL_MENSAJE_REQUERIDO = Target.the("boton login")
            .located(By.xpath("//a[contains(.,'required')]"));

}
