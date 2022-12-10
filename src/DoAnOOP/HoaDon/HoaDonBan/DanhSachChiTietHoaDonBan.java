package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.File.ADanhSach;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachChiTietHoaDonBan extends ADanhSach {
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachChiTietHoaDonBan.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<ChiTietHoaDonBan> chiTietHoaDonBans = new ArrayList<ChiTietHoaDonBan>();

    public int lengthDanhSachChiTietHoaDonBan() {
        return chiTietHoaDonBans.size();
    }

    public void DanhSachChiTietHoaDonBan() {

    }

    public void addChiTietHoaDonBan(ChiTietHoaDonBan newChiTietHoaDonBan) {
        chiTietHoaDonBans.add(newChiTietHoaDonBan);
    }

    public void setChiTietHoaDonBan(String maHoaDonCanSua, ChiTietHoaDonBan newChiTietHoaDonBan) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++ ){
            if (Objects.equals(chiTietHoaDonBans.get(i).getMaHD(), maHoaDonCanSua)) {
                chiTietHoaDonBans.set(i, newChiTietHoaDonBan);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public void removeChiTietHoaDonBan(String maHoaDonBanCanXoa, ChiTietHoaDonBan newChiTietHoaDonBan) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++){
            if (Objects.equals(chiTietHoaDonBans.get(i).getMaHD(), maHoaDonBanCanXoa)) {
                chiTietHoaDonBans.remove(i);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public ChiTietHoaDonBan getByIdChiTietHoaDonBan(String maHoaDonCanTim) {
        for (int i = 0; i < chiTietHoaDonBans.size(); i++) {
            if (Objects.equals(chiTietHoaDonBans.get(i).getMaHD(), maHoaDonCanTim)) {
                return chiTietHoaDonBans.get(i);
            }
        }
        return null;
    }

    public ArrayList<ChiTietHoaDonBan> getChiTietHoaDonBan(String idHoaDon) {
        ArrayList<ChiTietHoaDonBan> arr = new ArrayList<>();
        for (int i = 0; i < chiTietHoaDonBans.size(); i++) {
            if (Objects.equals(chiTietHoaDonBans.get(i).getMaHD(), idHoaDon)) {
                arr.add(chiTietHoaDonBans.get(i));
            }
        }
        return arr;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.chiTietHoaDonBans = ((DanhSachChiTietHoaDonBan)newDanhSach).chiTietHoaDonBans;
    }
}
