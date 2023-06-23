/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Origin;

/**
 *
 * @author 84374
 */
public interface IOriginRepo {
    ArrayList<Origin> selectFromTable();
    Origin selectById(String id);
    Origin save(Origin da);
    Origin update(Origin da);
    void delete(String id);
}
