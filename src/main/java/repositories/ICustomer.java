/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author 84374
 */
public interface ICustomer {

    ArrayList<Customer> selectFromTable();

    Customer selectById(String id);

    Customer save(Customer cus);

    Customer update(Customer cus);

    void delete(String id);
}
