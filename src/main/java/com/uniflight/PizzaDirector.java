package com.uniflight;

public class PizzaDirector {

    public Pizza makeClassicPizza(PizzaBuilder builder) {
        return builder
                .setSize("Medium")
                .setCrust("Classic")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Tomato")
                .addTopping("Basil")
                .build();
    }

    public Pizza makeSpicyPizza(PizzaBuilder builder) {
        return builder
                .setSize("Large")
                .setCrust("Thin")
                .setSauce("Spicy Tomato")
                .setCheese("Cheddar")
                .addTopping("Pepperoni")
                .addTopping("Jalapeno")
                .addTopping("Chili")
                .build();
    }
}
