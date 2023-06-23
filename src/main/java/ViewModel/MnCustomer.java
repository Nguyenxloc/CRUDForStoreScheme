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
public class MnCustomer {
    private String id;
    private String code;
    private String fullName;
    private Date dob;
    private String phone;
    private String addr;
    private String city;
    private String Country;
    private String pass;

    public MnCustomer() {
    }

    public MnCustomer(String id, String code, String fullName, Date dob, String phone, String addr, String city, String Country, String pass) {
        this.id = id;
        this.code = code;
        this.fullName = fullName;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return "MnCustomer{" + "id=" + id + ", code=" + code + ", fullName=" + fullName + ", dob=" + dob + ", phone=" + phone + ", addr=" + addr + ", city=" + city + ", Country=" + Country + ", pass=" + pass + '}';
    }


}
