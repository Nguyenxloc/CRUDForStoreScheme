/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Color;

/**
 *
 * @author 84374
 */
public class ColorRepo implements IcolorRepo {

    final String INSERT_SQL = "INSERT INTO [dbo].[MauSac]([Ma],[Ten])VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[MauSac] SET [Ma]=?,[Ten] = ? WHERE [Id] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[MauSac] WHERE [Id] = ?";
    final String SELECT_BY_ID = "SELECT * FROM [dbo].[MauSac] WHERE [Ma] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[MauSac]";
    DBConnection dbConn = new DBConnection();

    @Override
    public ArrayList<Color> selectFromTable() {
        dbConn.openDbConnection();
        ArrayList<Color> lstColor = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstColor.add(new Color(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstColor;
    }

    @Override
    public Color selectById(String id) {
        Color color= new Color();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_ID, id);
            while (rs.next()) {
                color = new Color(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return color;
    }

    @Override
    public Color save(Color clr) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, clr.getCode(), clr.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return clr;
    }

    @Override
    public Color update(Color clr) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL,clr.getCode(), clr.getName(), clr.getCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return clr;
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
