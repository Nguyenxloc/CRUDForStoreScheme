/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.DetailBill;

/**
 *
 * @author 84374
 */
public interface IDetailBillRepo {

    ArrayList<DetailBill> selectFromTable();

    DetailBill selectById(String idBill, String idProduct);

    DetailBill selectByUniID(String id);

    DetailBill save(DetailBill detailBill);

    DetailBill update(DetailBill detailBill);

    void delete(String id);

}
