package Lab.P05Polymorphism.shape;

public class Circle implements Shape{
    private Double	radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double calculateArea() {
        return 2 * Math.PI * radius;
    }
}
