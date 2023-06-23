/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnColor;
import ViewModel.MnStore;
import java.util.ArrayList;

/**
 *
 * @author 84374
 */
public interface IStoreService {

    ArrayList<MnStore> selectFromTable();

    MnStore selectById(String id);

    MnStore selectByUniID(String id);

    MnStore save(MnStore str);

    MnStore update(MnStore str);

    void delete(String id);
}
