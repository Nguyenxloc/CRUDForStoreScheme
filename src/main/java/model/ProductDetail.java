/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84374
 */
public class ProductDetail {
        private String id;
        private Product  pro;
        private Origin dom;
        private Color clr;
        private TypeProduct type;
        private int dateOfWarenty;
        private String describe;
        private int quantityOnStock;
        private double priceOfImport;
        private double priceOfSell;

    public ProductDetail() {
    }

    public ProductDetail(String id, Product pro, Origin dom, Color clr, TypeProduct type, int dateOfWarenty, String describe, int quantityOnStock, double priceOfImport, double priceOfSell) {
        this.id = id;
        this.pro = pro;
        this.dom = dom;
        this.clr = clr;
        this.type = type;
        this.dateOfWarenty = dateOfWarenty;
        this.describe = describe;
        this.quantityOnStock = quantityOnStock;
        this.priceOfImport = priceOfImport;
        this.priceOfSell = priceOfSell;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

    public Origin getDom() {
        return dom;
    }

    public void setDom(Origin dom) {
        this.dom = dom;
    }

    public Color getClr() {
        return clr;
    }

    public void setClr(Color clr) {
        this.clr = clr;
    }

    public TypeProduct getType() {
        return type;
    }

    public void setType(TypeProduct type) {
        this.type = type;
    }

    public int getDateOfWarenty() {
        return dateOfWarenty;
    }

    public void setDateOfWarenty(int dateOfWarenty) {
        this.dateOfWarenty = dateOfWarenty;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setQuantityOnStock(int quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public double getPriceOfImport() {
        return priceOfImport;
    }

    public void setPriceOfImport(double priceOfImport) {
        this.priceOfImport = priceOfImport;
    }

    public double getPriceOfSell() {
        return priceOfSell;
    }

    public void setPriceOfSell(double priceOfSell) {
        this.priceOfSell = priceOfSell;
    }

    @Override
    public String toString() {
        return "ProductDetail{" + "id=" + id + ", pro=" + pro + ", dom=" + dom + ", clr=" + clr + ", type=" + type + ", dateOfWarenty=" + dateOfWarenty + ", describe=" + describe + ", quantityOnStock=" + quantityOnStock + ", priceOfImport=" + priceOfImport + ", priceOfSell=" + priceOfSell + '}';
    }

        
}
