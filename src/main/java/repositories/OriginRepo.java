/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Origin;
import model.ProductDetail;

/**
 *
 * @author 84374
 */
public class OriginRepo implements IOriginRepo {

    final String INSERT_SQL = "INSERT INTO dbo.NSX(Ma,Ten)VALUES(?,?)";
    final String UPDATE_SQL = "update dbo.NSX SET Ma=?,Ten=? WHERE Id=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[NSX] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[NSX] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[NSX]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[NSX] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    ProductDetailRepo productDetailRepo = new ProductDetailRepo();
    @Override
    public ArrayList<Origin> selectFromTable() {
        ArrayList<Origin> lstOrigin = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                ProductDetail productDetail = new ProductDetail();
                lstOrigin.add(new Origin(rs.getString("Id"),rs.getString("Ma"),rs.getString("Ten")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstOrigin);
        return lstOrigin;
    }

    @Override
    public Origin selectById(String id) {
        Origin origin = new Origin();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                new Origin(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return origin;
    }

    @Override
    public Origin save(Origin orgn) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, orgn.getCode(), orgn.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orgn;
    }

    @Override
    public Origin update(Origin orgn) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, orgn.getCode(), orgn.getName(),orgn.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return orgn;
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
