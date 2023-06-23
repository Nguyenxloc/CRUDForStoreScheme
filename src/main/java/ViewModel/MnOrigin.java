/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import model.ProductDetail;

/**
 *
 * @author 84374
 */
public class MnOrigin {
    private  String id;
    private  String code;
    private  String name;

    public MnOrigin() {
    }

    public MnOrigin(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
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

    @Override
    public String toString() {
        return "MnOrigin{" + "id=" + id + ", code=" + code + ", name=" + name + '}';
    }

   
    
    
}
