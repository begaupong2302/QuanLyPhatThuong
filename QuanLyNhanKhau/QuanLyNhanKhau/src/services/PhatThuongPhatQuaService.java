/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import QuanLyCapPhanThuongModels.GiayKhen;
import QuanLyCapPhanThuongModels.GiayKhenHocSInhGioi;
import QuanLyCapPhanThuongModels.GiayKhenNamHoc;
import QuanLyCapPhanThuongModels.Qua;
import QuanLyCapPhanThuongModels.QuyDoi;
import QuanLyCapPhanThuongModels.ThuongCuoiNam;
import QuanLyCapPhanThuongModels.ThuongDipDacBiet;
import controllers.PhatQuaManagerController.PhatThuongController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PhatThuongPhatQuaService {
    //list
    public static List<Qua> getListQua(){
        List<Qua> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.loai_qua;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                Qua qua = new Qua();
                qua.setId(rs.getInt("id"));
                qua.setTenQua(rs.getString("tenQua"));
                qua.setGiaTri(rs.getInt("giaTri"));
                qua.setSoLuong(rs.getInt("soLuong"));
        
                list.add(qua);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static List<GiayKhenHocSInhGioi> getListGiayKhenHocSinhGioi(){
        List<GiayKhenHocSInhGioi> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.giay_khen_hoc_sinh_gioi;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                GiayKhenHocSInhGioi giaykhen = new GiayKhenHocSInhGioi();
                giaykhen.setId(rs.getInt("id"));
                giaykhen.setHoTen(rs.getString("hoTen"));
                giaykhen.setTruong(rs.getString("Truong"));
                giaykhen.setCapNgay(rs.getDate("capNgay"));
                giaykhen.setNguoiCap(rs.getString("nguoiCap"));
                giaykhen.setCap(rs.getString("cap"));
                giaykhen.setGiai(rs.getString("Giai"));
        
                list.add(giaykhen);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static List<GiayKhenNamHoc> getListGiayKhenNamHoc(){
        List<GiayKhenNamHoc> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.giay_khen_nam_hoc;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                GiayKhenNamHoc giaykhen = new GiayKhenNamHoc();
                giaykhen.setId(rs.getInt("id"));
                giaykhen.setHoTen(rs.getString("hoTen"));
                giaykhen.setTruong(rs.getString("Truong"));
                giaykhen.setCapNgay(rs.getDate("capNgay"));
                giaykhen.setNguoiCap(rs.getString("nguoiCap"));
                giaykhen.setLop(rs.getString("lop"));
                giaykhen.setDanhHieu(rs.getString("danhHieu"));
        
                list.add(giaykhen);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static List<QuyDoi> getListQuyDoi(){
        List<QuyDoi> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.quy_doi;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                QuyDoi giaykhen = new QuyDoi();
                giaykhen.setId(rs.getInt("id"));
                giaykhen.setQua(PhatThuongController.getQuaById(rs.getInt("idQua")));
                giaykhen.setIdSuKien(rs.getInt("idSuKien"));
                giaykhen.setNgayPhat(rs.getDate("ngayPhat"));
        
                list.add(giaykhen);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static List<ThuongCuoiNam> getListThuongCuoiNam(){
        List<ThuongCuoiNam> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.thuong_cuoi_nam;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                ThuongCuoiNam giaykhen = new ThuongCuoiNam();
                giaykhen.setId(rs.getInt("id"));
                giaykhen.setGiayKhen(PhatThuongController.getGiayKhenById(rs.getInt("idGiayKhen")));
                giaykhen.setIdNhanKhau(rs.getInt("idNhanKhau"));
        
                list.add(giaykhen);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static List<ThuongDipDacBiet> getListThuongDipDacBiet(){
        List<ThuongDipDacBiet> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM quan_ly_nhan_khau.thuong_dip_dac_biet;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                ThuongDipDacBiet giaykhen = new ThuongDipDacBiet();
                giaykhen.setId(rs.getInt("id"));
                giaykhen.setTenDip(rs.getString("tenDip"));
                giaykhen.setIdNhanKhau(rs.getInt("idNhanKhau"));
                giaykhen.setDip(rs.getDate("ngay"));
        
                list.add(giaykhen);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    //add
    
}
