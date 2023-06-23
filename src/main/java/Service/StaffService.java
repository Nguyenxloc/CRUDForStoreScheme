/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnStaff;
import java.util.ArrayList;
import model.Position;
import model.Staff;
import model.Store;
import repositories.IPositionRepo;
import repositories.StaffRepo;
import repositories.IstaffRepo;
import repositories.IstoreRepo;
import repositories.PositionRepo;
import repositories.StoreRepo;

/**
 *
 * @author 84374
 */
public class StaffService implements IStaffService {

    IstaffRepo iStaffRepo;
    IstoreRepo iStoreRepo;
    IPositionRepo iPositionRepo;

    public StaffService() {
        iStaffRepo = new StaffRepo();
        iStoreRepo = new StoreRepo();
        iPositionRepo = new PositionRepo();
    }

    @Override
    public ArrayList<Staff> selectFromTable() {
        ArrayList<MnStaff> lstMnStaff = new ArrayList<>();
        ArrayList<Staff> lstStaff = new ArrayList<>();
        lstStaff = iStaffRepo.selectFromTable();
        return lstStaff;
    }

    @Override
    public MnStaff selectById(String id) {
        Staff staff = iStaffRepo.selectById(id);
        MnStaff mnStaff = new MnStaff(id,staff.getCode(),staff.getLastName()+" "+staff.getMidName()+" "+staff.getFirstName(),
                staff.getGender(),staff.getDob(),staff.getAddr(),staff.getPhone(),staff.getPass(),staff.getStr().getId()
                ,staff.getStr().getCode(),staff.getStr().getName(),staff.getStr().getCity(),staff.getPos().getId(),staff.getPos().getCode()
                ,staff.getPos().getName(),staff.getIdGuiBC(),staff.getStt());
        return mnStaff;
    }

    @Override
    public MnStaff save(MnStaff mnStff) {
        String[] nameSep = mnStff.getFullName().split(" ");
        Store str = iStoreRepo.selectById(mnStff.getIdStore());
        Position pos = iPositionRepo.selectById(mnStff.getIdCV());
        Staff stff = new Staff(mnStff.getId(), mnStff.getCode(), nameSep[2],nameSep[1],nameSep[0], mnStff.getGender(),
                mnStff.getDob(), mnStff.getAddr(), mnStff.getPhone(), mnStff.getPass(), str, pos, mnStff.getIdGuiBC(), mnStff.getStt());
        iStaffRepo.save(stff);
        return mnStff;
    }

    @Override
    public MnStaff update(MnStaff mnStff) {
        String[] nameSep = mnStff.getFullName().split(" ");
        Store str = iStoreRepo.selectById(mnStff.getIdStore());
        Position pos = iPositionRepo.selectById(mnStff.getIdCV());
        Staff stff = new Staff(mnStff.getId(), mnStff.getCode(), nameSep[2],nameSep[1],nameSep[0], mnStff.getGender(),
                mnStff.getDob(), mnStff.getAddr(), mnStff.getPhone(), mnStff.getPass(), str, pos, mnStff.getId(), mnStff.getStt());
        iStaffRepo.update(stff);
        return mnStff;
    }

    @Override
    public void delete(String id) {
        iStaffRepo.delete(id);
    }

}
