/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnCartDetail;
import java.util.ArrayList;
import model.DetailCart;

/**
 *
 * @author 84374
 */
public interface IDetailCartService {
    ////////////////////////detailBill/////////////////////////
    ArrayList<DetailCart> selectFromTable();

    MnCartDetail selectById(String idCart,String idDeatailProduct);

    MnCartDetail save(MnCartDetail mnDetailBill);

    MnCartDetail update(MnCartDetail mnDetailBill);

    void delete(String id);
    //////////////////////////end////////////////////////
}
