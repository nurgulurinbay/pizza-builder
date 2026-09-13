package com.uniflight;

public class ClassicPizzaBuilder extends BasePizzaBuilder {

    @Override
    public Pizza build() {
        if (size == null) {
            size = "Medium";
        }

        if (crust == null) {
            crust = "Classic";
        }

        if (sauce == null) {
            sauce = "Tomato";
        }

        if (cheese == null) {
            cheese = "Mozzarella";
        }

        return createPizza();
    }
}