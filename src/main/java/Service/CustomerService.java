/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnCustomer;
import java.util.ArrayList;
import model.Customer;
import repositories.CustomerRepo;
import repositories.ICustomer;

/**
 *
 * @author 84374
 */
public class CustomerService implements ICustomerService {

    ICustomer iCustomerRepo;

    public CustomerService() {
        iCustomerRepo = new CustomerRepo();
    }

    @Override
    public ArrayList<Customer> selectCusFromTable() {
        ArrayList<Customer> lstCustomer = new ArrayList<>();
        lstCustomer = iCustomerRepo.selectFromTable();
        return lstCustomer;
    }

    @Override
    public MnCustomer selectCusById(String id) {
        MnCustomer mnCustomer = new MnCustomer();
        Customer customer = new Customer();
        customer = iCustomerRepo.selectById(id);
        mnCustomer = new MnCustomer(customer.getId(), customer.getCode(), (customer.getlName() + customer.getMidname() + customer.getfName()),
                customer.getDob(), customer.getPhone(), customer.getAddr(), customer.getCity(), customer.getCountry(), customer.getPass());
        return mnCustomer;
    }

    @Override
    public MnCustomer saveCus(MnCustomer mnCus) {
        String[] nameSep = mnCus.getFullName().split(" ");
        Customer customer = new Customer(mnCus.getId(), mnCus.getCode(), nameSep[0], nameSep[1], nameSep[2], mnCus.getDob(),
                mnCus.getPhone(), mnCus.getAddr(), mnCus.getCity(), mnCus.getCountry(), mnCus.getPass());
        iCustomerRepo.save(customer);
        return mnCus;
    }

    @Override
    public MnCustomer updateCus(MnCustomer mnCus) {
        String[] nameSep = mnCus.getFullName().split(" ");
        Customer customer = new Customer(mnCus.getId(), mnCus.getCode(), nameSep[0], nameSep[1], nameSep[2], mnCus.getDob(),
                mnCus.getPhone(), mnCus.getAddr(), mnCus.getCity(), mnCus.getCountry(), mnCus.getPass());
        iCustomerRepo.update(customer);
        return mnCus;
    }

    @Override
    public void deleteCus(String id) {
        iCustomerRepo.delete(id);
    }

}
