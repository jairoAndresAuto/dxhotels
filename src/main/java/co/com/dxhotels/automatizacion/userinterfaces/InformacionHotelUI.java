package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionHotelUI {

    public static final Target TXT_CHECKIN = Target.the("texto del checkin")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I"));
    public static final Target TXT_CHECKOUT = Target.the("texto del checkout")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_I"));
    public static final Target SLC_HABITACIONES = Target.the("Seleccione una habitacion")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_B-1"));
    public static final Target OPT_HABITACIONES = Target.the("opcion numero de habitaciones")
            .locatedBy("(//tr[@class='dxeListBoxItemRow_Metropolis']//td)[{0}]");
    public static final Target BTN_SUMAR_ADULTOS = Target.the("boton sumar adultos")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_B-4"));
    public static final Target BTN_SUMAR_CHILD = Target.the("boton sumar child")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_B-4"));
    public static final Target SLC_CIUDAD = Target.the("Seleccione una ciudad")
            .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_B-1"));
    public static final Target OPT_CIUDAD = Target.the("opcion ciudad")
            .locatedBy("//tr[@class='dxeListBoxItemRow_Metropolis']//td[contains(.,'{0}')]");
    public static final Target BTN_BUSCAR = Target.the("boton buscar")
        .located(By.id("MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD"));

}
