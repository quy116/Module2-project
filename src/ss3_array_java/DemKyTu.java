package ss3_array_java;

import java.util.Arrays;
import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi kí tự");
        String str = sc.nextLine();
        String[] strArr = str.split("");
        System.out.println(Arrays.toString(strArr));
        System.out.println("nhập vào ký tự cần tìm");
        String str1 = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
              if (strArr[i].equals(str1)) {
                  sum++;
            }
        }
        System.out.println("số lầ kí tự xuất hiền là:" + sum);

    }
}
