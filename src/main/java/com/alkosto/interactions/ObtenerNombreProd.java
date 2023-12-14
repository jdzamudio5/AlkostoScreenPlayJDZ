package com.alkosto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.alkosto.UI.SeleccionUI.LBL_NOMPROD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerNombreProd implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {


        String nombreProducto=LBL_NOMPROD.resolveFor(actor).getText();
        actor.remember("producto1",nombreProducto);
        System.out.println(nombreProducto);

    }

    public static ObtenerNombreProd on() {
        return instrumented(ObtenerNombreProd.class);
    }
}
