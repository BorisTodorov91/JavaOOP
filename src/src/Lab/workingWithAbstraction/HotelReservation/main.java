package Lab.workingWithAbstraction.HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int numOfDay = Integer.parseInt(input[1]);

        Season season = Season.valueOf(input[2].toUpperCase());

        DiscountType discountType = DiscountType.valueOf(input[3].toUpperCase());

        double total = PriceCalculator.calculateHolidayPrice(pricePerDay,numOfDay,season,discountType);
        System.out.printf("%.2f", total);

    }
}
