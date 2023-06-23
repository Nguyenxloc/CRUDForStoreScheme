/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Staff;


/**
 *
 * @author 84374
 */
public interface IstaffRepo {
    ArrayList<Staff> selectFromTable();
    Staff selectById(String id);
    Staff save(Staff stff);
    Staff update(Staff stff);
    void delete(String stff);
}
