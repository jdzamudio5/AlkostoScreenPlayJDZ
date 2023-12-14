package com.alkosto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static com.alkosto.UI.SeleccionUI.LI_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollIN implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to("//li[@class='plp__breadcrumb__list__item plp__breadcrumb__list__item--selected']"));
    }
    public static ScrollIN on(){
        return instrumented(ScrollIN.class);
    }
}
