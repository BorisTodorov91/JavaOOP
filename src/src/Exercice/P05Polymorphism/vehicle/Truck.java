package Exercice.P05Polymorphism.vehicle;

public class Truck extends Vehicle{

    public final static double AC_ADDITIONAL_COMPULSION = 1.6;
    public final static double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_COMPULSION);
    }

    public void refuel(double liters) {
         super.refuel(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }
}
