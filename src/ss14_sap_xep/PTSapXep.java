package ss14_sap_xep;

import java.util.Arrays;

public class PTSapXep {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3};
        sapXepChen(arr);
    }

    public static int[] sapXepChen(int[] arr) {
        int value;

        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));

            }
            arr[j + 1] = value;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}

