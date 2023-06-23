/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnProduct;
import java.util.ArrayList;
import model.Product;
import repositories.ProductRepo;
import repositories.IproductRepo;

/**
 *
 * @author 84374
 */
public class ProductService implements IProductService {

    IproductRepo iProductRepo;

    public ProductService() {
        iProductRepo = new ProductRepo();
    }

    @Override
    public ArrayList<MnProduct> selectFromTable() {
        ArrayList<MnProduct> lstMnProducts = new ArrayList<>();
        ArrayList<Product> lstProduct = new ArrayList<>();
        lstProduct = iProductRepo.selectFromTable();
        for (Product repo : lstProduct) {
            lstMnProducts.add(new MnProduct(repo.getId(), repo.getCode(), repo.getName()));
        }
        return lstMnProducts;
    }

    @Override
    public MnProduct selectById(String id) {
        Product product = new Product();
        product = iProductRepo.selectById(id);
        MnProduct mnProduct = new MnProduct(product.getId(), product.getCode(), product.getName());
        return mnProduct;
    }

    @Override
    public MnProduct save(MnProduct mnPrd) {
        Product pro = new Product(mnPrd.getId(), mnPrd.getCode(), mnPrd.getName());
        iProductRepo.save(pro);
        return mnPrd;
    }

    @Override
    public MnProduct update(MnProduct mnPrd) {
        Product pro = new Product(mnPrd.getId(), mnPrd.getCode(), mnPrd.getName());
        iProductRepo.update(pro);
        return mnPrd;
    }

    @Override
    public void delete(String id) {
        iProductRepo.delete(id);
    }
}
