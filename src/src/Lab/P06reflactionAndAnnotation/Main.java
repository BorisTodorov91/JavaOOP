package Lab.P06reflactionAndAnnotation;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Class<Demo> demoClass = Demo.class;

        Constructor<?>[] constructors = demoClass.getConstructors();
        System.out.println(constructors);
    }
}
