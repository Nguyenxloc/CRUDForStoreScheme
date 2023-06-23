/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Bill;
import model.DetailBill;
import model.Product;
import model.ProductDetail;

/**
 *
 * @author 84374
 */
public class DetailBillRepo implements IDetailBillRepo {

    final String INSERT_SQL = "INSERT INTO dbo.HoaDonChiTiet(IdHoaDon,IdChiTietSP,SoLuong,DonGia)VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE dbo.HoaDonChiTiet SET IdChiTietSP=?,SoLuong=?,DonGia=? WHERE IdHoaDon=?;";
    final String DELETE_SQL = "DELETE FROM [dbo].[HoaDonChiTiet] WHERE [IdHoaDon] = ? AND [IdChiTietSP] = ? ";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[HoaDonChiTiet] WHERE [IdHoaDon] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[HoaDonChiTiet]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[HoaDonChiTiet] WHERE [IdHoaDon] = ?";
    DBConnection dbConn = new DBConnection();

    @Override

    public ArrayList<DetailBill> selectFromTable() {
        ArrayList<DetailBill> lstDetailBill = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                Bill bill = new Bill();
                BillRepo billRepo = new BillRepo();
                bill = billRepo.selectById(rs.getString("IdHoaDon"));
                ProductDetail productDetail = new ProductDetail();
                ProductDetailRepo productDetailRepo = new ProductDetailRepo();
                productDetail = productDetailRepo.selectById(rs.getString("IdChiTietSP"));
                lstDetailBill.add(new DetailBill(bill, productDetail, rs.getInt("SoLuong"), rs.getDouble("DonGia")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lstDetailBill);
        return lstDetailBill;
    }

    @Override
    public DetailBill selectById(String idBill,String idProduct) {
        ArrayList<DetailBill> lstDetailBill = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, idBill,idProduct);
            while (rs.next()) {
                Bill bill = new Bill();
                BillRepo billRepo = new BillRepo();
                bill = billRepo.selectById(rs.getString("IdHoaDon"));
                ProductDetail productDetail = new ProductDetail();
                ProductDetailRepo productDetailRepo = new ProductDetailRepo();
                productDetail = productDetailRepo.selectById(rs.getString("IdChiTietSP"));
                lstDetailBill.add(new DetailBill(bill, productDetail, rs.getInt("SoLuong"), rs.getDouble("DonGia")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstDetailBill.get(0);
    }

    @Override
    public DetailBill selectByUniID(String id) {
        return null;
    }

    @Override
    public DetailBill save(DetailBill detailBill) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL,detailBill.getBill().getId(),detailBill.getIdProductDetail().getId(),detailBill.getAmount(),detailBill.getUnitPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detailBill;
    }

    @Override
    public DetailBill update(DetailBill detailBill) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL,detailBill.getIdProductDetail().getId(),detailBill.getAmount(),detailBill.getUnitPrice(),detailBill.getBill().getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detailBill;
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
