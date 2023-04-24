package ss17_binarary_file_serialiton.quan_ly_san_pham_nhi_phan.model;

import java.io.Serial;
import java.io.Serializable;

public class Product implements Serializable {
    private String idProcduct;
    private String nameProduct;
    private String priceProduct;
    private String manufacturedProduct;
    private String commentProduct;

    public Product() {
    }

    public Product(String idProcduct, String nameProduct, String priceProduct, String manufacturedProduct, String commentProduct) {
        this.idProcduct = idProcduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufacturedProduct = manufacturedProduct;
        this.commentProduct = commentProduct;
    }

    public String getIdProcduct() {
        return idProcduct;
    }

    public void setIdProcduct(String idProcduct) {
        this.idProcduct = idProcduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturedProduct() {
        return manufacturedProduct;
    }

    public void setManufacturedProduct(String manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
    }

    public String getCommentProduct() {
        return commentProduct;
    }

    public void setCommentProduct(String commentProduct) {
        this.commentProduct = commentProduct;
    }

    @Override
    public String toString() {
        return "Products{" +
                "idProcduct='" + idProcduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                ", manufacturedProduct='" + manufacturedProduct + '\'' +
                ", commentProduct='" + commentProduct + '\'' +
                '}';
    }
}
