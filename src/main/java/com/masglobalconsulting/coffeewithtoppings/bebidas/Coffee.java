package com.masglobalconsulting.coffeewithtoppings.bebidas;

public class Coffee extends Bebida{

    @Override
    public double getPrecio() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
