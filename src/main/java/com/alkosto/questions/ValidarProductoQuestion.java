package com.alkosto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.alkosto.UI.CarUI.LBL_CAR;
import static com.alkosto.UI.CarUI.LBL_CAR1;

public class ValidarProductoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String productog=actor.recall("produc1");

        String producto = LBL_CAR.resolveFor(actor).getText();
        String productoInicial=actor.recall("producto1");
        String producto2=LBL_CAR1.resolveFor(actor).getText();
        String productoinicial2=actor.recall("producto2");
        return producto.equals(productoInicial)&producto2.equals(productoinicial2);

    }
    public static Question<Boolean> from(){
        return new ValidarProductoQuestion();
    }
}
