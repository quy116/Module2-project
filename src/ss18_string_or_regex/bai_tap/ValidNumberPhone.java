package ss18_string_or_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidNumberPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^\\((84)\\)-[0-9]{10}$");
        boolean flag = true;
        do {
            System.out.println("Nhập vào số điện thoại: ");
            String numberPhone = sc.nextLine();
            if(p.matcher(numberPhone).find()){
                System.out.println(numberPhone);
                flag = false;
            }else{
                System.err.println("Nhập sai vui lòng nhập lại");
            }
        }while (flag);
    }
}
