package Exercice.P05Polymorphism.vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = litersPerKm;
    }

    public  String drive(double distance){

        double fuelNeed = distance * this.getFuelConsumption();

        if(fuelNeed > getFuelQuantity()){
            return  this.getClass().getSimpleName() + "needs to refueling";
        }
        setFuelConsumption(getFuelQuantity() - fuelNeed);
        DecimalFormat df = new DecimalFormat("##.##");

        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));

    }

    public void refuel(double liters){
        this.fuelQuantity += liters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), fuelQuantity);
    }
}
