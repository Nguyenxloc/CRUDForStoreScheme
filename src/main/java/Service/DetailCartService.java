/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnCartDetail;
import java.util.ArrayList;
import model.Cart;
import model.DetailCart;
import model.Product;
import repositories.BillRepo;
import repositories.CartRepo;
import repositories.DetailCartRepo;
import repositories.IBillRepo;
import repositories.ICartRepo;
import repositories.IDetailCartRepo;
import repositories.IproductRepo;
import repositories.ProductRepo;

/**
 *
 * @author 84374
 */
public class DetailCartService implements IDetailCartService {

    IBillRepo iBillRepo;
    IproductRepo iproductRepo;
    IDetailCartRepo iDetailCartRepo;
    ICartRepo icartRepo;

    public DetailCartService() {
        iBillRepo = new BillRepo();
        iproductRepo = new ProductRepo();
        iDetailCartRepo = new DetailCartRepo();
        icartRepo = new CartRepo();
    }

    @Override
    public ArrayList<DetailCart> selectFromTable() {
        ArrayList<DetailCart> lstDetailCart = new ArrayList<>();
        lstDetailCart = iDetailCartRepo.selectFromTable();
        return lstDetailCart;
    }

    @Override
    public MnCartDetail selectById(String idCart, String idProduct) {
        DetailCart detailCart = new DetailCart();
        detailCart = iDetailCartRepo.selectByIdLv2(idCart, idProduct);
        Product product = iproductRepo.selectById(idProduct);
        Cart cart = icartRepo.selectById(idCart);
        MnCartDetail mnCartDetail = new MnCartDetail(idCart, cart.getCode(), product.getId(), product.getCode(), product.getName(), detailCart.getUnitPrice(), detailCart.getUnitOndiscount());
        return mnCartDetail;
    }

    @Override
    public MnCartDetail save(MnCartDetail mnDetailBill) {
        Product product = iproductRepo.selectById(mnDetailBill.getIdProduct());
        Cart cart = icartRepo.selectById(mnDetailBill.getIdCart());
        DetailCart detailCart = new DetailCart(cart, product, 0, 0, 0);
        iDetailCartRepo.save(detailCart);
        return mnDetailBill;
    }

    @Override
    public MnCartDetail update(MnCartDetail mnDetailBill) {
        Product product = iproductRepo.selectById(mnDetailBill.getIdProduct());
        Cart cart = icartRepo.selectById(mnDetailBill.getIdCart());
        DetailCart detailCart = new DetailCart(cart, product, 0, 0, 0);
        iDetailCartRepo.update(detailCart);
        return mnDetailBill;
    }

    @Override
    public void delete(String id) {
        iDetailCartRepo.delete(id);
    }

}
