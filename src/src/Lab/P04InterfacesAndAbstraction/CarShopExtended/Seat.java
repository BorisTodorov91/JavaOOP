package Lab.P04InterfacesAndAbstraction.CarShopExtended;

import Lab.P04InterfacesAndAbstraction.carShop.Car;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("%s sells for %f",getModel(), price));
        return sb.toString();
    }
}
