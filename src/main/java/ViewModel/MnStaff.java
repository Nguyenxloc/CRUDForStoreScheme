/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.sql.Date;
import model.Store;

/**
 *
 * @author 84374
 */
public class MnStaff {

    private String id;
    private String code;
    private String fullName;
    private String gender;
    private Date dob;
    private String addr;
    private String phone;
    private String pass;
    private String idStore;
    private String maCH;
    private String tenCuaHang;
    private String thanhPho;
    private String idCV;
    private String maCV;
    private String tenCV;
    private String idGuiBC;
    private int stt;

    public MnStaff() {
    }

    public MnStaff(String id, String code, String fullName, String gender, Date dob, String addr, String phone, String pass, String idStore, String maCH, String tenCuaHang, String thanhPho, String idCV, String maCV, String tenCV, String idGuiBC, int stt) {
        this.id = id;
        this.code = code;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.addr = addr;
        this.phone = phone;
        this.pass = pass;
        this.idStore = idStore;
        this.maCH = maCH;
        this.tenCuaHang = tenCuaHang;
        this.thanhPho = thanhPho;
        this.idCV = idCV;
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.idGuiBC = idGuiBC;
        this.stt = stt;
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

    public String getIdStore() {
        return idStore;
    }

    public void setIdStore(String idStore) {
        this.idStore = idStore;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getIdCV() {
        return idCV;
    }

    public void setIdCV(String idCV) {
        this.idCV = idCV;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
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
        return "MnStaff{" + "id=" + id + ", code=" + code + ", fullName=" + fullName + ", gender=" + gender + ", dob=" + dob + ", addr=" + addr + ", phone=" + phone + ", pass=" + pass + ", idStore=" + idStore + ", maCH=" + maCH + ", tenCuaHang=" + tenCuaHang + ", thanhPho=" + thanhPho + ", idCV=" + idCV + ", maCV=" + maCV + ", tenCV=" + tenCV + ", idGuiBC=" + idGuiBC + ", stt=" + stt + '}';
    }

    
}
