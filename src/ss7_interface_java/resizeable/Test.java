package ss7_interface_java.resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle("red", true, 4);
        arr[1] = new Square("red", true, 4);
        arr[2] = new Rectangle("red", true, 4,5);
        System.out.println("truoc khi thay doi");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i].resize(100);
        }
        System.out.println("sau khi thay doi");
        for (Shape qwe:arr) {
            System.out.println(qwe);
        }
    }

}
