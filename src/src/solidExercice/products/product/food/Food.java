package solidExercice.products.product.food;

import solidExercice.products.product.Product;

public abstract class Food implements Product {

    private double grams;
    private double caloriesPer100Grams;

    public Food(double grams, double caloriesPer100Grams) {
        this.grams = grams;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    @Override
    public double getCalories() {
        return (caloriesPer100Grams / 100) * grams;
    }
}
