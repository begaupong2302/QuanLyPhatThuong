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
    private GiayKhenNamHoc GiayKhenNamHoc;
    private int idNhanKhau;

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public int getId() {
        return id;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GiayKhenNamHoc getGiayKhenNamHoc() {
        return GiayKhenNamHoc;
    }

    public void setGiayKhenNamHoc(GiayKhenNamHoc GiayKhenNamHoc) {
        this.GiayKhenNamHoc = GiayKhenNamHoc;
    }


}
