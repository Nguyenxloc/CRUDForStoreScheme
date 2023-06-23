/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author 84374
 */
public interface IproductRepo {
    ArrayList<Product> selectFromTable();
    Product selectById(String id);
    Product save(Product prd);
    Product update(Product prd);
    void delete(String id);
}
