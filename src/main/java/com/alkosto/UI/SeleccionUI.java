package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionUI {
    public static Target LI_PRODUCTOS=Target.the("Lista de productos")
            .locatedBy("//button[starts-with(@id,'js-add-cart-')]");
    public static Target BTN_CARRITO=Target.the("Boton agregar Carrito")
            .locatedBy("//div[@class='details']//ul/li/h5");
    public static Target LBL_NOMPROD=Target.the("Nombre Producto")
            .locatedBy("//div[@class='details']//ul/li/h5");
    public static Target BTN_REGRESAR=Target.the("Boton Regresar compras")
            .locatedBy("//span[@class='continue-shopping-button__label']");
    public static Target BTN_CARRO=Target.the("Btn Carro")
            .locatedBy("//li[@id='js-mycart-header']//a");
}
