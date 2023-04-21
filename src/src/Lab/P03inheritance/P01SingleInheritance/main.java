package Lab.P03inheritance.P01SingleInheritance;

public class main {
    public static void main(String[] args) {

        System.out.println("Dog can:");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        System.out.println("Puppy can:");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
        System.out.println("Cat can:");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
