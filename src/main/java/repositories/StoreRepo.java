/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Store;

/**
 *
 * @author 84374
 */
public class StoreRepo implements IstoreRepo {
    final String INSERT_SQL = "INSERT INTO [dbo].[CuaHang]([Ma],[Ten],[DiaChi],[ThanhPho],[QuocGia])VALUES(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[CuaHang] SET [Ten]=?,[DiaChi]=?,[ThanhPho]=?,[QuocGia]=? WHERE [Id] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[CuaHang] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[CuaHang] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[CuaHang]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[CuaHang] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    @Override
    public ArrayList<Store> selectFromTable() {
        ArrayList<Store> lstStores = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstStores.add(new Store(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("QuocGia")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstStores);
        
        return lstStores;
    }

    @Override
    public Store selectById(String id) {
        Store store=null;
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                store  = new Store(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("QuocGia"));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return store;
    }

    @Override
    public Store save(Store str) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, str.getCode(), str.getName(), str.getAddr(), str.getCity(), str.getCountry());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public Store update(Store str) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, str.getName(), str.getAddr(), str.getCity(), str.getCountry(), str.getCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public void delete(String id) {
        try {
            dbConn.ExcuteDungna(DELETE_SQL, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Store selectByUniID(String id) {
        ArrayList<Store> lstStores = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                lstStores.add(new Store(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("QuocGia")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstStores.get(0);
    }
}
