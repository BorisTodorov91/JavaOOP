package Lab.P03inheritance.Animal;

public class AfricanLion extends Lion{

    public AfricanLion(boolean male, int weight) {
        super(male, weight);

    }
    public String toString() {

        return String.format(

                "(AfricanLion, male: %s, weight: %s)",

                this.isMale(), this.getWeight() );
    }
}
