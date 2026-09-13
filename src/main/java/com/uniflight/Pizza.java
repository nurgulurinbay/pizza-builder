package com.uniflight;

import java.util.List;

public class Pizza {
    private final String size;
    private final String crust;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    public Pizza(
            String size,
            String crust,
            String sauce,
            String cheese,
            List<String> toppings
    ) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = List.copyOf(toppings);
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}