/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84374
 */
public class DetailCart {
    private Cart cart;
    private Product product;
    private int amount;
    private double unitPrice;
    private double unitOndiscount;

    public DetailCart() {
    }

    public DetailCart(Cart cart, Product product, int amount, double unitPrice, double unitOndiscount) {
        this.cart = cart;
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.unitOndiscount = unitOndiscount;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public double getUnitOndiscount() {
        return unitOndiscount;
    }

    public void setUnitOndiscount(double unitOndiscount) {
        this.unitOndiscount = unitOndiscount;
    }

    @Override
    public String toString() {
        return "DetailCart{" + "cart=" + cart + ", product=" + product + ", amount=" + amount + ", unitPrice=" + unitPrice + ", unitOndiscount=" + unitOndiscount + '}';
    }
    
}
