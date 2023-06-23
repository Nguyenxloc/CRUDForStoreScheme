/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.ProductDetail;

/**
 *
 * @author 84374
 */
public interface IProductDetailRepo {

    ArrayList<ProductDetail> selectFromTable();

    ProductDetail selectById(String id);

    ProductDetail save(ProductDetail productDetail);

    ProductDetail update(ProductDetail productDetail);

    void delete(String id);
}
