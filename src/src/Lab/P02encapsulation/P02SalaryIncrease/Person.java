package Lab.P02encapsulation.P02SalaryIncrease;

public class Person {

    //•	firstName: String
    //•	lastName: String
    //•	age: int
    //•	toString() - override

    private  String firstName;
    private String lastName;
    private int age;
    private  double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary()
        );
    }

    public void increaseSalary(double bonus) {

        if (this.getAge() < 30){
            this.setSalary( this.getSalary() + (this.getSalary() * bonus / 200));
        }else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }
    }
}
