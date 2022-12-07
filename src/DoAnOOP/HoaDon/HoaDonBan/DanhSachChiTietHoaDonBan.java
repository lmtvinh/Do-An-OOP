package DoAnOOP.HoaDon.HoaDonBan;

import java.util.ArrayList;
import java.util.Scanner;

import DoAnOOP.KhoDuLieu.Database;

public class DanhSachChiTietHoaDonBan {
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<ChiTietHoaDonBan> chiTietHoaDonBans;

    public int lengthDanhSachChiTietHoaDonBan() {
        return chiTietHoaDonBans.size();
    }

    public void DanhSachChiTietHoaDonBan() {
        chiTietHoaDonBans = new ArrayList<ChiTietHoaDonBan>();
    }

    public void addChiTietHoaDonBan(ChiTietHoaDonBan newChiTietHoaDonBan) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++) {
            chiTietHoaDonBans.add(newChiTietHoaDonBan);
        }
    }

    public void setChiTietHoaDonBan(String maHoaDonCanSua, ChiTietHoaDonBan newChiTietHoaDonBan) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++ ){
            if (chiTietHoaDonBans.get(i).getMaHD() == maHoaDonCanSua) {
                chiTietHoaDonBans.set(i, newChiTietHoaDonBan);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public void removeChiTietHoaDonBan(String maHoaDonBanCanXoa, ChiTietHoaDonBan newChiTietHoaDonBan) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++){
            if (chiTietHoaDonBans.get(i).getMaHD() == maHoaDonBanCanXoa) {
                chiTietHoaDonBans.remove(i);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public ChiTietHoaDonBan getByIdChiTietHoaDonBan(String maHoaDonCanTim) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++) {
            if (chiTietHoaDonBans.get(i).getMaHD() == maHoaDonCanTim) {
                return chiTietHoaDonBans.get(i);
            }
        }
        return null;
    }
}
