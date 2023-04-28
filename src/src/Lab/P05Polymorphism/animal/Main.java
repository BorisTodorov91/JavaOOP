package Lab.P05Polymorphism.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal cat = new Cat("Tom", "Fish");
        Animal dog = new Dog("Rex", "Meat");
        println(cat);
        println(dog);
    }

    private static void println(Animal animal) {
        System.out.println(animal.explainSelf());
    }
}
