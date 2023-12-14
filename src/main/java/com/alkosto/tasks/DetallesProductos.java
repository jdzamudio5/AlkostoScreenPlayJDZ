package com.alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.SeleccionUI.BTN_CARRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetallesProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


        );
    }
    public static DetallesProductos on(){
        return instrumented(DetallesProductos.class);
    }
}
