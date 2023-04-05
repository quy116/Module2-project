package ss4_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class TinhUoc {
    public static void findUoc(int a,int b) {
        int[] result = new int[b];
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                result[count] = i;
                count++;

            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        findUoc(number,count);
    }
}
