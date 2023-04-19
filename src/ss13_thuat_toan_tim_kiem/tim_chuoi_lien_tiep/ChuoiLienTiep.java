package ss13_thuat_toan_tim_kiem.tim_chuoi_lien_tiep;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiep {
    public static void main(String[] args) {
        System.out.println("nhập 1 chuỗi vào");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> linkedList2 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (linkedList2.size() >= 1 && str.charAt(i) <= linkedList2.getLast()) {
                linkedList2.clear();
            }
            linkedList2.add(str.charAt(i));
            if (linkedList2.size() > linkedList.size()) {
                linkedList.clear();
                linkedList.addAll(linkedList2);
            }
        }
        for (Character ch : linkedList) {
            System.out.println(ch);
        }

    }
}
