package Exercice.ClassAndObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        for (int i = 1; i <=15; i++) {
            Cat tom = new Cat("Tom"+i, 12 + i);

            catList.add(tom);

        }

        for (Cat cat : catList) {
            System.out.println(cat.getName()  +" "+ cat.getAge());
        }
        System.out.println(Cat.getCount());

    }
}
