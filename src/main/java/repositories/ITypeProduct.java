/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Origin;
import model.TypeProduct;

/**
 *
 * @author 84374
 */
public interface ITypeProduct {

    ArrayList<TypeProduct> selectFromTable();

    TypeProduct selectById(String id);

    TypeProduct save(TypeProduct typeProduct);

    TypeProduct update(TypeProduct typeProduct);

    void delete(String id);
}
