/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Position;
import model.Staff;
import model.Store;

/**
 *
 * @author 84374
 */
public class StaffRepo implements IstaffRepo {

    final String INSERT_SQL = "INSERT INTO [dbo].[NhanVien]([Ma],[Ten],[TenDem],[Ho],[GioiTinh],[NgaySinh],[DiaChi],[Sdt],[MatKhau],[IdCH],[IdCV],[IdGuiBC],[TrangThai])VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    final String INSERT_SQL2 = "INSERT INTO [dbo].[NhanVien]([Ma],[Ten],[TenDem],[Ho],[GioiTinh],[NgaySinh],[DiaChi],[Sdt],[MatKhau],[IdCV],[IdGuiBC],[TrangThai])VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[NhanVien] SET [Ten]=?,[TenDem]=?,[Ho]=?,[GioiTinh]=?,[NgaySinh]=?,[DiaChi]=?,[Sdt]=?,[MatKhau]=?,[IdCH]=(SELECT CONVERT(uniqueidentifier,?)),[IdCV]=(SELECT CONVERT(uniqueidentifier,?)),[IdGuiBC]=(SELECT CONVERT(uniqueidentifier,?)),[TrangThai]=? WHERE [Id] =(SELECT CONVERT(uniqueidentifier,?))";
    final String DELETE_SQL = "DELETE FROM [dbo].[NhanVien] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[NhanVien] WHERE [Ma] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[NhanVien]";
    DBConnection dbConn = new DBConnection();

    @Override
    public ArrayList<Staff> selectFromTable() {
        dbConn.openDbConnection();
        ArrayList<Staff> lstStaff = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                StoreRepo strRepo = new StoreRepo();
                PositionRepo posRepo = new PositionRepo();
                Store str = strRepo.selectById(rs.getString("IdCH"));
                Position pos = posRepo.selectById(rs.getString("IdCV"));
                lstStaff.add(new Staff(rs.getString("Id"), rs.getString("Ma"),
                        rs.getNString("Ten"), rs.getNString("TenDem"), rs.getNString("Ho"),
                        rs.getNString("GioiTinh"), rs.getDate("NgaySinh"), rs.getString("DiaChi"),
                        rs.getString("Sdt"), rs.getString("MatKhau"), str, pos, rs.getString("IdGuiBC"),
                         rs.getInt("TrangThai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstStaff;
    }

    @Override
    public Staff selectById(String id) {
        ArrayList<Staff> lstStaff = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                StoreRepo strRepo = new StoreRepo();
                PositionRepo posRepo = new PositionRepo();
                Store str = strRepo.selectById(rs.getString("IdCH"));
                Position pos = posRepo.selectById(rs.getString("IdCV"));
                lstStaff.add(new Staff(rs.getString("Id"), rs.getString("Ma"),
                        rs.getNString("Ten"), rs.getNString("[TenDem]"),
                        rs.getNString("Ho"), rs.getNString("GioiTinh"),
                        rs.getDate("NgaySinh"), rs.getString("DiaChi"), rs.getString("Sdt"),
                        rs.getString("MatKhau"), str, pos, rs.getString("IdGuiBC"), rs.getInt("TrangThai")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstStaff.get(0);
    }

    @Override
    public Staff save(Staff stff) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL2, stff.getCode(), stff.getFirstName(), stff.getMidName(), stff.getLastName(),
                    stff.getGender(), stff.getDob(), stff.getAddr(), stff.getPhone(), stff.getPass()
                    , stff.getPos().getId(),null, stff.getStt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stff;
    }

    @Override
    public Staff update(Staff stff) {
        try {
            System.out.println(stff.getStr().getId());
            System.out.println(stff.getID());
            dbConn.ExcuteDungna(UPDATE_SQL, stff.getFirstName(), stff.getMidName(), stff.getLastName(),
                    stff.getGender(), stff.getDob(), stff.getAddr(), stff.getPhone(), stff.getPass(),
                    stff.getStr().getId(), stff.getPos().getId(),stff.getID(),stff.getStt(), stff.getID());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stff;
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
