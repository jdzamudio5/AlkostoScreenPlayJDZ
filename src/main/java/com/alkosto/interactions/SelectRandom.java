package com.alkosto.interactions;
/*
 * @(#) SeleccionAleatoria.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;


import static com.alkosto.UI.SeleccionUI.LBL_NOMPROD;
import static com.alkosto.UI.SeleccionUI.LI_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class SelectRandom implements Interaction {

    /*public static WebElementFacade seleccionProducto(List<WebElementFacade> elementos){
        java.util.SelectRandom random= new java.util.SelectRandom();
        int indice= random.nextInt(elementos.size());

        return elementos.get(indice);
    }*/

    @Override
    public <T extends Actor> void performAs(T actor) {
        int i=1;
        while (actor.recall("produc"+i)!= null){
            i++;
        }
        List<WebElementFacade> listaProductos=LI_PRODUCTOS.resolveAllFor(actor);
        java.util.Random random=new java.util.Random();

        
        int indexRandom= random.nextInt(listaProductos.size());

        actor.remember("produc"+i, listaProductos.get(indexRandom).getText());
        listaProductos.get(indexRandom).click();
        while (actor.recall("produc"+i)==actor.recall("produc"+(i-1))){
            indexRandom=random.nextInt(listaProductos.size());
            actor.remember("produc"+i,listaProductos.get(indexRandom).getText());
            listaProductos.get(indexRandom).click();

        };


    }
    public static Performable click(){
        return instrumented(SelectRandom.class);
    }
}
