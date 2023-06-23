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
public class Bill {
    private String id;
    private Customer customer;
    private Staff staff;
    private String code;
    private Date dateOfGen;
    private Date dateOfPur;
    private Date dateOfShip;
    private Date dateOfReceive;
    private int stt;
    private String nameOfOwnerBill;
    private String addr;
    private String phone;

    public Bill() {
    }

    public Bill(String id, Customer customer, Staff staff, String code, Date dateOfGen, Date dateOfPur, Date dateOfShip, Date dateOfReceive, int stt, String nameOfOwnerBill, String addr, String phone) {
        this.id = id;
        this.customer = customer;
        this.staff = staff;
        this.code = code;
        this.dateOfGen = dateOfGen;
        this.dateOfPur = dateOfPur;
        this.dateOfShip = dateOfShip;
        this.dateOfReceive = dateOfReceive;
        this.stt = stt;
        this.nameOfOwnerBill = nameOfOwnerBill;
        this.addr = addr;
        this.phone = phone;
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

    public Date getDateOfPur() {
        return dateOfPur;
    }

    public void setDateOfPur(Date dateOfPur) {
        this.dateOfPur = dateOfPur;
    }

    public Date getDateOfShip() {
        return dateOfShip;
    }

    public void setDateOfShip(Date dateOfShip) {
        this.dateOfShip = dateOfShip;
    }

    public Date getDateOfReceive() {
        return dateOfReceive;
    }

    public void setDateOfReceive(Date dateOfReceive) {
        this.dateOfReceive = dateOfReceive;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getNameOfOwnerBill() {
        return nameOfOwnerBill;
    }

    public void setNameOfOwnerBill(String nameOfOwnerBill) {
        this.nameOfOwnerBill = nameOfOwnerBill;
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

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", customer=" + customer + ", staff=" + staff + ", code=" + code + ", dateOfGen=" + dateOfGen + ", dateOfPur=" + dateOfPur + ", dateOfShip=" + dateOfShip + ", dateOfReceive=" + dateOfReceive + ", stt=" + stt + ", nameOfOwnerBill=" + nameOfOwnerBill + ", addr=" + addr + ", phone=" + phone + '}';
    }

 
}
