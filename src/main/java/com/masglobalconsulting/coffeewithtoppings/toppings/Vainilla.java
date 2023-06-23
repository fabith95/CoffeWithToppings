package com.masglobalconsulting.coffeewithtoppings.toppings;

import com.masglobalconsulting.coffeewithtoppings.bebidas.Bebida;

public class Vainilla extends Toppings{

    public Vainilla(Bebida bebida){
        this.bebida = bebida;
    }
    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 3;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + " con vainilla";
    }
}
