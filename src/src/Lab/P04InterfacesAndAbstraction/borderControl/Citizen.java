package Lab.P04InterfacesAndAbstraction.borderControl;

public class Citizen extends IdentifiableImpl {
    private String name;
    private int age;



    public Citizen(String id, int age,String name) {
        super(id);
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
