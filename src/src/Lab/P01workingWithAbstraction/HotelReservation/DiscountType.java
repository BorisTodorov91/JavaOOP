package Lab.P01workingWithAbstraction.HotelReservation;

public enum DiscountType {
    VIP(20),
    SECONDVISIT(10),
    NONE(0)
    ;

    private double percent;

    DiscountType(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
