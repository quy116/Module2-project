package ss4_method_java;

import java.util.Scanner;

public class CheckSNT {
    public static boolean checkSNT (int number) {
        if (number < 2 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao de kiem tra SNT");
        int number = sc.nextInt();
        System.out.println(CheckSNT.checkSNT(number));
    }
}
