package Exercice.ClassAndObject;

public class Cat {

    private String name;
    private int age;
    private static int count;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount(){
        return count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
