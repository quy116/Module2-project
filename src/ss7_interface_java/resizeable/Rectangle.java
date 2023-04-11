package ss7_interface_java.resizeable;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
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

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getChuVi() {
        return (this.height + this.width) *2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString()+
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ",  chu vi =" + getChuVi() +
                '}'+"\n";
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight()+getHeight()*percent/100);
        setWidth(getWidth()+getWidth()*percent/100);
    }
}

