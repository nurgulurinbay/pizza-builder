package com.uniflight;

public class Main {

    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        Pizza classicPizza = director.makeClassicPizza(
                new ClassicPizzaBuilder()
        );

        Pizza spicyPizza = director.makeSpicyPizza(
                new SpicyPizzaBuilder()
        );

        System.out.println("Classic Pizza:");
        System.out.println(classicPizza);

        System.out.println();

        System.out.println("Spicy Pizza:");
        System.out.println(spicyPizza);
    }
}