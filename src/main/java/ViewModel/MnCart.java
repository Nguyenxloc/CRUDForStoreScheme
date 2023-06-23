/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.sql.Date;

/**
 *
 * @author 84374
 */
public class MnCart {

    private String idCart;
    private String idCustomer;
    private String idStaff;
    private String code;
    private Date dateOfGen;
    private Date dateOfCheck;
    private String nameOfPur;
    private String addr;
    private String phone;
    private int stt;

    public MnCart() {
    }

    public MnCart(String idCart, String idCustomer, String idStaff, String code, Date dateOfGen, Date dateOfCheck, String nameOfPur, String addr, String phone, int stt) {
        this.idCart = idCart;
        this.idCustomer = idCustomer;
        this.idStaff = idStaff;
        this.code = code;
        this.dateOfGen = dateOfGen;
        this.dateOfCheck = dateOfCheck;
        this.nameOfPur = nameOfPur;
        this.addr = addr;
        this.phone = phone;
        this.stt = stt;
    }

    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateOfGen() {
        return dateOfGen;
    }

    public void setDateOfGen(Date dateOfGen) {
        this.dateOfGen = dateOfGen;
    }

    public Date getDateOfCheck() {
        return dateOfCheck;
    }

    public void setDateOfCheck(Date dateOfCheck) {
        this.dateOfCheck = dateOfCheck;
    }

    public String getNameOfPur() {
        return nameOfPur;
    }

    public void setNameOfPur(String nameOfPur) {
        this.nameOfPur = nameOfPur;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return "MnCart{" + "idCart=" + idCart + ", idCustomer=" + idCustomer + ", idStaff=" + idStaff + ", code=" + code + ", dateOfGen=" + dateOfGen + ", dateOfCheck=" + dateOfCheck + ", nameOfPur=" + nameOfPur + ", addr=" + addr + ", phone=" + phone + ", stt=" + stt + '}';
    }

}
