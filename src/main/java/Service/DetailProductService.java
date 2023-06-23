/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnProductDetail;
import java.util.ArrayList;
import model.Color;
import model.Origin;
import model.Product;
import model.ProductDetail;
import model.TypeProduct;
import repositories.ColorRepo;
import repositories.DetailBillRepo;
import repositories.IDetailBillRepo;
import repositories.IOriginRepo;
import repositories.IProductDetailRepo;
import repositories.IcolorRepo;
import repositories.IproductRepo;
import repositories.ITypeProduct;
import repositories.OriginRepo;
import repositories.ProductDetailRepo;
import repositories.ProductRepo;
import repositories.TypeProductRepo;

/**
 *
 * @author 84374
 */
public class DetailProductService implements IDetailProductService {

    IproductRepo iproductRepo;
    IOriginRepo iOriginRepo;
    IcolorRepo iColorRepo;
    ITypeProduct iTypeProduct;
    IProductDetailRepo iProductDetailRepo;

    public DetailProductService() {
        iproductRepo = new ProductRepo();
        iOriginRepo = new OriginRepo();
        iColorRepo = new ColorRepo();
        iTypeProduct = new TypeProductRepo();
        iProductDetailRepo = new ProductDetailRepo();
    }

    @Override
    public ArrayList<ProductDetail> selectFromTable() {
        ArrayList<ProductDetail> lstProductDetail = new ArrayList<>();
        lstProductDetail = iProductDetailRepo.selectFromTable();
        return lstProductDetail;
    }

    @Override
    public MnProductDetail selectById(String id) {
        ProductDetail proDetail = iProductDetailRepo.selectById(id);
        Product product = iproductRepo.selectById(proDetail.getPro().getId());
        Color color = iColorRepo.selectById(proDetail.getId());
        Origin origin = iOriginRepo.selectById(proDetail.getId());
        TypeProduct typeProduct = iTypeProduct.selectById(proDetail.getId());
        MnProductDetail mnProductDetail = new MnProductDetail(proDetail.getId(), proDetail.getDom().getId(), proDetail.getDom().getCode(),
                proDetail.getDom().getName(), proDetail.getPro().getId(), proDetail.getPro().getCode(), proDetail.getPro().getName(), proDetail.getType().getId(),
                proDetail.getType().getCode(), proDetail.getType().getName(), proDetail.getClr().getId(), proDetail.getClr().getCode(), proDetail.getClr().getName(),
                proDetail.getDescribe(), proDetail.getQuantityOnStock(), proDetail.getDateOfWarenty(), proDetail.getPriceOfImport(), proDetail.getPriceOfSell()
        );
        return mnProductDetail;
    }

    @Override
    public MnProductDetail save(MnProductDetail mnProductDetail) {
        Product product = iproductRepo.selectById(mnProductDetail.getIdProduct());
        Color color = iColorRepo.selectById(mnProductDetail.getIdColorProduct());
        Origin origin = iOriginRepo.selectById(mnProductDetail.getIdOrigin());
        TypeProduct typeProduct = iTypeProduct.selectById(mnProductDetail.getIdTypeProduct());
        ProductDetail productDetail = new ProductDetail(mnProductDetail.getId(), product, origin, color, typeProduct, mnProductDetail.getYearIns(), mnProductDetail.getDes(), mnProductDetail.getAmountOnStocking(), mnProductDetail.getPriceOfImport(), mnProductDetail.getPriceForSell());
        iProductDetailRepo.save(productDetail);
        return mnProductDetail;
    }

    @Override
    public MnProductDetail update(MnProductDetail mnProductDetail) {
        Product product = iproductRepo.selectById(mnProductDetail.getIdProduct());
        Color color = iColorRepo.selectById(mnProductDetail.getIdColorProduct());
        Origin origin = iOriginRepo.selectById(mnProductDetail.getIdOrigin());
        TypeProduct typeProduct = iTypeProduct.selectById(mnProductDetail.getIdTypeProduct());
        ProductDetail productDetail = new ProductDetail(mnProductDetail.getId(), product, origin, color, typeProduct, mnProductDetail.getYearIns(), mnProductDetail.getDes(), mnProductDetail.getAmountOnStocking(), mnProductDetail.getPriceOfImport(), mnProductDetail.getPriceForSell());
        iProductDetailRepo.update(productDetail);
        return mnProductDetail;
    }

    @Override
    public void delete(String id) {
        iProductDetailRepo.delete(id);

    }

}
