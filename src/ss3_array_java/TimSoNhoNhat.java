package ss3_array_java;

import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng của cột");
        int row = sc.nextInt();
        System.out.println("nhập số hàng của cột");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("nhập các phẩn tử của mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("số nhỏ nhất trong mảng là " + min);
    }
}
