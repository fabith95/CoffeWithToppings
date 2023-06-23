package com.masglobalconsulting;

import com.masglobalconsulting.coffeewithtoppings.bebidas.Bebida;
import com.masglobalconsulting.coffeewithtoppings.bebidas.Coffee;
import com.masglobalconsulting.coffeewithtoppings.toppings.Leche;
import com.masglobalconsulting.coffeewithtoppings.toppings.Mocca;
import com.masglobalconsulting.coffeewithtoppings.toppings.Vainilla;

public class Main {
    public static void main(String[] args) {

        Bebida bebida = new Coffee();
        bebida = new Mocca(bebida);
        bebida = new Vainilla(bebida);
        System.out.println(bebida.getDescription() + " su costo es: " + bebida.getPrecio());

    }
}