/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnDetailBill;
import ViewModel.MnStaff;
import java.util.ArrayList;
import model.Bill;
import model.Color;
import model.DetailBill;
import model.Origin;
import model.Product;
import model.ProductDetail;
import model.Staff;
import model.TypeProduct;
import repositories.BillRepo;
import repositories.ColorRepo;
import repositories.DetailBillRepo;
import repositories.IBillRepo;
import repositories.IDetailBillRepo;
import repositories.IOriginRepo;
import repositories.IProductDetailRepo;
import repositories.ITypeProduct;
import repositories.IcolorRepo;
import repositories.IproductRepo;
import repositories.OriginRepo;
import repositories.ProductDetailRepo;
import repositories.ProductRepo;
import repositories.TypeProductRepo;

/**
 *
 * @author 84374
 */
public class detailBillService implements IDetailBill {
    IDetailBillRepo iDetailBillRepo;
    IBillRepo iBillRepo;
    IproductRepo iproductRepo ;
    IOriginRepo iOriginRepo;
    IcolorRepo iColorRepo;
    ITypeProduct iTypeProduct;
    IProductDetailRepo iProductDetailRepo;
    public detailBillService() {
       iDetailBillRepo = new DetailBillRepo();
       iBillRepo = new BillRepo();
       iproductRepo = new ProductRepo();
       iProductDetailRepo = new ProductDetailRepo();
       iOriginRepo = new OriginRepo();
       iColorRepo = new ColorRepo();
       iTypeProduct = new TypeProductRepo();
    }
     
    @Override
    public ArrayList<DetailBill> selectFromTable() {
        ArrayList<DetailBill> lstDetailBill = new ArrayList<>();
        lstDetailBill = iDetailBillRepo.selectFromTable();
        return lstDetailBill;
    }

    @Override
    public MnDetailBill selectById(String idBill,String idProduct) {
        DetailBill detailBill = iDetailBillRepo.selectById(idBill,idProduct);
        Product product = iproductRepo.selectById(detailBill.getIdProductDetail().getId());
        Color color = iColorRepo.selectById(product.getId());
        Origin origin = iOriginRepo.selectById(product.getId());
        TypeProduct typeProduct = iTypeProduct.selectById(product.getId());
        MnDetailBill mnDetailBill = new MnDetailBill(detailBill.getBill().getId(),detailBill.getBill().getCode(),detailBill.getIdProductDetail().getId(),product.getName(),product.getName(),color.getName(),origin.getName(),typeProduct.getName(),detailBill.getAmount(),detailBill.getUnitPrice());
        return mnDetailBill;
    }

    @Override
    public MnDetailBill save(MnDetailBill mnDetailBill) {
        ProductDetail productDetail = iProductDetailRepo.selectById(mnDetailBill.getIdDetailProduct());
        Bill bill  = iBillRepo.selectById(mnDetailBill.getIdBill());
        DetailBill detailBill = new DetailBill(bill, productDetail,mnDetailBill.getAmount(),mnDetailBill.getUnitePrice());
        iDetailBillRepo.save(detailBill);
        return mnDetailBill;
    }

    @Override
    public MnDetailBill update(MnDetailBill mnDetailBill) {
              ProductDetail productDetail = iProductDetailRepo.selectById(mnDetailBill.getIdDetailProduct());
        Bill bill  = iBillRepo.selectById(mnDetailBill.getIdBill());
        DetailBill detailBill = new DetailBill(bill, productDetail,mnDetailBill.getAmount(),mnDetailBill.getUnitePrice());
        iDetailBillRepo.update(detailBill);
        return mnDetailBill;
    }

    @Override
    public void delete(String id) {
        iDetailBillRepo.delete(id);
    }

}
