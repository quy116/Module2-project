package ss13_thuat_toan_tim_kiem.de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class DeQuy {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử vào");
            int input = sc.nextInt();
            arr[i] = input;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,0,arr.length-1,4 ));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (arr[middle] == value) {
            return middle;
        }
        if (value > arr[middle]) {
            return binarySearch(arr,middle+1,right,value);
        }
        if (value <arr[middle]){
            return binarySearch(arr,left,middle-1,value);
        }
        return 1;
    }
}
