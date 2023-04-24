package Lab.P04InterfacesAndAbstraction.sayHello;

public class Bulgarian implements Person{
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHallo() {
        return "Здравей";
    }
}
