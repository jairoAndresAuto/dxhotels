package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecolectarDatosUI {

    public static final Target LBL_PRECIO = Target.the("boton login")
            .located(By.className("price"));
    public static final Target LBL_ESTRELLAS = Target.the("boton login")
            .located(By.xpath("//div[@class='stat']//span"));
    public static final Target BTN_SIGUIENTE = Target.the("boton siguiente")
            .located(By.id("MainContentPlaceHolder_HotelsDataView_PGB_PBN"));
    public static final Target BTN_SELECCIONAR = Target.the("boton seccionar")
            .locatedBy("//div[@class='price' and contains(.,'{0}')]//..//div[@class='dxb']");
    public static final Target LBL_MENSAJE_CIUDAD = Target.the("etiqueta ciudad error")
            .located(By.xpath("//a[contains(.,'Location must be selected')]"));
    public static final Target LBL_MENSAJE_REQUERIDO = Target.the("etiqueta de requerido")
            .located(By.xpath("//a[contains(.,'required')]"));

}
