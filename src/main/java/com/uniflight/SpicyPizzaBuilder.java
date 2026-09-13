package com.uniflight;

public class SpicyPizzaBuilder extends BasePizzaBuilder {

    @Override
    public Pizza build() {
        if (size == null) {
            size = "Large";
        }

        if (crust == null) {
            crust = "Thin";
        }

        if (sauce == null) {
            sauce = "Spicy Tomato";
        }

        if (cheese == null) {
            cheese = "Cheddar";
        }

        return createPizza();
    }
}