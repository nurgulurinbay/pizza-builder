package com.uniflight;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePizzaBuilder implements PizzaBuilder {

    protected String size;
    protected String crust;
    protected String sauce;
    protected String cheese;
    protected final List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    protected Pizza createPizza() {
        return new Pizza(
                size,
                crust,
                sauce,
                cheese,
                toppings
        );
    }
}