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
public class lichsucap {
    private int ID;
    private int IDphanthuong;
    private int soluong;
    private Date ngaycap;
    private int IDnguoicap;

    public int getID() {
        return ID;
    }

    public int getIDphanthuong() {
        return IDphanthuong;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public int getIDnguoicap() {
        return IDnguoicap;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIDphanthuong(int IDphanthuong) {
        this.IDphanthuong = IDphanthuong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public void setIDnguoicap(int IDnguoicap) {
        this.IDnguoicap = IDnguoicap;
    }
    
}
