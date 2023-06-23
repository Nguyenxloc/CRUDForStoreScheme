/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnPos;
import java.util.ArrayList;
import model.Position;

/**
 *
 * @author 84374
 */
public interface IPosService {
    ArrayList<Position> selectFromTable();

    MnPos selectById(String id);

    MnPos selectByUniID(Long id);

    MnPos save(MnPos str);

    MnPos update(MnPos str);

    void delete(String id);
}
