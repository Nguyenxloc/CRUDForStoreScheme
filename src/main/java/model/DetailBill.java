/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84374
 */
public class DetailBill {
    private Bill bill;
    private ProductDetail idProductDetail;
    private int amount;
    private double unitPrice;

    public DetailBill() {
    }

    public DetailBill(Bill bill, ProductDetail idProductDetail, int amount, double unitPrice) {
        this.bill = bill;
        this.idProductDetail = idProductDetail;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public ProductDetail getIdProductDetail() {
        return idProductDetail;
    }

    public void setIdProductDetail(ProductDetail idProductDetail) {
        this.idProductDetail = idProductDetail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "DetailBill{" + "bill=" + bill + ", idProductDetail=" + idProductDetail + ", amount=" + amount + ", unitPrice=" + unitPrice + '}';
    }

   
    
}
