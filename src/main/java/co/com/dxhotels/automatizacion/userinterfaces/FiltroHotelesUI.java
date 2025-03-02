package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltroHotelesUI {

    public static final Target CHK_ESTRELLAS = Target.the("boton login")
            .located(By.xpath("//td[@class='dxichCellSys']"));
    public static final Target BTN_APLICAR = Target.the("boton login")
            .located(By.id("MainContentPlaceHolder_FilterFormLayout_ApplyFilterButton_CD"));

}
