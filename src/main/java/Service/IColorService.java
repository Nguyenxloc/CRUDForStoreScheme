/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnColor;
import java.util.ArrayList;
import model.Color;

/**
 *
 * @author 84374
 */
public interface IColorService {

    ArrayList<Color> selectFromTable();

    MnColor selectById(String id);

    MnColor save(MnColor clr);

    MnColor update(MnColor clr);

    void delete(String id);
}
