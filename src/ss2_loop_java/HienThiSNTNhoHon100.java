package ss2_loop_java;

import java.util.Scanner;

public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countSNT = 0;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (i < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countSNT++;
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}
