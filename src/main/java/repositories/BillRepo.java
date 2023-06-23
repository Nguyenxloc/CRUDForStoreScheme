/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Bill;
import model.Customer;
import model.Staff;

public class BillRepo implements IBillRepo {
    final String INSERT_SQL = "INSERT INTO dbo.HoaDon(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE dbo.HoaDon SET IdKH=?,IdNV=? Ma=?,NgayTao=?,NgayThanhToan=?,NgayShip=?,NgayNhan=?,TinhTrang=?,TenNguoiNhan=?,DiaChi=?,Sdt=? WHERE id=?;";
    final String DELETE_SQL = "DELETE FROM [dbo].[HoaDon] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[HoaDon] WHERE [Ma] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[HoaDon]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[HoaDon] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    @Override
    public ArrayList<Bill> selectFromTable() {
        ArrayList<Bill> listBill = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            
            while (rs.next()) {
                Customer cus = new Customer();
                Staff stff = new Staff();
                CustomerRepo customerRepo = new CustomerRepo();
                StaffRepo staffRepo = new StaffRepo();
                stff = staffRepo.selectById(rs.getString("IdNV"));
                cus = customerRepo.selectById(rs.getString("IdKH"));
                listBill.add(new Bill(rs.getString("Id"),cus,stff,rs.getString("Ma"), rs.getDate("NgayTao"), rs.getDate("NgayThanhToan"), rs.getDate("NgayShip"), rs.getDate("NgayNhan"),rs.getInt("TinhTrang"), rs.getString("TenNguoiNhan"), rs.getString("DiaChi"), rs.getString("SDT")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listBill);

        return listBill;
    }

    @Override
    public Bill selectById(String id) {
        ArrayList<Bill> lstBill = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                  Customer cus = new Customer();
                Staff stff = new Staff();
                CustomerRepo customerRepo = new CustomerRepo();
                StaffRepo staffRepo = new StaffRepo();
                stff = staffRepo.selectById(rs.getString("IdNV"));
                cus = customerRepo.selectById(rs.getString("IdKH"));
                lstBill.add(new Bill(rs.getString("Id"),cus,stff,rs.getString("Ma"), rs.getDate("NgayTao"), rs.getDate("NgayThanhToan"), rs.getDate("NgayShip"), rs.getDate("NgayNhan"),rs.getInt("TinhTrang"), rs.getString("TenNguoiNhan"), rs.getString("DiaChi"), rs.getString("SDT")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstBill.get(0);
    }

    @Override
    public Bill save(Bill bill) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL,bill.getId(), bill.getCustomer().getId(), bill.getStaff().getID(),bill.getCode(),bill.getDateOfGen(),bill.getDateOfPur(),bill.getDateOfShip(),bill.getDateOfReceive(),bill.getStt(),bill.getNameOfOwnerBill(),bill.getAddr(),bill.getPhone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bill;
    }

    @Override
    public Bill update(Bill bill) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, bill.getCustomer().getId(), bill.getStaff().getID(),bill.getCode(),bill.getDateOfGen(),bill.getDateOfPur(),bill.getDateOfShip(),bill.getDateOfReceive(),bill.getStt(),bill.getNameOfOwnerBill(),bill.getAddr(),bill.getPhone(),bill.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bill;
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
