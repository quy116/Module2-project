package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.service;

import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model.Product;
import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProducSv implements IProductSv{
    Scanner sc = new Scanner(System.in);
    ProductRepo productRepo = new ProductRepo();



    @Override
    public void addProductSv() {
        System.out.println("nhap id");
        String inputId = sc.nextLine();

        System.out.println("nhap name");
        String inputName = sc.nextLine();

        System.out.println("nhap price");
        String inputPrice = sc.nextLine();

        System.out.println("nhap hang~");
        String inputHang = sc.nextLine();

        System.out.println("nhap mo ta");
        String inputComment = sc.nextLine();

        Product product = new Product(inputId,inputName,inputPrice,inputHang,inputComment);
        List<Product> product1 = productRepo.addProduct(product);
    }

    @Override
    public void findProductSv() {
        System.out.println("nhap id de tim san pham");
        String inputId = sc.nextLine();
        productRepo.findProduct(inputId);
    }

    @Override
    public void displayProductSv() {
    productRepo.displayProduct();
    }
}
