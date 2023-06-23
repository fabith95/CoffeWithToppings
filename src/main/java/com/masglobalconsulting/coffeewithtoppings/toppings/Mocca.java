package com.masglobalconsulting.coffeewithtoppings.toppings;

import com.masglobalconsulting.coffeewithtoppings.bebidas.Bebida;

public class Mocca extends Toppings{

    public Mocca(Bebida bebida){
        this.bebida = bebida;
    }
    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 2;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + " con mocca";
    }
}
