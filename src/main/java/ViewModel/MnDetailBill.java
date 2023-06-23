/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author 84374
 */
public class MnDetailBill {
    private String idBill;
    private String codeBill;
    private String idDetailProduct;
    private String CodeProduct;
    private String nameOfProduct;
    private String color;
    private String origin;
    private String typeProduct;
    private int amount;
    private double unitePrice;

    public MnDetailBill() {
    }

    public MnDetailBill(String idBill, String codeBill, String idDetailProduct, String CodeProduct, String nameOfProduct, String color, String origin, String typeProduct, int amount, double unitePrice) {
        this.idBill = idBill;
        this.codeBill = codeBill;
        this.idDetailProduct = idDetailProduct;
        this.CodeProduct = CodeProduct;
        this.nameOfProduct = nameOfProduct;
        this.color = color;
        this.origin = origin;
        this.typeProduct = typeProduct;
        this.amount = amount;
        this.unitePrice = unitePrice;
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getCodeBill() {
        return codeBill;
    }

    public void setCodeBill(String codeBill) {
        this.codeBill = codeBill;
    }

    public String getIdDetailProduct() {
        return idDetailProduct;
    }

    public void setIdDetailProduct(String idDetailProduct) {
        this.idDetailProduct = idDetailProduct;
    }

    public String getCodeProduct() {
        return CodeProduct;
    }

    public void setCodeProduct(String CodeProduct) {
        this.CodeProduct = CodeProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    @Override
    public String toString() {
        return "MnDetailBill{" + "idBill=" + idBill + ", codeBill=" + codeBill + ", idDetailProduct=" + idDetailProduct + ", CodeProduct=" + CodeProduct + ", nameOfProduct=" + nameOfProduct + ", color=" + color + ", origin=" + origin + ", typeProduct=" + typeProduct + ", amount=" + amount + ", unitePrice=" + unitePrice + '}';
    }
    
}
