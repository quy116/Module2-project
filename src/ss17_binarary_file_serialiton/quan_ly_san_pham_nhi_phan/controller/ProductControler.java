package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.controller;

import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.service.ProducSv;

import java.util.Scanner;

public class ProductControler {
    ProducSv producSv = new ProducSv();
    public void display() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1. thêm san pham vào \n" +
                    "2. tim san pham\n" +
                    "3. hiển thị thông tin\n" +
                    "0. thoát");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                 producSv.addProductSv();
                    break;
                case 2:
                producSv.findProductSv();
                    break;
                case 3:
                producSv.displayProductSv();
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
