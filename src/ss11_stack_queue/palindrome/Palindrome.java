package ss11_stack_queue.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> stack1 = new ArrayDeque<>();
        String str = "Able was I ere I saw Elba";
        String[] arr = str.split("");
        int count = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i].toLowerCase(Locale.ROOT));
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            stack1.add(arr[i].toLowerCase(Locale.ROOT));
        }
        System.out.println(stack.size());
        System.out.println(stack1);
        System.out.println(stack);
        int size = stack1.size();
        for (int i = 0; i < size; i++)
            if (stack.pop().equals(stack1.poll())) {
                count++;
            }
        System.out.println(count);
        if (count == str.length()) {
            System.out.println("đúng");
        } else {
            System.out.println("sai");
        }

    }
}
