package com.james.decorator.decorator;

import com.james.decorator.entity.Pizza;
;

/**
 * Created by fsuser on 2017-08-01.
 */
public abstract class PizzaDecorator extends Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
