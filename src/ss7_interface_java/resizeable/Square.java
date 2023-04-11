package ss7_interface_java.resizeable;

public class Square extends Shape implements IResizeable{
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
                "canh=" + canh + "dien tich =" + dienTich()+
                '}'+"\n";
    }


    @Override
    public void resize(double percent) {
        setCanh(getCanh()+getCanh() * percent/100);
    }
}
