package ss3_array_java;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {1,2,3,4},
                {2,3,3,5},
        };
        System.out.println("bạn muốn tính tổng cột nào");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (input == i) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng của cột "+input+" là "+sum);
    }
}
