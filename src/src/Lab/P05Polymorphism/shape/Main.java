package Lab.P05Polymorphism.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape rectangle = new Rectangle(23.1,23.1);

        System.out.println(rectangle.calculateArea());

        Shape circle = new Circle(12.3);

        System.out.println(circle.calculatePerimeter());


    }
}
