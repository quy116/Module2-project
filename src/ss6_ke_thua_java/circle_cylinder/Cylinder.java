package ss6_ke_thua_java.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double theTich() {
        return this.height * getarea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +super.toString()+
                "height=" + height +
                '}';
    }
}
