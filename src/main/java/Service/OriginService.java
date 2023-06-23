/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnOrigin;
import java.util.ArrayList;
import model.Origin;
import model.ProductDetail;
import repositories.IOriginRepo;
import repositories.IProductDetailRepo;
import repositories.OriginRepo;
import repositories.ProductDetailRepo;

/**
 *
 * @author 84374
 */
public class OriginService implements IOriginService {

    IOriginRepo iOriginRepo;
    IProductDetailRepo iProductDetailRepo;

    public OriginService() {
        iOriginRepo = new OriginRepo();
        iProductDetailRepo = new ProductDetailRepo();
    }

    @Override
    public ArrayList<MnOrigin> selectFromTable() {
        ArrayList<Origin> lstOrigin = new ArrayList<>();
        lstOrigin = iOriginRepo.selectFromTable();
        ArrayList<MnOrigin> lstMnOrigin = new ArrayList<>();
        
        for (Origin repo : lstOrigin) {
            lstMnOrigin.add(new MnOrigin(repo.getId(), repo.getCode(), repo.getName()));
        }
        return lstMnOrigin;
    }

    @Override
    public MnOrigin selectById(String id) {
        Origin origin = new Origin();
        origin = iOriginRepo.selectById(id);
        MnOrigin mnOrigin =  new MnOrigin(origin.getId(),origin.getCode(),origin.getName());          
        return mnOrigin;
    }

    @Override
    public MnOrigin save(MnOrigin mnOrigin) {
        ProductDetail productDetail  = new ProductDetail();
        Origin origin = new Origin( mnOrigin.getId(), mnOrigin.getCode(), mnOrigin.getName());
        iOriginRepo.save(origin);
        return mnOrigin;
    }

    @Override
    public MnOrigin update(MnOrigin mnOrigin) {
        ProductDetail productDetail  = new ProductDetail();
        Origin origin = new Origin(mnOrigin.getId(), mnOrigin.getCode(), mnOrigin.getName());
        iOriginRepo.update(origin);
        return mnOrigin;
    }

    @Override
    public void delete(String id) {
        iOriginRepo.delete(id);
    }

}
