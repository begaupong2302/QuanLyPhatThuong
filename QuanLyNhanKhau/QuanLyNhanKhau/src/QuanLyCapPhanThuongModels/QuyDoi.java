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
public class QuyDoi {
    private int id;
    private Qua qua;
    private int idSuKien;
    private Date ngayPhat;

    public int getId() {
        return id;
    }

    public Qua getQua() {
        return qua;
    }

    public int getIdSuKien() {
        return idSuKien;
    }

    public Date getNgayPhat() {
        return ngayPhat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQua(Qua qua) {
        this.qua = qua;
    }

    public void setIdSuKien(int idSuKien) {
        this.idSuKien = idSuKien;
    }

    public void setNgayPhat(Date ngayPhat) {
        this.ngayPhat = ngayPhat;
    }
    
}
