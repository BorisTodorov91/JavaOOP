package Lab.P05Polymorphism.animal;

public class Dog extends Animal{

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf()+ "DJAAF";
    }
}
