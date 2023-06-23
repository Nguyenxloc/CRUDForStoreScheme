/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnOrigin;
import java.util.ArrayList;

/**
 *
 * @author 84374
 */
public interface IOriginService {

    ArrayList<MnOrigin> selectFromTable();

    MnOrigin selectById(String id);

    MnOrigin save(MnOrigin da);

    MnOrigin update(MnOrigin da);

    void delete(String id);
}
