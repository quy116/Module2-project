package ss3_array_java;

import java.util.Arrays;
import java.util.Scanner;

public class TinhDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng của cột");
        int row = sc.nextInt();
        System.out.println("nhập số phan tu của cột");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("nhap phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int sum2 = 0;
        int sum3= 0;
        System.out.println(arr[0][1]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == sum3) {
                    sum += arr[i][j];
                    System.out.println(sum);
                }
            }
            sum3++;
        }

    }
}
