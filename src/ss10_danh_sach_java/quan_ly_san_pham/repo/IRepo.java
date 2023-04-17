package ss10_danh_sach_java.quan_ly_san_pham.repo;

import ss10_danh_sach_java.quan_ly_san_pham.model.Product;

public interface IRepo {
    void addProduct(Product product);
    boolean deleteProductById(String id);
    boolean editProduct(String id);
    void displayProduct();
    boolean findProduct(String name);
}
