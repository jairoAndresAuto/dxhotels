package co.com.dxhotels.automatizacion.tasks;


import co.com.dxhotels.automatizacion.interactions.FiltrarEstrellas;
import co.com.dxhotels.automatizacion.interactions.RecorerLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static co.com.dxhotels.automatizacion.userinterfaces.RecolectarDatosUI.BTN_SELECCIONAR;
import static co.com.dxhotels.automatizacion.util.Constantes.*;


public class EscogerProducto implements Task {

    private List<Double> preciosFiltro = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String precios = actor.recall(PRECIOS);
        String estrellitas = actor.recall(ESTRELLA_FILTRO);
        actor.attemptsTo(RecorerLista.quitarSimbolo(precios),
                FiltrarEstrellas.hoteles(estrellitas));
        preciosFiltro = actor.recall(PRECIOS_FILTRO);
        for (Double elemento:preciosFiltro) {
            if (elemento>=200){
                actor.remember(ELEMENTO,elemento);
                break;
            }
        }
       actor.attemptsTo(Click.on(BTN_SELECCIONAR.of(actor.recall(ELEMENTO).toString())));

    }

    public static EscogerProducto hotelMenosPrecio() {
        return Tasks.instrumented(EscogerProducto.class);
    }
}
