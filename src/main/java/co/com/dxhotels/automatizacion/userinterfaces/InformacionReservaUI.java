package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionReservaUI {

    public static final Target TXT_NOMBRE = Target.the("texto nombre")
            .located(By.id("MainContentPlaceHolder_ASPxFormLayout1_FirstNameTextBox_I"));
    public static final Target TXT_APELLIDO = Target.the("texto apellido")
            .located(By.id("MainContentPlaceHolder_ASPxFormLayout1_LastNameTextBox_I"));
    public static final Target TXT_EMAIL = Target.the("texto email")
            .located(By.id("MainContentPlaceHolder_ASPxFormLayout1_EmailTextBox_I"));
    public static final Target TXT_NOMBRE_TARJETA = Target.the("texto nombre tarjeta")
            .located(By.id("MainContentPlaceHolder_PaymentPageControl_CreditCardFormLayout_CreditCardNameTextBox_I"));
    public static final Target TXT_CORREO_TARJETA = Target.the("texto correo tarjeta")
            .located(By.id("MainContentPlaceHolder_PaymentPageControl_CreditCardFormLayout_CreditCardEmailTextBox_I"));
    public static final Target BTN_RESERVAR = Target.the("boton reservar")
            .located(By.id("MainContentPlaceHolder_InvoiceButton"));

}
