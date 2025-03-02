package co.com.dxhotels.automatizacion.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public static String obtenerFecha(int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        Date fechaFutura = calendar.getTime();
        return sdf.format(fechaFutura);
    }
}
