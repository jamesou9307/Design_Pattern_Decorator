package com.james.decorator.entity;


/**
 * Created by fsuser on 2017-08-01.
 */
public class SimplePizza extends Pizza{

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
