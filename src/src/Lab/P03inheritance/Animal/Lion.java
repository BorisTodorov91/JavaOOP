package Lab.P03inheritance.Animal;

public class Lion extends Feliade{
    private int weight;


    public Lion(boolean male, int weight) {
        super(male);
        setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }
}
