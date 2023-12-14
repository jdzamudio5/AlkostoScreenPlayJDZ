package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CarUI {
    public static Target LBL_CAR1=Target.the("Producto Carro")
            .locatedBy("(//div[@class='item-column item__info']//a/span)[1]");
    public static Target LBL_CAR=Target.the("Producto Carro")
            .locatedBy("(//div[@class='item-column item__info']//a/span)[2]");
}
