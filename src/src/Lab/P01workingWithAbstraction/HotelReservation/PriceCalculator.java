package Lab.P01workingWithAbstraction.HotelReservation;

public class PriceCalculator {

    public static double calculateHolidayPrice(double priceForDay, int numOfDay, Season season, DiscountType discountType){

        double calculateAllPrice = priceForDay * numOfDay;

        calculateAllPrice = calculateAllPrice * season.getCoefficient();
        calculateAllPrice = calculateAllPrice - ( calculateAllPrice * (discountType.getPercent() / 100));

        return calculateAllPrice;
    }
}
