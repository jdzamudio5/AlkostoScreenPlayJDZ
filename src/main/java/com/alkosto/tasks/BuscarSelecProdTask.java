package com.alkosto.tasks;

import com.alkosto.interactions.Esperas;
import com.alkosto.interactions.SelectRandom;
import com.alkosto.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.alkosto.UI.BuscarUI.BTN_COOKIES;
import static com.alkosto.UI.BuscarUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class
BuscarSelecProdTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperas.on(),
                Click.on(BTN_COOKIES),
                Click.on(TXT_BUSCAR),
                Enter.theValue(Data.extractTo().get(0).get("Producto")).into(TXT_BUSCAR).thenHit(Keys.ENTER)


        );



    }
    public static BuscarSelecProdTask on(){

        return instrumented(BuscarSelecProdTask.class);
    }


    }

