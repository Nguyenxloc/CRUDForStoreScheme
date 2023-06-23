/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnBill;
import ViewModel.MnCart;
import java.util.ArrayList;
import model.Cart;

/**
 *
 * @author 84374
 */
public interface ICartService {
    
    ////////////////////////detailBill/////////////////////////
    ArrayList<Cart> selectFromTable();

    MnCart selectById(String id);

    MnCart save(MnCart mnCart);

    MnCart update(MnCart mnCart);

    void delete(String id);
    //////////////////////////end////////////////////////
}
