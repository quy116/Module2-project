package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.repository;

import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.common.ReadProduct;
import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.common.WriteProduct;
import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepo implements IProductRepo {
    WriteProduct writeProduct = new WriteProduct();
    Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        Product product = new Product("001", "macbook", "2000", "apple", "ngon");
        productList.add(product);
        WriteProduct.writeProduct(productList);
    }

    @Override
    public List<Product> addProduct(Product product) {
        productList.add(product);
        WriteProduct.writeProduct(productList);
        return  productList;
    }



    @Override
    public void findProduct(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if(id.equals(productList.get(i).getIdProcduct())){
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void displayProduct() {
        ReadProduct.read().forEach(e -> System.out.println(e));
    }
}
