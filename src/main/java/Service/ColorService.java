/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnColor;
import java.util.ArrayList;
import model.Color;
import repositories.ColorRepo;
import repositories.IcolorRepo;

/**
 *
 * @author 84374
 */
public class ColorService implements IColorService {

    IcolorRepo iColorRepo;

    public ColorService() {
        iColorRepo = new ColorRepo();
        
    }
     
    @Override
    public ArrayList<Color> selectFromTable() {
        ArrayList<Color> lstColor = new ArrayList<>();
        lstColor = iColorRepo.selectFromTable();
        return lstColor;
    }

    @Override
    public MnColor selectById(String id) {
        Color clr = new Color();
        clr = iColorRepo.selectById(id);
        MnColor mnColor = new MnColor(clr.getId(), clr.getCode(), clr.getName());
        return mnColor;
    }

    @Override
    public MnColor save(MnColor mnClr) {
        Color clr = new Color(mnClr.getId(), mnClr.getCode(), mnClr.getName());
        iColorRepo.save(clr);
        return mnClr;
    }

    @Override
    public MnColor update(MnColor mnClr) {
        Color clr = new Color(mnClr.getId(), mnClr.getCode(), mnClr.getName());
        iColorRepo.update(clr);
        return mnClr;
    }

    @Override
    public void delete(String id) {
        iColorRepo.delete(id);
    }
}
