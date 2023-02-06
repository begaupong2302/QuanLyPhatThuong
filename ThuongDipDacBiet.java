/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuong;

import java.util.Date;
import models.NhanKhauModel;

/**
 *
 * @author admin
 */
public class ThuongDipDacBiet {
    private int id;
    private NhanKhauModel NhanKhau;
    private String tenDip;
    private Date dip;

    public int getId() {
        return id;
    }

    public NhanKhauModel getNhanKhau() {
        return NhanKhau;
    }

    public String getTenDip() {
        return tenDip;
    }

    public Date getDip() {
        return dip;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNhanKhau(NhanKhauModel NhanKhau) {
        this.NhanKhau = NhanKhau;
    }

    public void setTenDip(String tenDip) {
        this.tenDip = tenDip;
    }

    public void setDip(Date dip) {
        this.dip = dip;
    }
    
}
