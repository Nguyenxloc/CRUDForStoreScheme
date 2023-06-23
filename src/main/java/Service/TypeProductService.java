/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnTypeProduct;
import java.util.ArrayList;
import model.TypeProduct;
import repositories.ITypeProduct;
import repositories.TypeProductRepo;

/**
 *
 * @author 84374
 */
public class TypeProductService implements ITypeProductService {

    ITypeProduct itypeRepo;

    public TypeProductService() {
        itypeRepo = new TypeProductRepo();
    }

    @Override
    public ArrayList<TypeProduct> selectFromTable() {
        ArrayList<TypeProduct> lstTypeProduct = new ArrayList<>();
        lstTypeProduct = itypeRepo.selectFromTable();
        return lstTypeProduct;
    }

    @Override
    public MnTypeProduct selectById(String id) {
        TypeProduct typeProduct = new TypeProduct();
        typeProduct = itypeRepo.selectById(id);
        MnTypeProduct mnTypeProduct = new MnTypeProduct(typeProduct.getId(),typeProduct.getCode(),typeProduct.getName());
        return mnTypeProduct;
    }

    @Override
    public MnTypeProduct save(MnTypeProduct mnTypeProduct) {
        TypeProduct typeProduct = new TypeProduct(mnTypeProduct.getId(),mnTypeProduct.getCode(),mnTypeProduct.getName());
        itypeRepo.save(typeProduct);
        return mnTypeProduct;
    }

    @Override
    public MnTypeProduct update(MnTypeProduct mnTypeProduct) {
        TypeProduct typeProduct = new TypeProduct(mnTypeProduct.getId(),mnTypeProduct.getCode(),mnTypeProduct.getName());
        itypeRepo.update(typeProduct);
        return mnTypeProduct;
    }

    @Override
    public void delete(String id) {
        itypeRepo.delete(id);
    }

}
