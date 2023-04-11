package ss7_interface_java.colorable;

public class Square extends Shape implements IColorable {
    private double canh;

    public Square(String color, boolean filled, double canh) {
        super(color, filled);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }
    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double dienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                "canh=" + canh + "dien tich" + dienTich()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
