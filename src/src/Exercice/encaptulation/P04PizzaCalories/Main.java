package Exercice.encaptulation.P04PizzaCalories;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int numOfTopping = Integer.parseInt(pizzaInfo[2]);

        String[] doughtyInfo = scanner.nextLine().split(" ");
        String flourType = doughtyInfo[1];
        String bakingTech = doughtyInfo[2];
        int weight = Integer.parseInt(doughtyInfo[3]);


        String command = scanner.nextLine();
        try {

            Pizza pizza = new Pizza(pizzaName, numOfTopping);
            Dough dough = new Dough(flourType, bakingTech, weight);
            while (!"END".equals(command)){
                String[] toppingInfo = command.split(" ");
                String toppingType = toppingInfo[1];
                int toppyngWeight = Integer.parseInt(toppingInfo[2]);
                Topping topping = new Topping(toppingType, toppyngWeight);
                pizza.setDough(dough);
                pizza.addTopping(topping);
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
