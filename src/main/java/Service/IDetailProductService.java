/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.MnProductDetail;
import java.util.ArrayList;
import model.ProductDetail;

/**
 *
 * @author 84374
 */
public interface IDetailProductService {

    ArrayList<ProductDetail> selectFromTable();

    MnProductDetail selectById(String id);

    MnProductDetail save(MnProductDetail mnDetailBill);

    MnProductDetail update(MnProductDetail mnDetailBill);

    void delete(String id);
}
