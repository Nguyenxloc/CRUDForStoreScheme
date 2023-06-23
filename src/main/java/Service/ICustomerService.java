/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnBill;
import ViewModel.MnCustomer;
import ViewModel.MnDetailBill;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author 84374
 */
public interface ICustomerService {

    ArrayList<Customer> selectCusFromTable();

    MnCustomer selectCusById(String id);

    MnCustomer saveCus(MnCustomer mnCus);

    MnCustomer updateCus(MnCustomer mnCus);

    void deleteCus(String id);

}
