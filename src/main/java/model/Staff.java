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
public class Staff {
    private String ID;
    private String code;
    private String firstName;
    private String midName;
    private String lastName;
    private String gender;
    private Date dob;
    private String addr;
    private String phone;
    private String pass;
    private Store str;
    private Position pos;
    private String  idGuiBC;
    private int stt;

    public Staff() {
    }

    public Staff(String ID, String code, String firstName, String midName, String lastName, String gender, Date dob, String addr, String phone, String pass, Store str, Position pos, String idGuiBC, int stt) {
        this.ID = ID;
        this.code = code;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.addr = addr;
        this.phone = phone;
        this.pass = pass;
        this.str = str;
        this.pos = pos;
        this.idGuiBC = idGuiBC;
        this.stt = stt;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Store getStr() {
        return str;
    }

    public void setStr(Store str) {
        this.str = str;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public String getIdGuiBC() {
        return idGuiBC;
    }

    public void setIdGuiBC(String idGuiBC) {
        this.idGuiBC = idGuiBC;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return "Staff{" + "ID=" + ID + ", code=" + code + ", firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob + ", addr=" + addr + ", phone=" + phone + ", pass=" + pass + ", str=" + str + ", pos=" + pos + ", idGuiBC=" + idGuiBC + ", stt=" + stt + '}';
    }

    
    
    
}
