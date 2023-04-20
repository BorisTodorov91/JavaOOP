package Exercice.P02encaptulation.P04PizzaCalories;

import java.util.Arrays;

public class Dough {
    //-	flourType: String
    //-	bakingTechnique: String
    //-	weight: double

    //+ 	Dought (String, String, double)
    //-	setWeight(double): void
    //-	setFlourType(String): void
    //-	setBakingTechnique(String): void
    //+	calculateCalories (): double

    private FlourType flourType;
    private BakingTechnique bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        boolean flourTypeDoesNotExist = Arrays.stream(FlourType.values()).noneMatch(e -> e.name().equals(flourType));

        if(flourTypeDoesNotExist){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = FlourType.valueOf(flourType);
    }

    private void setBakingTechnique(String bakingTechnique) {

        boolean bakingTypeDoesNotExist = Arrays.stream(BakingTechnique.values()).noneMatch(e -> e.name().equals(bakingTechnique));
        if (bakingTypeDoesNotExist){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique);
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){

        return  (2 * this.weight) * this.flourType.getModifier() * this.bakingTechnique.getModifier();
    }
}
