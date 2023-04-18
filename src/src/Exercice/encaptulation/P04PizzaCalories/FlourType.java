package Exercice.encaptulation.P04PizzaCalories;

public enum FlourType {
    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    White(1.5),
    Wholegrain(1.0)
    ;

    private double modifier;

    FlourType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
