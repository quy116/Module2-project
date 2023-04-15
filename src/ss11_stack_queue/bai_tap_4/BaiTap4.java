package ss11_stack_queue.bai_tap_4;

import java.util.Arrays;
import java.util.Stack;

public class BaiTap4 {
    public static void main(String[] args) {
        String str = "a*(b-c(s+b))";
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String[] strings = str.split("");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("(")) {
                stack.push(strings[i]);
            } else if (strings[i].equals(")")) {
                stack1.push(strings[i]);
            }
        }
        if (stack.size()==stack1.size()) {
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
    }
}
