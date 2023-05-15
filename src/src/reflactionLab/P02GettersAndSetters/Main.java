package reflactionLab.P02GettersAndSetters;

import reflactionLab.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Method[] declaredMethods = Reflection.class.getDeclaredMethods();

        // getters
        Method[] getter = Arrays.stream(declaredMethods).filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Arrays.stream(getter).forEach( m ->
                        System.out.printf("%s will return class %s%n",  m.getName(), m.getReturnType().getName())
                );
        // setter
        Method[] sets = Arrays.stream(declaredMethods).filter(m -> m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);
        Arrays.stream(sets).forEach(m -> System.out.printf("%s and will set field of class %s%n", m.getName(), m.getParameterTypes()));

    }
}
