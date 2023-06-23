/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author 84374
 */
public class MnProductDetail {
    private String id;
    private String idOrigin;
    private String codeOrigin;
    private String nameOrigin;
    private String idProduct;
    private String codeProduct;
    private String nameProduct;
    private String idTypeProduct;
    private String codeTypeProduct;
    private String nameTypeProduct;
    private String idColorProduct;
    private String codeColor;
    private String nameColor;
    private String des;
    private int amountOnStocking;
    private int yearIns;
    private double priceOfImport;
    private double priceForSell;

    public MnProductDetail() {
    }

    public MnProductDetail(String id, String idOrigin, String codeOrigin, String nameOrigin, String idProduct, String codeProduct, String nameProduct, String idTypeProduct, String codeTypeProduct, String nameTypeProduct, String idColorProduct, String codeColor, String nameColor, String des, int amountOnStocking, int yearIns, double priceOfImport, double priceForSell) {
        this.id = id;
        this.idOrigin = idOrigin;
        this.codeOrigin = codeOrigin;
        this.nameOrigin = nameOrigin;
        this.idProduct = idProduct;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.idTypeProduct = idTypeProduct;
        this.codeTypeProduct = codeTypeProduct;
        this.nameTypeProduct = nameTypeProduct;
        this.idColorProduct = idColorProduct;
        this.codeColor = codeColor;
        this.nameColor = nameColor;
        this.des = des;
        this.amountOnStocking = amountOnStocking;
        this.yearIns = yearIns;
        this.priceOfImport = priceOfImport;
        this.priceForSell = priceForSell;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdOrigin() {
        return idOrigin;
    }

    public void setIdOrigin(String idOrigin) {
        this.idOrigin = idOrigin;
    }

    public String getCodeOrigin() {
        return codeOrigin;
    }

    public void setCodeOrigin(String codeOrigin) {
        this.codeOrigin = codeOrigin;
    }

    public String getNameOrigin() {
        return nameOrigin;
    }

    public void setNameOrigin(String nameOrigin) {
        this.nameOrigin = nameOrigin;
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

    public String getIdTypeProduct() {
        return idTypeProduct;
    }

    public void setIdTypeProduct(String idTypeProduct) {
        this.idTypeProduct = idTypeProduct;
    }

    public String getCodeTypeProduct() {
        return codeTypeProduct;
    }

    public void setCodeTypeProduct(String codeTypeProduct) {
        this.codeTypeProduct = codeTypeProduct;
    }

    public String getNameTypeProduct() {
        return nameTypeProduct;
    }

    public void setNameTypeProduct(String nameTypeProduct) {
        this.nameTypeProduct = nameTypeProduct;
    }

    public String getIdColorProduct() {
        return idColorProduct;
    }

    public void setIdColorProduct(String idColorProduct) {
        this.idColorProduct = idColorProduct;
    }

    public String getCodeColor() {
        return codeColor;
    }

    public void setCodeColor(String codeColor) {
        this.codeColor = codeColor;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getAmountOnStocking() {
        return amountOnStocking;
    }

    public void setAmountOnStocking(int amountOnStocking) {
        this.amountOnStocking = amountOnStocking;
    }

    public int getYearIns() {
        return yearIns;
    }

    public void setYearIns(int yearIns) {
        this.yearIns = yearIns;
    }

    public double getPriceOfImport() {
        return priceOfImport;
    }

    public void setPriceOfImport(double priceOfImport) {
        this.priceOfImport = priceOfImport;
    }

    public double getPriceForSell() {
        return priceForSell;
    }

    public void setPriceForSell(double priceForSell) {
        this.priceForSell = priceForSell;
    }

    @Override
    public String toString() {
        return "MnProductDetail{" + "id=" + id + ", idOrigin=" + idOrigin + ", codeOrigin=" + codeOrigin + ", nameOrigin=" + nameOrigin + ", idProduct=" + idProduct + ", codeProduct=" + codeProduct + ", nameProduct=" + nameProduct + ", idTypeProduct=" + idTypeProduct + ", codeTypeProduct=" + codeTypeProduct + ", nameTypeProduct=" + nameTypeProduct + ", idColorProduct=" + idColorProduct + ", codeColor=" + codeColor + ", nameColor=" + nameColor + ", des=" + des + ", amountOnStocking=" + amountOnStocking + ", yearIns=" + yearIns + ", priceOfImport=" + priceOfImport + ", priceForSell=" + priceForSell + '}';
    }
  
}
