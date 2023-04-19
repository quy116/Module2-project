package bai_tap_lam_them.quan_ly_cong_viec.controller;

import bai_tap_lam_them.quan_ly_cong_viec.model.Spend;
import bai_tap_lam_them.quan_ly_cong_viec.service.SpanSv;

import java.util.Scanner;

public class SpendManager {
    Scanner scanner = new Scanner(System.in);
    SpanSv spanSv = new SpanSv();
    public void display() {
        System.out.println("quản lý công việc");
        boolean flag = true;
        do {
            System.out.println("mời nhập lựa chọn\n" +
                    "1. thêm\n" +
                    "2. sửa \n" +
                    "3. tìm tên\n" +
                    "4. xoá\n" +
                    "5. hiển thị thông tin\n" +
                    "0. exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    spanSv.inputSpand();
                    break;
                case 2:
                    spanSv.editSpan();
                    break;
                case 3:
                    spanSv.findNameSpan();
                    break;
                case 4:
                    spanSv.deleteSpand();
                    break;
                case 5:
                    spanSv.display();
                case 0:
                    flag = false;
                    break;
                default:
                    break;
            }
        }while (flag);
    }
}
