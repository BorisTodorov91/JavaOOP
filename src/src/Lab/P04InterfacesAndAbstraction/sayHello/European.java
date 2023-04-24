package Lab.P04InterfacesAndAbstraction.sayHello;

public class European  implements Person{

    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHallo() {
        return "Hallo";
    }
}
