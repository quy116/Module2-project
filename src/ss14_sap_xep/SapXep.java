package ss14_sap_xep;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        int value;

        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                arr[j+1] = arr[j];
                System.out.println(Arrays.toString(arr));

            }
            arr[j+1]=value;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
