/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author 84374
 */
public class CustomerRepo implements ICustomer {

    final String INSERT_SQL = "INSERT INTO  dbo.KhachHang(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau)VALUES(?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE  dbo.KhachHang SET Ma=?,Ten=?,TenDem=?,Ho=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=?,MatKhau=? WHERE Id = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[KhacHang] WHERE [Id] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[KhachHang] WHERE [Id] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[KhachHang]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[KhachHang] WHERE [Id] = ?";
    DBConnection dbConn = new DBConnection();
    @Override
    public ArrayList<Customer> selectFromTable() {
        ArrayList<Customer> lstCustomer = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                lstCustomer.add(new Customer(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("TenDem"), rs.getString("Ho"), rs.getDate("NgaySinh"), rs.getString("Sdt"), rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("ThanhPho"), rs.getString("MatKhau")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstCustomer);

        return lstCustomer;
    }

    @Override
    public Customer selectById(String id) {
        ArrayList<Customer> lstCus = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                lstCus.add(new Customer(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("TenDem"), rs.getString("Ho"), rs.getDate("NgaySinh"), rs.getString("Sdt"), rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("ThanhPho"), rs.getString("MatKhau")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstCus.get(0);
    }

    @Override
    public Customer save(Customer cus) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, cus.getCode(),cus.getfName(),cus.getMidname(),cus.getlName(),cus.getDob(),cus.getPhone(),cus.getAddr(),cus.getCity(),cus.getCountry(),cus.getPass());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

    @Override
    public Customer update(Customer cus) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL,cus.getCode(),cus.getfName(),cus.getMidname(),cus.getlName(),cus.getDob(),cus.getPhone(),cus.getAddr(),cus.getCity(),cus.getCountry(),cus.getPass(),cus.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
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
