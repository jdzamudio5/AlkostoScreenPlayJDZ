package com.alkosto.tasks;

import com.alkosto.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegadorTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(Data.extractTo().get(0).get("Pagina"))

        );

    }



    public static AbrirNavegadorTasks on(){
        return instrumented(AbrirNavegadorTasks.class);
    }
}
