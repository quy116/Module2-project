package ss18_string_or_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");
        boolean flag = true;
        do {
            System.out.println("Nhập vào tên lớp học: ");
            String className = sc.nextLine();
            if(p.matcher(className).find()){
                System.out.println(className);
                flag = false;
            }else{
                System.err.println("Nhập sai vui lòng nhập lại");
            }
        }while (flag);
    }
}
