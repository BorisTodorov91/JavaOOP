package Lab.P04InterfacesAndAbstraction.sayHelloExtended;

public class European extends BasePerson {

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHallo() {
        return "Hallo";
    }
}
