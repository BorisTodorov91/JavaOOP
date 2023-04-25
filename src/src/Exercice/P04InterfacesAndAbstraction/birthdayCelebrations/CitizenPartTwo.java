package Exercice.P04InterfacesAndAbstraction.birthdayCelebrations;

public class CitizenPartTwo implements Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;

    public CitizenPartTwo(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }
}
