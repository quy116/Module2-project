package ss3_array_java;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] newArr = new int[arr.length  + arr2.length];
        int j = 0;
        System.out.println(newArr.length);
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            }
            newArr[i] = arr[i];
        }
        for (int k = arr.length; k < newArr.length; k++) {
            newArr[k] = arr2[j++];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
