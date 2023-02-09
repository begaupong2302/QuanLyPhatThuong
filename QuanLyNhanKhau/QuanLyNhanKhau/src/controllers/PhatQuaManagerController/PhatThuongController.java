/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.PhatQuaManagerController;

import QuanLyCapPhanThuongModels.GiayKhen;
import QuanLyCapPhanThuongModels.Qua;
import services.PhatThuongPhatQuaService;

/**
 *
 * @author admin
 */
public class PhatThuongController {
    public static Qua getQuaById(int id){
        for (Qua qua : PhatThuongPhatQuaService.getListQua()){
            if (qua.getId() == id) return qua;
        }
        return null;
    }
    public static GiayKhen getGiayKhenById(int id){
        for (GiayKhen qua : PhatThuongPhatQuaService.getListGiayKhenHocSinhGioi()){
            if (qua.getId() == id) return qua;
        }
        for (GiayKhen qua : PhatThuongPhatQuaService.getListGiayKhenNamHoc()){
            if (qua.getId() == id) return qua;
        }
        return null;
    }
}
