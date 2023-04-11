package ss7_interface_java.colorable;


public class test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Cricle("red", true, 1);
        arr[1] = new Rectange("blue", true, 1, 1);
        arr[2] = new Square("blue", true, 1);
        for (Shape e : arr) {
            if (e instanceof IColorable){
                ((Square) e).howToColor();
            } else {
                System.out.println(e.toString());
            }
        }
    }
}
