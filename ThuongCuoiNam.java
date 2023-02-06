/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuong;

import models.NhanKhauModel;

/**
 *
 * @author admin
 */
public class ThuongCuoiNam {
    private int id;
    private GiayKhen GiayKhen;
    private NhanKhauModel NhanKhau;

    public int getId() {
        return id;
    }

    public GiayKhen getGiayKhen() {
        return GiayKhen;
    }

    public NhanKhauModel getNhanKhau() {
        return NhanKhau;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGiayKhen(GiayKhen GiayKhen) {
        this.GiayKhen = GiayKhen;
    }

    public void setNhanKhau(NhanKhauModel NhanKhau) {
        this.NhanKhau = NhanKhau;
    }
    
}
