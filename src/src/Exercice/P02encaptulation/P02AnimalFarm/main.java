package Exercice.P02encaptulation.P02AnimalFarm;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
