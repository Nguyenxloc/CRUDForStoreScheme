/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ViewModel.MnTypeProduct;
import java.util.ArrayList;
import model.TypeProduct;

/**
 *
 * @author 84374
 */
public interface ITypeProductService {

    ArrayList<TypeProduct> selectFromTable();

    MnTypeProduct selectById(String id);

    MnTypeProduct save(MnTypeProduct mnTypeProduct);

    MnTypeProduct update(MnTypeProduct mnTypeProduct);

    void delete(String id);
}
