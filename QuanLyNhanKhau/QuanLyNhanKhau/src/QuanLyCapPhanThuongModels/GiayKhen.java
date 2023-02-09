/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuongModels;

import java.util.Date;

/**
 *
 * @author admin
 */
public class GiayKhen {
    private int id;
    private String hoTen;
    private String Truong;
    private Date capNgay;
    private String nguoiCap;

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getTruong() {
        return Truong;
    }

    public Date getCapNgay() {
        return capNgay;
    }

    public String getNguoiCap() {
        return nguoiCap;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTruong(String Truong) {
        this.Truong = Truong;
    }

    public void setCapNgay(Date capNgay) {
        this.capNgay = capNgay;
    }

    public void setNguoiCap(String nguoiCap) {
        this.nguoiCap = nguoiCap;
    }
    
}
