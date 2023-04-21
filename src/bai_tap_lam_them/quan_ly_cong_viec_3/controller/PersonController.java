package bai_tap_lam_them.quan_ly_cong_viec_3.controller;

import bai_tap_lam_them.quan_ly_cong_viec_3.repository.PersonRepo;
import bai_tap_lam_them.quan_ly_cong_viec_3.service.PersonSv;

import java.util.Scanner;

public class PersonController {
    PersonSv personSv = new PersonSv();

    public void display() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1. thêm người vào \n" +
                    "2. sửa thông tin \n" +
                    "3. xoá thông tin \n" +
                    "4. hiển thị thông tin\n" +
                    "0. thoát");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    personSv.addPerson();
                    break;
                case 2:
                    personSv.editPerson();
                    break;
                case 3:
                    personSv.deletePerson();
                    break;
                case 4:
                    personSv.displayPerson();
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("nhập không đúng");
                    break;
            }
        } while (check);
    }

}
