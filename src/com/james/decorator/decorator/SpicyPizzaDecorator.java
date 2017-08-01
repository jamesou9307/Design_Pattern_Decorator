package com.james.decorator.decorator;

import com.james.decorator.entity.Pizza;


/**
 * Created by fsuser on 2017-08-01.
 */
public class SpicyPizzaDecorator extends PizzaDecorator{


    public SpicyPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+10;
    }

    @Override
    public String getName() {
        return "this is a spicyPizza";
    }
}
