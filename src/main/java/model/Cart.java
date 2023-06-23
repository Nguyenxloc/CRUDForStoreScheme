/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author 84374
 */
public class Cart {
   private String id;
   private Customer customer;
   private Staff staff;
   private String code;
   private Date dateOfGen;
   private Date dateOfCheck;
   private String nameOfPur;
   private String addr;
   private String phone;
   private int stt;

    public Cart() {
    }

    public Cart(String id, Customer customer, Staff staff, String code, Date dateOfGen, Date dateOfCheck, String nameOfPur, String addr, String phone, int stt) {
        this.id = id;
        this.customer = customer;
        this.staff = staff;
        this.code = code;
        this.dateOfGen = dateOfGen;
        this.dateOfCheck = dateOfCheck;
        this.nameOfPur = nameOfPur;
        this.addr = addr;
        this.phone = phone;
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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
        return "Cart{" + "id=" + id + ", customer=" + customer + ", staff=" + staff + ", code=" + code + ", dateOfGen=" + dateOfGen + ", dateOfCheck=" + dateOfCheck + ", nameOfPur=" + nameOfPur + ", addr=" + addr + ", phone=" + phone + ", stt=" + stt + '}';
    }

    
   

}
