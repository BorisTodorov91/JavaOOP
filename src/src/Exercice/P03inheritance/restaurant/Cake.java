package Exercice.P03inheritance.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    public final static double CAKE_GRAMS = 250;
    public final static double CAKE_CALORIES = 1000;
    public final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name, int price, double grams, double calories) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }

}
