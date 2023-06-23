/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnPos;
import java.util.ArrayList;
import model.Position;
import repositories.IPositionRepo;
import repositories.PositionRepo;

/**
 *
 * @author 84374
 */
public class PosService implements IPosService {

    IPositionRepo iPosRepo;

    public PosService() {
        iPosRepo = new PositionRepo();
    }

    @Override
    public ArrayList<Position> selectFromTable() {
        ArrayList<Position> lstPos = new ArrayList<>();
        lstPos = iPosRepo.selectFromTable();
        return lstPos;
    }

    @Override
    public MnPos selectById(String id) {
        Position pos = new Position();
        pos = iPosRepo.selectById(id);
        MnPos mnPos = new MnPos(pos.getId(), pos.getCode(), pos.getName());
        return mnPos;
    }

    @Override
    public MnPos selectByUniID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MnPos save(MnPos mnPos) {
        Position pos = new Position(mnPos.getId(), mnPos.getCode(), mnPos.getName());
        iPosRepo.save(pos);
        return mnPos;
    }

    @Override
    public MnPos update(MnPos mnPos) {
        Position pos = new Position(mnPos.getId(), mnPos.getCode(), mnPos.getName());
        iPosRepo.update(pos);
        return mnPos;
    }

    @Override
    public void delete(String id) {
        iPosRepo.delete(id);
    }

}
