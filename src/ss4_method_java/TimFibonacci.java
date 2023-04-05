package ss4_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class TimFibonacci {
    public static void fibonacci (int number){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < number; i++) {
            c = a + b;
            if (c >=100) {
                break;
            }
            System.out.print(" " + c);
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        int number = 100;
        fibonacci(number);
    }
}
