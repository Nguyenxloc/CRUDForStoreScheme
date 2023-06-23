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
public class Customer {
    private String id;
    private String code;
    private String fName;
    private String midname;
    private String lName;
    private Date dob;
    private String phone;
    private String addr;
    private String city;
    private String Country;
    private String pass;

    public Customer() {
    }

    public Customer(String id, String code, String fName, String midname, String lName, Date dob, String phone, String addr, String city, String Country, String pass) {
        this.id = id;
        this.code = code;
        this.fName = fName;
        this.midname = midname;
        this.lName = lName;
        this.dob = dob;
        this.phone = phone;
        this.addr = addr;
        this.city = city;
        this.Country = Country;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", code=" + code + ", fName=" + fName + ", midname=" + midname + ", lName=" + lName + ", dob=" + dob + ", phone=" + phone + ", addr=" + addr + ", city=" + city + ", Country=" + Country + ", pass=" + pass + '}';
    }

   
    
    
   
}
