package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.repository;


import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> addProduct(Product products);
      void findProduct(String id);
     void displayProduct();
}
