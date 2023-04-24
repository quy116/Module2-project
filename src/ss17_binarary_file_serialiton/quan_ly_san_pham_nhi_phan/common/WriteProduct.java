package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.common;

import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteProduct {
    public static final String PATH_FILE = "src/ss17_binarary_file_serialiton/quan_ly_san_pham_nhi_phan/data/dataProduct.txt";
    public static void writeProduct(List<Product> productList){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
