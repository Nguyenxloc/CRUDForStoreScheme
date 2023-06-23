/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.awt.Color;
import java.util.ArrayList;
import model.Store;

/**
 *
 * @author 84374
 */
public interface IstoreRepo {
    ArrayList<Store> selectFromTable();
    Store selectById(String id);
    Store selectByUniID (String id);
    Store save(Store str);
    Store update(Store str);
    void delete(String id);
}
