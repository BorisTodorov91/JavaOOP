package Lab.P04InterfacesAndAbstraction.sayHelloExtended;

import Lab.P04InterfacesAndAbstraction.sayHello.Person;

public abstract class BasePerson implements Person {
        private String name;

    public BasePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
