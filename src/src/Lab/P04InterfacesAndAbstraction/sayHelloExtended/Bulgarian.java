package Lab.P04InterfacesAndAbstraction.sayHelloExtended;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHallo() {
        return "Здравей";
    }
}
