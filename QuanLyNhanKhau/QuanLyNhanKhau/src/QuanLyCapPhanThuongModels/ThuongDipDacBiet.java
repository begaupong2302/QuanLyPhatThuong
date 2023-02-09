/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuongModels;

import java.util.Date;
import models.NhanKhauModel;

/**
 *
 * @author admin
 */
public class ThuongDipDacBiet {
    private int id;
    private int idNhanKhau;
    private String tenDip;
    private Date dip;

    public int getId() {
        return id;
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

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public void setTenDip(String tenDip) {
        this.tenDip = tenDip;
    }

    public void setDip(Date dip) {
        this.dip = dip;
    }
    
}
