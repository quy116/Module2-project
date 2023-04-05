package ss4_method_java;

import java.util.Scanner;

public class TimChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao");
        int number = sc.nextInt();
        if (TimChanLe.check(number)) {
            System.out.println("la so chan");
        } else {
            System.out.println("la so le");
        }
    }
    public static boolean check (int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}
