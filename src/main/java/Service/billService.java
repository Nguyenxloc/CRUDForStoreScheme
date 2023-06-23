/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnBill;
import java.util.ArrayList;
import model.Bill;
import model.Customer;
import model.Staff;
import repositories.BillRepo;
import repositories.CustomerRepo;
import repositories.IBillRepo;
import repositories.ICustomer;
import repositories.IstaffRepo;

/**
 *
 * @author 84374
 */
public class billService implements IBillService {

    IBillRepo iBillRepo;
    ICustomer iCustomerRepo;
    IstaffRepo iStaffRepo;

    public billService() {
        iBillRepo = new BillRepo();
        iCustomerRepo = new CustomerRepo();
    }

    @Override
    public ArrayList<Bill> selectFromTable() {
        ArrayList<Bill> lstBill = new ArrayList<>();
        lstBill = iBillRepo.selectFromTable();
        return lstBill;
    }

    @Override
    public MnBill selectById(String id) {
        Bill bill = iBillRepo.selectById(id);
        MnBill mnBill = new MnBill(bill.getId(), bill.getCustomer().getId(), bill.getStaff().getID(), bill.getCode(),
                 bill.getDateOfGen(), bill.getDateOfPur(), bill.getDateOfShip(), bill.getDateOfReceive(),
                 bill.getStt(), bill.getNameOfOwnerBill(), bill.getNameOfOwnerBill(), bill.getPhone());
        return mnBill;
    }

    @Override
    public MnBill save(MnBill mnBill) {
        Customer customer = iCustomerRepo.selectById(mnBill.getIdCustomer());
        Staff staff = iStaffRepo.selectById(mnBill.getIdStaff());
        Bill bill = new Bill(mnBill.getIdBill(), customer, staff, mnBill.getCode(), mnBill.getDateOfGen(), mnBill.getDateOfPur(), mnBill.getDateOfShip(), mnBill.getDateOfReceive(), mnBill.getStt(), mnBill.getNameOfOwnerBill(), mnBill.getAddr(), mnBill.getPhone());
        iBillRepo.save(bill);
        return mnBill;
    }

    @Override
    public MnBill update(MnBill mnBill) {
        Customer customer = iCustomerRepo.selectById(mnBill.getIdCustomer());
        Staff staff = iStaffRepo.selectById(mnBill.getIdStaff());
        Bill bill = new Bill(mnBill.getIdBill(), customer, staff, mnBill.getCode(), mnBill.getDateOfGen(), mnBill.getDateOfPur(), mnBill.getDateOfShip(), mnBill.getDateOfReceive(), mnBill.getStt(), mnBill.getNameOfOwnerBill(), mnBill.getAddr(), mnBill.getPhone());
        iBillRepo.update(bill);
        return mnBill;
    }

    @Override
    public void delete(String id) {
        iBillRepo.delete(id);
    }

}
