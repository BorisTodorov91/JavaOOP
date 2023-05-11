package solid;

import solid.products.calculator.Calculator;
import solid.products.calculator.CalorieCalculator;
import solid.products.product.Product;
import solid.products.product.drink.Coke;
import solid.products.product.drink.Drink;
import solid.products.product.drink.Lemonade;
import solid.products.product.food.Chips;
import solid.products.product.food.Chocolate;
import solid.products.product.food.Food;

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
