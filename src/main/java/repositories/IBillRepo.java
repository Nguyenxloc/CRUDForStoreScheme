/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author 84374
 */
public interface IBillRepo {

    ArrayList<Bill> selectFromTable();

    Bill selectById(String id);

    Bill save(Bill bill);

    Bill update(Bill bill);

    void delete(String id);
}
