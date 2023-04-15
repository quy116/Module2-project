package ss11_stack_queue.change;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SoNhiPhan {
    public static void main(String[] args) {
        System.out.println("nhap so vao");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String numb = "";
        while (input > 0) {
            int nhiPhan = input % 2;
           numb = numb + nhiPhan;
            input /= 2;
        }
        System.out.println(numb);
    }
}
