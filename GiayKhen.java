/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuong;

import java.util.Date;

/**
 *
 * @author admin
 */
public class GiayKhen {
    private String hoTen;
    private Date namSinh;
    private String gioiTinh;
    private String Truong;
    private Date capNgay;
    private String nguoiCap;

    public void setCapNgay(Date capNgay) {
        this.capNgay = capNgay;
    }

    public void setNguoiCap(String nguoiCap) {
        this.nguoiCap = nguoiCap;
    }

    public Date getCapNgay() {
        return capNgay;
    }

    public String getNguoiCap() {
        return nguoiCap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getTruong() {
        return Truong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTruong(String Truong) {
        this.Truong = Truong;
    }
}
