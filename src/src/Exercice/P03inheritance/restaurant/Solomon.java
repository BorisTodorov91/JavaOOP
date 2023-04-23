package Exercice.P03inheritance.restaurant;

import java.math.BigDecimal;

public class Solomon extends MainDIsh{
    public final static double SALMON_GRAMS = 22.0;


    public Solomon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);

    }
}
