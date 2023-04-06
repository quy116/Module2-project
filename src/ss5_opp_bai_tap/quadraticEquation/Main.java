package ss5_opp_bai_tap.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a vào");
        double a = sc.nextDouble();
        System.out.println("nhập b vào");
        double b = sc.nextDouble();
        System.out.println("nhập c vào");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot2());
        }else {
            System.out.println("“The equation has no roots”");
        }
    }
}
