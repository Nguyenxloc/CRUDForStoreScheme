/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnStore;
import java.util.ArrayList;
import model.Store;
import repositories.StoreRepo;
import repositories.IstoreRepo;

/**
 *
 * @author 84374
 */
public class StoreService implements IStoreService {

    IstoreRepo iStoreRepo;

    public StoreService() {
        iStoreRepo = new StoreRepo();
    }

    @Override
    public ArrayList<MnStore> selectFromTable() {
        ArrayList<MnStore> lstMnStore = new ArrayList<>();
        ArrayList<Store> lstStore = new ArrayList<>();
        lstStore = iStoreRepo.selectFromTable();
        for (Store repo : lstStore) {
            lstMnStore.add(new MnStore(repo.getId(), repo.getCode(), repo.getName(), repo.getAddr(), repo.getCity(), repo.getCountry()));
        }
        return lstMnStore;
    }

    @Override
    public MnStore selectById(String id) {
        Store str = new Store();
        str = iStoreRepo.selectById(id);
        MnStore mnStore = new MnStore(str.getId(), str.getCode(), str.getName(), str.getAddr(), str.getAddr(), str.getCountry());
        return mnStore;
    }

    @Override
    public MnStore selectByUniID(String id) {
        Store str = new Store();
        str = iStoreRepo.selectByUniID(id);
        MnStore mnStore = new MnStore(str.getId(), str.getCode(), str.getName(), str.getAddr(), str.getAddr(), str.getCountry());
        return mnStore;
    }

    @Override
    public MnStore save(MnStore mStr) {
        Store str = new Store(mStr.getId(), mStr.getCode(), mStr.getName(), mStr.getAddr(), mStr.getCity(), mStr.getCountry());
        iStoreRepo.save(str);
        return mStr;
    }

    @Override
    public MnStore update(MnStore mStr) {
        Store str = new Store(mStr.getId(), mStr.getCode(), mStr.getName(), mStr.getAddr(), mStr.getCity(), mStr.getCountry());
        iStoreRepo.update(str);
        return mStr;
    }

    @Override
    public void delete(String id) {
        iStoreRepo.delete(id);
    }

}
