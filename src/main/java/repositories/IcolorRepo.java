/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Color;

/**
 *
 * @author 84374
 */
public interface IcolorRepo {
    ArrayList<Color> selectFromTable();
    Color selectById(String id);
    Color save(Color clr);
    Color update(Color clr);
    void delete(String id);
}
