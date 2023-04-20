package Lab.inheritance;

public class demo {
    static class Vehicle{

        private double speed;

        public void stop (){
            speed = 0;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
    }
    static class Car extends Vehicle{
        boolean parkingBreakOn;
    }

    public static void main(String[] args) {


        Vehicle vehicle = new Car();
        double speed = vehicle.getSpeed();
        System.out.println(speed);

    }
}
