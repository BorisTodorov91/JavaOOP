package Exercice.encaptulation.P04PizzaCalories;

import java.util.Arrays;

public class Topping {

    private ToppingType toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        boolean toppingTypeDoesNotExist = Arrays.stream(ToppingType.values()).noneMatch(e -> e.name().equals(toppingType));
        if (toppingTypeDoesNotExist){
            String errorMessage = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(errorMessage);
        }
        this.toppingType = ToppingType.valueOf(toppingType);

    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50){
            String errorMassage = "Weight should be in the range [1..50].";
            throw new IllegalArgumentException( errorMassage);
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        return 2 * weight * this.toppingType.getModifier();
    }
}
