package ss10_danh_sach_java.quan_ly_san_pham.service;

import ss10_danh_sach_java.quan_ly_san_pham.model.Product;
import ss10_danh_sach_java.quan_ly_san_pham.repo.Repo;

import java.util.Scanner;

public class ProductSv implements IProductSv {
    Repo repo = new Repo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("nhập ID vào");
        String inputId = sc.nextLine();
        System.out.println("nhập tên sản phẩm  vào");
        String inputName = sc.nextLine();
        System.out.println("nhập giá tiền  vào");
        double inputPrice = sc.nextDouble();
        Product product = new Product(inputId,inputName,inputPrice);
        repo.addProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.println("nhập ID vào để sửa");
        String inputId = sc.nextLine();
        boolean edit = repo.editProduct(inputId);
        if (edit) {
            System.out.println("đã sưửa thành công");
        } else {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("nhập ID sản phẩm bạn muốn xoá");
        String inputId = sc.nextLine();
        boolean delete = repo.deleteProductById(inputId);
        if (delete) {
            System.out.println("đã xoá thaành công");
        }else {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void findProduct() {
        System.out.println("nhập tên sản phẩm cần tìm");
        String inputName = sc.nextLine();
        boolean findName = repo.findProduct(inputName);
        if (findName) {
            System.out.println("đã tìm thấy");
        } else {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void display() {
        repo.displayProduct();
    }
}
