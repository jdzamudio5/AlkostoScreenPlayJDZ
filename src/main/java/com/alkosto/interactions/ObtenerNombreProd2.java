package com.alkosto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.alkosto.UI.SeleccionUI.LBL_NOMPROD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerNombreProd2 implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {


        String nombreProducto2=LBL_NOMPROD.resolveFor(actor).getText();
        actor.remember("producto2",nombreProducto2);
        System.out.println(nombreProducto2);


    }

    public static ObtenerNombreProd2 on() {
        return instrumented(ObtenerNombreProd2.class);
    }
}
