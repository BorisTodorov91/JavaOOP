package Exercice.P03inheritance.speed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        SportCar sportCar = new SportCar(23.4, 12333);

        sportCar.drive(12);

        System.out.println(sportCar);
    }
}
