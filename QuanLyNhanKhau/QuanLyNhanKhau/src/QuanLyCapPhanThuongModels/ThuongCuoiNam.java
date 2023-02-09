/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCapPhanThuongModels;

import models.NhanKhauModel;

/**
 *
 * @author admin
 */
public class ThuongCuoiNam {
    private int id;
    private GiayKhen GiayKhen;
    private int idNhanKhau;

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public int getId() {
        return id;
    }

    public GiayKhen getGiayKhen() {
        return GiayKhen;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setGiayKhen(GiayKhen GiayKhen) {
        this.GiayKhen = GiayKhen;
    }


    
}
