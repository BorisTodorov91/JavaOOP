package Lab.P04InterfacesAndAbstraction.carShop;

public class Seat implements Car{
    private String name;
    private  String color;
    private  Integer horsePower;
    private String countryProduced;

    public Seat(String name, String color, int horsePower, String countryProduced) {
        this.name = name;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return name;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", getModel(), countryProduced(), Car.TIERS);
    }
}
