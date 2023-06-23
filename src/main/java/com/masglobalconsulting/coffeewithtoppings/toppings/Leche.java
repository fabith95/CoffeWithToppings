package com.masglobalconsulting.coffeewithtoppings.toppings;

import com.masglobalconsulting.coffeewithtoppings.bebidas.Bebida;

public class Leche extends Toppings{

    public Leche(Bebida bebida){
        this.bebida = bebida;
    }
    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 1;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + " con leche";
    }
}
