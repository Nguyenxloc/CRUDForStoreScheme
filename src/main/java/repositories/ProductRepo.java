/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author 84374
 */
public class ProductRepo implements IproductRepo {

    final String INSERT_SQL = "INSERT INTO [dbo].[SanPham]([Ma],[Ten])VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[SanPham] SET [Ten] = ? WHERE [Ma] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[SanPham] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[SanPham] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[SanPham]";
    DBConnection dbConn = new DBConnection();
    @Override
    public ArrayList<Product> selectFromTable() {
              dbConn.openDbConnection();
        ArrayList<Product> lstProduct = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstProduct.add(new Product(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstProduct;
    }

    @Override
    public Product selectById(String id) {
               Product product =null;
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                product=new Product(rs.getString("Id"), rs.getString("Ma"), rs.getNString("Ten"));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public Product save(Product prd) {
              try {
            dbConn.ExcuteDungna(INSERT_SQL, prd.getCode(), prd.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prd;
    }

    @Override
    public Product update(Product prd) {
               try {
            dbConn.ExcuteDungna(UPDATE_SQL, prd.getName(), prd.getCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prd;
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
