/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Position;

/**
 *
 * @author 84374
 */
public class PositionRepo implements IPositionRepo {

    final String INSERT_SQL = "INSERT INTO dbo.ChucVu(Id,Ma,Ten)VALUES(?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[ChucVu] SET [Ma]=?,[Ten]=? WHERE [Id] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[ChucVu] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[ChucVu] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[ChucVu]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[ChucVu] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    @Override
    public ArrayList<Position> selectFromTable() {
        ArrayList<Position> lstPostion = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstPostion.add(new Position(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstPostion);

        return lstPostion;
    }

    @Override
    public Position selectById(String id) {
        ArrayList<Position> lstPos = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                lstPos.add(new Position(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstPos.get(0);
    }

    @Override
    public Position selectByUniID(String id) {
        ArrayList<Position> lstPos = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                lstPos.add(new Position(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstPos.get(0);
    }

    @Override
    public Position save(Position pos) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, pos.getCode(), pos.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pos;
    }

    @Override
    public Position update(Position pos) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, pos.getCode(),pos.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pos;
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
