/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cart;
import model.DetailCart;
import model.Product;
import model.ProductDetail;

/**
 * @author 84374
 */
public class DetailCartRepo implements IDetailCartRepo {

    final String INSERT_SQL = "INSERT INTO dbo.GioHangChiTiet (IdGioHang,IdChiTietSP,SoLuong,DonGia,DonGiaKhiGiam)VALUES(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE dbo.GioHangChiTiet SET idChiTietSP=?, SoLuong=?,DonGia=?,DonGiaKhiGiam=? WHERE IdGioHang=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[GioHangChiTiet] WHERE [IdGioHang] = ? and [idChiTietSP] = ?";
    final String SELECT_BY_SQLlv1 = "SELECT * FROM [dbo].[GioHangChiTiet] WHERE [IdGioHang] = ?";
    final String SELECT_BY_SQLlv2 = "SELECT * FROM [dbo].[GioHangChiTiet] WHERE [IdGioHang] = ? and [idChiTietSP] = ? ";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[GioHangChiTiet]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[GioHangChiTiet] WHERE [IdGioHang] = ?";
    DBConnection dbConn = new DBConnection();

    @Override
    public ArrayList<DetailCart> selectFromTable() {
        ArrayList<DetailCart> lstDetailCart = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                Cart cart = new Cart();
                CartRepo cartRepo = new CartRepo();
                cart = cartRepo.selectById(rs.getString("IdGioHang"));
                Product product = new Product();
                ProductRepo productRepo = new ProductRepo();
                product = productRepo.selectById(rs.getString("IdChiTietSP"));
                lstDetailCart.add(new DetailCart(cart, product, rs.getInt("SoLuong"), rs.getDouble("DonGia"), rs.getDouble("DonGiaKhiGiam")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstDetailCart);

        return lstDetailCart;
    }

    @Override
    public DetailCart selectByIdLv1(String id) {
        ArrayList<DetailCart> lstDetailCart = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQLlv1, id);
            while (rs.next()) {
                Cart cart = new Cart();
                CartRepo cartRepo = new CartRepo();
                cart = cartRepo.selectById(rs.getString("IdGioHang"));
                Product product = new Product();
                ProductRepo productRepo = new ProductRepo();
                product = productRepo.selectById(rs.getString("IdChiTietSP"));
                lstDetailCart.add(new DetailCart(cart, product, rs.getInt("SoLuong"), rs.getDouble("DonGia"), rs.getDouble("DonGiaKhiGiam")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstDetailCart.get(0);
    }

    @Override
    public DetailCart selectByUniID(String id) {
        return null;
    }

    @Override
    public DetailCart save(DetailCart detailCart) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, detailCart.getCart().getId(), detailCart.getProduct().getId(), detailCart.getAmount(), detailCart.getUnitPrice(), detailCart.getUnitOndiscount());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detailCart;
    }

    @Override
    public DetailCart update(DetailCart detailCart) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, detailCart.getAmount(), detailCart.getUnitPrice(), detailCart.getUnitOndiscount(), detailCart.getCart().getId(), detailCart.getProduct().getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return detailCart;
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
    public DetailCart selectByIdLv2(String idCart, String idDetailProduct) {
        ArrayList<DetailCart> lstDetailCart = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQLlv2, idCart,idDetailProduct);
            while (rs.next()) {
                Cart cart = new Cart();
                CartRepo cartRepo = new CartRepo();
                cart = cartRepo.selectById(rs.getString("IdGioHang"));
                Product product = new Product();
                ProductRepo productRepo = new ProductRepo();
                product = productRepo.selectById(rs.getString("IdChiTietSP"));
                lstDetailCart.add(new DetailCart(cart, product, rs.getInt("SoLuong"), rs.getDouble("DonGia"), rs.getDouble("DonGiaKhiGiam")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstDetailCart.get(0);
    }

}
