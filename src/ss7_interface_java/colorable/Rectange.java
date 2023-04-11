package ss7_interface_java.colorable;

public class Rectange extends Shape {
    private double width;
    private double height;

    public Rectange(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getChuVi() {
        return (this.height + this.width) * 2;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "dien tich ne"+getArea();
    }
}
