/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Cart;

/**
 *
 * @author 84374
 */
public interface ICartRepo {

    ArrayList<Cart> selectFromTable();

    Cart selectById(String id);

    Cart selectByUniID(Long id);

    Cart save(Cart str);

    Cart update(Cart str);

    void delete(String id);
}
