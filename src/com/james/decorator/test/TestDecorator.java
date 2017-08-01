package com.james.decorator.test;

import com.james.decorator.decorator.PizzaDecorator;
import com.james.decorator.decorator.SeafoodPizzaDecorator;
import com.james.decorator.decorator.SpicyPizzaDecorator;
import com.james.decorator.entity.Pizza;
import com.james.decorator.entity.SimplePizza;

/**
 * Created by fsuser on 2017-08-01.
 */
public class TestDecorator {

    public static void main(String[] argv){

        Pizza pizza=new SimplePizza();
        PizzaDecorator pizzaDecorator01=new SpicyPizzaDecorator(pizza);

        System.out.println(pizzaDecorator01.getName());
        System.out.println("the price is "+pizzaDecorator01.getPrice());

        PizzaDecorator pizzaDecorator02=new SeafoodPizzaDecorator(pizza);

        System.out.println(pizzaDecorator02.getName());
        System.out.println("the price is "+pizzaDecorator02.getPrice());
    }


}
