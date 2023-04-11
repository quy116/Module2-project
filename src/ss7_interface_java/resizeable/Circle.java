package ss7_interface_java.resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
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
        return "Circle{" + super.toString()+
                "radius=" + radius +
                "area=" + getArea() +
                '}'+"\n";
    }


    @Override
    public void resize(double percent) {
        setRadius(getRadius()+getRadius()*percent/100);
    }
}
