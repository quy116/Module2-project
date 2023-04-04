package ss1_Introduction_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do vao");
        double doLa = sc.nextDouble();
        double vnd = 23000;
        double result = doLa * vnd;
        System.out.println("so tien duoc doi ra VND la :"+result);

    }
}
