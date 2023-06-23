/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Position;

/**
 *
 * @author 84374
 */
public interface IPositionRepo {

    ArrayList<Position> selectFromTable();

    Position selectById(String id);

    Position selectByUniID(String id);

    Position save(Position str);

    Position update(Position str);

    void delete(String id);
}
