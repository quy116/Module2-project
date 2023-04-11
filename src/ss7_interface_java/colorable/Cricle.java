package ss7_interface_java.colorable;

public class Cricle extends Shape {
    private double radius;

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "dien tich" + getArea();
    }
}
