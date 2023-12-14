package com.alkosto.tasks;

import com.alkosto.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;

import static com.alkosto.UI.SeleccionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                SelectRandom.click(),
                ObtenerNombreProd.on(),
                Click.on(BTN_REGRESAR),
                ScrollIN.on(),
                SelectRandom.click(),
                ObtenerNombreProd2.on(),
                Click.on(BTN_CARRITO),
                Click.on(BTN_REGRESAR),
                Click.on(BTN_CARRO));
        System.out.println(ObtenerNombreProd.on());
    }
    public static SeleccionTask on(){
        return instrumented(SeleccionTask.class);
    }
}
