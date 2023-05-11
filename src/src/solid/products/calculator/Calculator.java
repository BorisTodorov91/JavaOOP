package solid.products.calculator;

import solid.products.product.Product;

import java.util.List;

public interface Calculator {

    double total(List<Product> products);
    double average(List<Product> products);
}
