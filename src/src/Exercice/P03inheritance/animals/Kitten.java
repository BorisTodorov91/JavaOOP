package Exercice.P03inheritance.animals;

import Exercice.P03inheritance.speed.Car;

public class Kitten  extends Cat {
    public Kitten(String name, int age) {
        super(name, age, "Female");
    }
    public String produceSound(){
        return "Meow";
    }
}
