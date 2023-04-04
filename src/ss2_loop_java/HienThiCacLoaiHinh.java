package ss2_loop_java;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("nhap so ban muon chon :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = -1; j < i; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                case 4:
                    System.out.println("ban thoat ra");
                    break;
            }
    }
}
