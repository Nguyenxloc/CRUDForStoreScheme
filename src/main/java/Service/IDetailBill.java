/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnDetailBill;
import java.util.ArrayList;
import model.DetailBill;

/**
 *
 * @author 84374
 */
public interface IDetailBill {

    ////////////////////////detailBill/////////////////////////
    ArrayList<DetailBill> selectFromTable();

    MnDetailBill selectById(String idBill, String idProductDetail);

    MnDetailBill save(MnDetailBill mnDetailBill);

    MnDetailBill update(MnDetailBill mnDetailBill);

    void delete(String id);
    //////////////////////////end////////////////////////
    
}
