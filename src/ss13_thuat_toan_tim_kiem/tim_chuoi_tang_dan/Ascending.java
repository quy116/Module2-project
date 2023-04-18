package ss13_thuat_toan_tim_kiem.tim_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi");
        String str = sc.nextLine();
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (stack.getLast() < str.charAt(j)) {
                    stack.add(str.charAt(j));
                }
            }
            break;
        }
        System.out.println(stack);
    }
}
