package ss3_array_java;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9};
        int[] newArr = new int[arr.length - 1];
        System.out.println("nhập vào phần tử  muốn xoá");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int q = 0; q < arr.length; q++) {
                    if (arr[q] != number) {
                        newArr[j++] = arr[q];
                    }
                }
                for (int e = 0; e < newArr.length; e++) {
                    System.out.print(newArr[e] + " ");
                }

            } else {
                count++;
            }
        }
        if (count == arr.length) {
            System.out.println("không có trong mảng");

        }
    }

}

