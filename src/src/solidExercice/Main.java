package solidExercice;

import solidExercice.products.calculator.Calculator;
import solidExercice.products.calculator.CalorieCalculator;
import solidExercice.products.product.Product;
import solidExercice.products.product.food.Chips;
import solidExercice.products.product.food.Chocolate;
import solidExercice.products.product.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Calculator calculator = new CalorieCalculator();

        Food food = new Chips(123);
        Food food1 = new Chocolate(156);
        List<Product> productList = new ArrayList<>();
        productList.add(food);
        productList.add(food1);

        System.out.println(calculator.total(productList));
    }
}
