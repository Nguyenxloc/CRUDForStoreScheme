/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author 84374
 */
public class MnCartDetail {
     private String idCart;
     private String codeCart;
     private String idProduct;
     private String codeProduct;
     private String nameProduct;
     private double unitPrice;
     private double unitOnDiscount;

    public MnCartDetail() {
    }

    public MnCartDetail(String idCart, String codeCart, String idProduct, String codeProduct, String nameProduct, double unitPrice, double unitOnDiscount) {
        this.idCart = idCart;
        this.codeCart = codeCart;
        this.idProduct = idProduct;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.unitPrice = unitPrice;
        this.unitOnDiscount = unitOnDiscount;
    }

    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    public String getCodeCart() {
        return codeCart;
    }

    public void setCodeCart(String codeCart) {
        this.codeCart = codeCart;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitOnDiscount() {
        return unitOnDiscount;
    }

    public void setUnitOnDiscount(double unitOnDiscount) {
        this.unitOnDiscount = unitOnDiscount;
    }

    @Override
    public String toString() {
        return "MnCartDetail{" + "idCart=" + idCart + ", codeCart=" + codeCart + ", idProduct=" + idProduct + ", codeProduct=" + codeProduct + ", nameProduct=" + nameProduct + ", unitPrice=" + unitPrice + ", unitOnDiscount=" + unitOnDiscount + '}';
    }
      
}
