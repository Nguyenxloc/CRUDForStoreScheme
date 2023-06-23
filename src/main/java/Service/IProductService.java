/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnProduct;
import java.util.ArrayList;

/**
 *
 * @author 84374
 */
public interface IProductService {

    ArrayList<MnProduct> selectFromTable();

    MnProduct selectById(String id);

    MnProduct save(MnProduct prd);

    MnProduct update(MnProduct prd);

    void delete(String id);
}
