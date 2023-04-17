package ss10_danh_sach_java.quan_ly_san_pham.controller;

import ss10_danh_sach_java.quan_ly_san_pham.service.ProductSv;

import java.util.Scanner;

public class MenuProduct {
    Scanner sc = new Scanner(System.in);
    ProductSv productSv = new ProductSv();

    public void productManager() {
        System.out.println("quản lý sản phẩm");
        boolean flag = true;
        do {
            System.out.println("mời nhập lựa chọn\n" +
                    "1. thêm\n" +
                    "2. sửa \n" +
                    "3. tìm tên\n" +
                    "4. xoá\n" +
                    "5. hiển thị thông tin sản phẩm\n" +
                    "0. exit");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    productSv.addProduct();
                    break;
                case 2:
                    productSv.editProduct();
                    break;
                case 3:
                    productSv.findProduct();
                    break;
                case 4:
                    productSv.deleteProduct();
                    break;
                case 5:
                    productSv.display();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("không có số trên");
            }
        } while (flag);
    }
}
