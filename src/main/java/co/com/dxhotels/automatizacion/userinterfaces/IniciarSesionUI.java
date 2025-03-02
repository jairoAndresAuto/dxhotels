package co.com.dxhotels.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionUI {

    public static final Target BTN_LOGIN = Target.the("boton login")
            .located(By.xpath("//span[contains(.,'Login')]"));
    public static final Target TXT_USUARIO = Target.the("boton login")
            .located(By.id("HeaderControl_LogonControl_LoginFormLayout_txtEmail_I"));
    public static final Target TXT_CLAVE = Target.the("boton login")
            .located(By.id("HeaderControl_LogonControl_LoginFormLayout_txtPassword_I"));

}
