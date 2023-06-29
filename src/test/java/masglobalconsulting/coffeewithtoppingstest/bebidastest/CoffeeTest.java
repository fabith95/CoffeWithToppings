package masglobalconsulting.coffeewithtoppingstest.bebidastest;

import com.masglobalconsulting.coffeewithtoppings.bebidas.Bebida;
import com.masglobalconsulting.coffeewithtoppings.bebidas.Coffee;
import com.masglobalconsulting.coffeewithtoppings.toppings.Leche;
import com.masglobalconsulting.coffeewithtoppings.toppings.Mocca;
import com.masglobalconsulting.coffeewithtoppings.toppings.Vainilla;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {

    @Test
    void createdCoffee(){
        Coffee coffee = new Coffee();
        Assertions.assertThat(coffee).isNotNull();
        Assertions.assertThat(coffee.getPrecio()).isEqualTo(5);
        Assertions.assertThat(coffee.getDescription().equals("coffee"));
    }

    @Test
    void canCreateCoffeeWithToppings(){
        Bebida bebida = new Coffee();
        bebida = new Leche(bebida);
        bebida = new Mocca(bebida);
        bebida = new Vainilla(bebida);
        Assertions.assertThat(bebida.getPrecio()).isEqualTo(11);
    }

}
