/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.PhatQuaManagerController;

import QuanLyCapPhanThuongModels.GiayKhen;
import QuanLyCapPhanThuongModels.GiayKhenNamHoc;
import QuanLyCapPhanThuongModels.Qua;
import QuanLyCapPhanThuongModels.QuyDoi;
import QuanLyCapPhanThuongModels.ThuongCuoiNam;
import models.UserMoldel;
import services.PhatThuongPhatQuaService;

/**
 *
 * @author admin
 */
public class PhatThuongController {
    private UserMoldel user;

    public PhatThuongController() {
    }
    
    public UserMoldel getUser() {
        return user;
    }

    public void setUser(UserMoldel user) {
        this.user = user;
    }
    
    
    public static Qua getQuaById(int id){
        for (Qua qua : PhatThuongPhatQuaService.getListQua()){
            if (qua.getId() == id) return qua;
        }
        return null;
    }
    public static GiayKhenNamHoc getGiayKhenById(int id){
        for (GiayKhenNamHoc qua : PhatThuongPhatQuaService.getListGiayKhenNamHoc()){
            if (qua.getId() == id) return qua;
        }
        return null;
    }
    public static void INTEST(){
        for (QuyDoi quydoi : PhatThuongPhatQuaService.getListQuyDoi()){
            String hoten = "";
            String tenqua = "";
            int soluong = 0;
            String danhhieu = "";
            for (ThuongCuoiNam thuongcuoinam : PhatThuongPhatQuaService.getListThuongCuoiNam()){
                if (quydoi.getIdSuKien() == thuongcuoinam.getId()){
                    hoten = thuongcuoinam.getGiayKhenNamHoc().getHoTen();
                    danhhieu = thuongcuoinam.getGiayKhenNamHoc().getDanhHieu();
                }
            }
            tenqua = quydoi.getQua().getTenQua();
            soluong = quydoi.getQua().getSoLuong();
            System.out.print(hoten);
            System.out.print(tenqua);
            System.out.print(soluong);
            System.out.print(danhhieu);
            
        }
    }
}
