package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.common;

import ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model.Product;

import java.io.*;
import java.util.List;

public class ReadProduct {
    public static final String PATH_FILE = "src/ss17_binarary_file_serialiton/quan_ly_san_pham_nhi_phan/data/dataProduct.txt";

    //    public static List<Products> productsList = new ArrayList<>();
    public static List<Product> read() {
        FileInputStream fileInputStream = null;
        List<Product> list = null;
        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


}
