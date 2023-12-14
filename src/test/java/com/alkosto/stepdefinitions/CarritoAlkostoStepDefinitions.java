package com.alkosto.stepdefinitions;


import com.alkosto.questions.ValidarProductoQuestion;
import com.alkosto.tasks.AbrirNavegadorTasks;
import com.alkosto.tasks.BuscarSelecProdTask;
import com.alkosto.tasks.SeleccionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CarritoAlkostoStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @Before
    public void setupActor() {
        //WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
        theActorCalled("tester").can(
                BrowseTheWeb.with(driver)
        );
    }
    @Dado("que el Usuario abre el navegador e ingresa a la página Alkosto.com")
    public void queElUsuarioAbreElNavegadorEIngresaALaPáginaAlkostoCom() {
        theActorCalled("user").wasAbleTo(
                AbrirNavegadorTasks.on()
        );
    }
    @Cuando("busca un producto en la caja de texto")
    public void buscaUnProductoEnLaCajaDeTexto() {
        theActorInTheSpotlight().attemptsTo(
                BuscarSelecProdTask.on()
        );
    }
    @Cuando("selecciona dos productos de forma aleatoria al carrito de compras")
    public void seleccionaDosProductosDeFormaAleatoriaAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionTask.on()
                //DetallesProductos.on()
        );
    }
    @Entonces("podrá ver los productos seleccionados en el carrito de compras")
    public void podráVerLosProductosSeleccionadosEnElCarritoDeCompras() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarProductoQuestion.from(),
                        Matchers.equalTo(true)
                )

        );

    }

}
