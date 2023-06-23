/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author 84374
 */
public class MnStore {
    private String id;
    private String code;
    private String name;
    private String addr;
    private String city;
    private String country;

    public MnStore() {
    }

    public MnStore(String id, String code, String name, String addr, String city, String country) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.addr = addr;
        this.city = city;
        this.country = country;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "MnStore{" + "id=" + id + ", code=" + code + ", name=" + name + ", addr=" + addr + ", city=" + city + ", country=" + country + '}';
    }

  
    
    

}
