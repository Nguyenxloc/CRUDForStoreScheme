/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TypeProduct;

/**
 *
 * @author 84374
 */
public class TypeProductRepo implements ITypeProduct{
  final String INSERT_SQL = "INSERT INTO dbo.DongSP(Ma,Ten)VALUES(?,?)";
    final String UPDATE_SQL = "update dbo.DongSp SET Ma=?,Ten=? WHERE Id=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[DongSp] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[DongSp] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[DongSp]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[DongSp] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    ProductDetailRepo productDetailRepo = new ProductDetailRepo();
    @Override
    public ArrayList<TypeProduct> selectFromTable() {
        ArrayList<TypeProduct> lstTypeProduct = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstTypeProduct.add(new TypeProduct(rs.getString("Id"),rs.getString("Ma"),rs.getString("Ten")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTypeProduct;
    }

    @Override
    public TypeProduct selectById(String id) {
        ArrayList<TypeProduct> lstTypeProduct = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                lstTypeProduct.add(new TypeProduct(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTypeProduct.get(0);
    }

    @Override
    public TypeProduct save(TypeProduct typeProduct) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, typeProduct.getCode(), typeProduct.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeProduct;
    }

    @Override
    public TypeProduct update(TypeProduct typeProduct) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, typeProduct.getCode(), typeProduct.getName(),typeProduct.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeProduct;
    }

    @Override
    public void delete(String id) {
        try {
            dbConn.ExcuteDungna(DELETE_SQL, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
