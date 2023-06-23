/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnBill;
import ViewModel.MnCart;
import java.util.ArrayList;
import model.Cart;
import model.Customer;
import model.Staff;
import repositories.CartRepo;
import repositories.CustomerRepo;
import repositories.ICartRepo;
import repositories.ICustomer;
import repositories.IstaffRepo;
import repositories.StaffRepo;

/**
 *
 * @author 84374
 */
public class CartService implements ICartService {

    ICartRepo iCartRepo;
    ICustomer iCustomerRepo;
    IstaffRepo istaffRepo;

    public CartService() {
        iCartRepo = new CartRepo();
        istaffRepo = new StaffRepo();
        iCustomerRepo = new CustomerRepo();
    }

    @Override
    public ArrayList<Cart> selectFromTable() {
        ArrayList<Cart> lstCart = new ArrayList<>();
        lstCart = iCartRepo.selectFromTable();
        return lstCart;
    }

    @Override
    public MnCart selectById(String id) {
        Cart cart = new Cart();
        cart = iCartRepo.selectById(id);
        Customer customer = iCustomerRepo.selectById(cart.getCustomer().getId());
        Staff staff = istaffRepo.selectById(cart.getStaff().getID());
        MnCart mnCart = new MnCart(cart.getId(), customer.getId(), staff.getID(), cart.getCode(), cart.getDateOfGen(), cart.getDateOfCheck(),
                cart.getNameOfPur(), cart.getAddr(), cart.getPhone(), cart.getStt());
        return mnCart;
    }

    @Override
    public MnCart save(MnCart mnCart) {
        Customer customer = iCustomerRepo.selectById(mnCart.getIdCustomer());
        Staff staff = istaffRepo.selectById(mnCart.getIdStaff());
        Cart cart = new Cart(mnCart.getIdCart(), customer, staff, mnCart.getCode(), mnCart.getDateOfGen(), mnCart.getDateOfCheck(),
                mnCart.getNameOfPur(), mnCart.getAddr(), mnCart.getPhone(), mnCart.getStt());
        iCartRepo.save(cart);
        return mnCart;
    }

    @Override
    public MnCart update(MnCart mnCart) {
        Customer customer = iCustomerRepo.selectById(mnCart.getIdCustomer());
        Staff staff = istaffRepo.selectById(mnCart.getIdStaff());
        Cart cart = new Cart(mnCart.getIdCart(), customer, staff, mnCart.getCode(), mnCart.getDateOfGen(), mnCart.getDateOfCheck(),
                mnCart.getNameOfPur(), mnCart.getAddr(), mnCart.getPhone(), mnCart.getStt());
        iCartRepo.update(cart);
        return mnCart;
    }

    @Override
    public void delete(String id) {
        istaffRepo.delete(id);
    }

}
