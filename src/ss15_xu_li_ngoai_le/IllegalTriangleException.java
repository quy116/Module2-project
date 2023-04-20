package ss15_xu_li_ngoai_le;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao canh a");
        double a = sc.nextDouble();
        System.out.println("nhap vao canh b");
        double b = sc.nextDouble();
        System.out.println("nhap vao canh c");
        double c = sc.nextDouble();
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        try {
            illegalTriangleException.iiillegalTriangleException(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String str) {
        super(str);
    }


    public void iiillegalTriangleException(double a, double b, double c) throws IllegalTriangleException {

        if (a + b < c || b + c < a || c + a < b || c < 0 || b < 0 || a < 0) {
            throw new IllegalTriangleException("false");
        } else {
            System.out.println("true");
        }
    }
}
