/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cart;
import model.Customer;
import model.Staff;

/**
 *
 * @author 84374
 */
public class CartRepo implements ICartRepo {

    final String INSERT_SQL = "INSERT INTO dbo.GioHang(IdKH,IdNV,Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang)VALUES(?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE dbo.GioHang SET IdKH=?,IdNV=?,Ma=?,NgayTao=?,NgayThanhToan=?,TenNguoiNhan=?,DiaChi=?,Sdt=?,TinhTrang=? WHERE Id=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[GioHang] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[GioHang] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[GioHang]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[GioHang] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();

    @Override
    public ArrayList<Cart> selectFromTable() {
        ArrayList<Cart> lstCart = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                Customer cus = new Customer();
                Staff stff = new Staff();
                CustomerRepo customerRepo = new CustomerRepo();
                StaffRepo staffRepo = new StaffRepo();
                stff = staffRepo.selectById(rs.getString("IdNV"));
                cus = customerRepo.selectById(rs.getString("IdKH"));
                lstCart.add(new Cart(rs.getString("Id"), cus, stff, rs.getString("Ma"), rs.getDate("NgayTao"), rs.getDate("NgayThanhToan"), rs.getString("TenNguoiNhan"), rs.getString("DiaChi"), rs.getString("Sdt"), rs.getInt("TinhTrang")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstCart);

        return lstCart;
    }

    @Override
    public Cart selectById(String id) {
        ArrayList<Cart> lstCart = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                Customer cus = new Customer();
                Staff stff = new Staff();
                CustomerRepo customerRepo = new CustomerRepo();
                StaffRepo staffRepo = new StaffRepo();
                stff = staffRepo.selectById(rs.getString("IdNV"));
                cus = customerRepo.selectById(rs.getString("IdKH"));
                lstCart.add(new Cart(rs.getString("Id"), cus, stff, rs.getString("Ma"), rs.getDate("NgayTao"), rs.getDate("NgayThanhToan"), rs.getString("TenNguoiNhan"), rs.getString("DiaChi"), rs.getString("Sdt"), rs.getInt("TinhTrang")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstCart.get(0);
    }


    @Override
    public Cart save(Cart cart) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, cart.getId(),cart.getCustomer().getId(),cart.getStaff().getID(),cart.getCode(),cart.getDateOfGen(),cart.getDateOfCheck(),cart.getNameOfPur(),cart.getAddr(),cart.getPhone(),cart.getStt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cart;
    }

    @Override
    public Cart update(Cart cart) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL,cart.getCustomer().getId(),cart.getStaff().getID(),cart.getCode(),cart.getDateOfGen(),cart.getDateOfCheck(),cart.getNameOfPur(),cart.getAddr(),cart.getPhone(),cart.getStt(),cart.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cart;
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
    public Cart selectByUniID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
