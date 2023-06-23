/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnBill;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author 84374
 */
public interface IBillService {
        //////////////////////bill//////////////////

    ArrayList<Bill> selectFromTable();

    MnBill selectById(String id);

    MnBill save(MnBill mnBill);

    MnBill update(MnBill mnBill);

    void delete(String id);
}
