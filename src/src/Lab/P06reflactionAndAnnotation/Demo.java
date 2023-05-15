package Lab.P06reflactionAndAnnotation;

import java.io.Serializable;

public class Demo implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo(String name) {
        this.name = name;
    }
    public Demo(String name,String firstname) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                '}';
    }
}
