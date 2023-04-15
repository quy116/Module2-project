package ss11_stack_queue.dao_nguoc_mang;

import java.util.Scanner;
import java.util.Stack;

public class dao_nguoc_mang {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon nhap bao nhieu so phan su cua mang?");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("nhap phan tu " + i);
            int element = sc.nextInt();
            stack.push(element);
        }
        System.out.println(stack);
        Stack<Integer> newStack = new Stack<Integer>();
        for (int i = input-1; i >= 0; i--) {
            int element = stack.get(i);
            newStack.push(element);
        }
        System.out.println(newStack);
    }
}
