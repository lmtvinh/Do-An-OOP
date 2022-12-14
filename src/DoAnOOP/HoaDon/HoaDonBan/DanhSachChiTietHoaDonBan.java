package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Help.HoTro;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachChiTietHoaDonBan extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = 545647798l;
    public final static String DUONG_DAN_LUU_FILE = HoTro.duongDanTuongDoi + "DanhSachChiTietHoaDonBan.bin";
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
