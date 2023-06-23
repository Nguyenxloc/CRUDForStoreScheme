/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.DetailCart;

/**
 *
 * @author 84374
 */
public interface IDetailCartRepo {

    ArrayList<DetailCart> selectFromTable();

    DetailCart selectByIdLv1(String id);
    DetailCart selectByIdLv2(String idCart,String idDetailProduct);

    DetailCart selectByUniID(String id);

    DetailCart save(DetailCart detailCart);

    DetailCart update(DetailCart detailCart);

    void delete(String id);
}
