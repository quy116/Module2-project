package ss4_method_java;

import java.util.Scanner;

public class TimNamNhuan {
    public static boolean checkYear (int year){

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        checkYear(year);
        System.out.println(checkYear(year));
    }
}
