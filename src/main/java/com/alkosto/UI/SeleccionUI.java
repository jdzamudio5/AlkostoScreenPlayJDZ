package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionUI {
    public static Target LI_PRODUCTOS=Target.the("Lista de productos")
            //.locatedBy("//li[@class='ais-InfiniteHits-item product__item js-product-item js-algolia-product-click']");
            .locatedBy("//button[starts-with(@id,'js-add-cart-')]");
            //locatedBy("//a[@class='js-algolia-product-click js-algolia-product-title']");
    public static Target BTN_CARRITO=Target.the("Boton agregar Carrito")
            .locatedBy("//div[@class='details']//ul/li/h5");
            //locatedBy("(//button[@id='addToCartButton'])[1]");
    public static Target LBL_NOMPROD=Target.the("Nombre Producto")
            .locatedBy("//div[@class='details']//ul/li/h5");
            //.locatedBy("//div[@class='new-container__header']//div/h1");
    public static Target BTN_REGRESAR=Target.the("Boton Regresar compras")
            .locatedBy("//span[@class='continue-shopping-button__label']");
    public static Target BTN_CARRO=Target.the("Btn Carro")
            //.locatedBy("//a[@class='button-primary js-animateBeforeSend js-delayLocation js-sf-go-to-cart']");
            .locatedBy("//li[@id='js-mycart-header']//a");
}
