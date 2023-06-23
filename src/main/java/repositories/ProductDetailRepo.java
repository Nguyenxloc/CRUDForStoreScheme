/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Ultilities.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Color;
import model.Origin;
import model.Product;
import model.ProductDetail;
import model.TypeProduct;

/**
 *
 * @author 84374
 */
public class ProductDetailRepo implements IProductDetailRepo {
    final String INSERT_SQL = "INSERT INTO dbo.ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan)VALUES(?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE dbo.ChiTietSP SET IdNsx=?,IdMauSac=?,IdDongSP=?,NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? WHERE IdSP=?";
    final String DELETE_SQL = "DELETE FROM [dbo].[ChiTietSP] WHERE [IdSP] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[ChiTietSP] WHERE [IdSP] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[ChiTietSP]";
    final String SELECT_BY_UNIID = "SELECT * FROM [dbo].[ChiTietSP] WHERE [IdSP] = ?";
    DBConnection dbConn = new DBConnection();

    @Override
    public ArrayList<ProductDetail> selectFromTable() {
        ArrayList<ProductDetail> lstProductDetails = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getALl(SELECT_ALL_SQL);
            while (rs.next()) {
                Product product = new Product();
                ProductRepo productRepo = new ProductRepo();
                product = productRepo.selectById(rs.getString("idSP"));
                Origin origin  = new Origin();
                OriginRepo originRepo = new OriginRepo();
                origin =  originRepo.selectById(rs.getString("idNsx"));
                Color  color  = new Color();
                ColorRepo colorRepo = new ColorRepo();
                color  = colorRepo.selectById(rs.getString("idMauSac"));
                TypeProduct typeProduct =  new TypeProduct(); 
                lstProductDetails.add(new ProductDetail(rs.getString("Id"),product,origin,color,typeProduct, rs.getInt("NamBH"), rs.getNString("MoTa"),rs.getInt("SoLuongTon"),rs.getDouble("GiaNhap"),rs.getDouble("GiaBan")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstProductDetails;
    }

    @Override
    public ProductDetail selectById(String id) {
        ArrayList<ProductDetail> lstProductDetails = new ArrayList<>();
        try {
            ResultSet rs = dbConn.getDataFromQuery(SELECT_BY_SQL, id);
            while (rs.next()) {
                  Product product = new Product();
                ProductRepo productRepo = new ProductRepo();
                product = productRepo.selectById(rs.getString("idSP"));
                Origin origin  = new Origin();
                OriginRepo originRepo = new OriginRepo();
                origin =  originRepo.selectById(rs.getString("idNsx"));
                Color  color  = new Color();
                ColorRepo colorRepo = new ColorRepo();
                color  = colorRepo.selectById(rs.getString("idMauSac"));
                TypeProduct typeProduct =  new TypeProduct(); 
                lstProductDetails.add(new ProductDetail(rs.getString("Id"),product,origin,color,typeProduct, rs.getInt("NamBH"), rs.getNString("MoTa"),rs.getInt("SoLuongTon"),rs.getDouble("GiaNhap"),rs.getDouble("GiaBan")));
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstProductDetails.get(0);
    }

    @Override
    public ProductDetail save(ProductDetail productDetail) {
        try {
            dbConn.ExcuteDungna(INSERT_SQL, productDetail.getPro().getId(), productDetail.getDom().getId(),productDetail.getClr().getId(),productDetail.getType().getId(),productDetail.getDateOfWarenty(),productDetail.getDescribe(),productDetail.getQuantityOnStock(),productDetail.getPriceOfImport(),productDetail.getPriceOfSell());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productDetail;
    }

    @Override
    public ProductDetail update(ProductDetail productDetail) {
        try {
            dbConn.ExcuteDungna(UPDATE_SQL, productDetail.getDom().getId(),productDetail.getClr().getId(),productDetail.getType().getId(),productDetail.getDateOfWarenty(),productDetail.getDescribe(),productDetail.getQuantityOnStock(),productDetail.getPriceOfImport(),productDetail.getPriceOfSell(),productDetail.getPro().getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return productDetail;
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
