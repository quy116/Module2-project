package ss3_array_java;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 15, 2, 3, 9, 5, 6, 6, 8, 9};
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("nhập vị trí muốn thêm");
        int input = sc.nextInt();
        System.out.println("nhập số của để đổi");
        int number = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == input) {
                newArr[i] = number;
            }
            if (i >= input) {
                newArr[i + 1] = arr[i];
            }
            if (i < input) {
                newArr[i] = arr[i];
            }
        }
        for (int a : newArr) {
            System.out.print(a + " ");
        }
    }
}
