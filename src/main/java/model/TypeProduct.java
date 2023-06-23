/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84374
 */
public class TypeProduct {
    private String id;
    private String code;
    private String Name;

    public TypeProduct() {
    }

    public TypeProduct(String id, String code, String Name) {
        this.id = id;
        this.code = code;
        this.Name = Name;
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
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "TypeProduct{" + "id=" + id + ", code=" + code + ", Name=" + Name + '}';
    }
     
}
