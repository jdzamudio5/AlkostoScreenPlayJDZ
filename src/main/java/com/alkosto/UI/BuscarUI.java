package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarUI   {
    public static Target TXT_BUSCAR=Target.the("Barra Busqueda")
            .locatedBy("//input[@id='js-site-search-input']");
    public static Target BTN_COOKIES=Target.the("Cookies")
            .locatedBy("//button[@class='button-primary js-cookie-notification-accept']");


}

