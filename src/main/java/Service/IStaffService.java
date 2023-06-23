/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnStaff;
import java.util.ArrayList;
import model.Staff;

/**
 *
 * @author 84374
 */
public interface IStaffService {

    ArrayList<Staff> selectFromTable();

    MnStaff selectById(String id);

    MnStaff save(MnStaff clr);

    MnStaff update(MnStaff clr);

    void delete(String id);
}
