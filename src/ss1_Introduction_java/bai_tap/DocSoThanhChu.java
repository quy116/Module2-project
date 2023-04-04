package ss1_Introduction_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao");
        int input = sc.nextInt();
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] str = {"zero", "one", "two", "three", "for", "five", "six", "seven", "eight", "nine"};
        switch ((input + "").length()) {
            case 1:
                for (int i = 0; i <= number.length; i++) {
                    if (input == number[i]) {
                        System.out.println(str[i]);
                        break;
                    }
                }
            case 2:
                if (input == 10) {
                    System.out.println("ten");
                } else if (input == 11) {
                    System.out.println("eleven");
                } else if (input == 12) {
                    System.out.println("twelve");
                } else if (input == 13) {
                    System.out.println("thirteen");
                } else if (input == 15) {
                    System.out.println("fifteen");
                } else {
                    if (input > 10 && input < 20) {
                        for (int i = 0; i < input; i++) {
                            if (i == 5 || i == 3 || i == 2 || i == 1 || i == 0) {
                                continue;
                            }
                            if (input - 10 == number[i]) {
                                System.out.println(str[i] + "teen");
                                break;
                            }
                        }
                    }
                }
                if (input == 20) {
                    System.out.println("twenty");
                }
                if (input > 20 && input < 30) {
                    for (int i = 0; i < input; i++) {
                        if (input - 20 == number[i]) {
                            System.out.println("twenty " + str[i]);
                            break;
                        }
                    }
                }
                if (input == 30) {
                    System.out.println("thirty");
                }
                if (input > 30 && input < 100) {
                    for (int i = 0; i < number.length; i++) {
                        int change = input % 10;
                        int change2 = (input - change) / 10;
                        if (change == number[i]) {
                            System.out.print(str[change2] + "ty-" + str[change]);
                            break;
                        }
                    }
                }
            case 3:
                if (input == 100) {
                    System.out.println("one hundred");
                }
                int change3 = (input % 100) /10;
                int change = input % 100;
                int change2 = (input % 100) %10;
                int thayThe = input % 100;
                int thayThe2 = (input - thayThe) / 100;
                if (input > 100 && input < 110) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 110 && input < 200) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input == 200) {
                    System.out.println("two hundred");
                }
                if (input > 200 && input < 210) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 210 && input < 300) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input ==3200) {
                    System.out.println("two hundred");
                }
                if (input > 300 && input < 310) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 310 && input < 400) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 400 && input < 410) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 410 && input < 500) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 500 && input < 510) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 510 && input < 600) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 600 && input < 610) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 610 && input < 700) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 700 && input < 710) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 710 && input < 800) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 800 && input < 810) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 810 && input < 900) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
                if (input > 900 && input < 910) {
                    System.out.println(str[thayThe2] + " hundred " + str[change]);
                } else if (input > 910 && input < 1000) {
                    System.out.println(str[thayThe2] + " hundred " + str[change3] + "ty-" + str[change2]);
                }
        }

    }
}
