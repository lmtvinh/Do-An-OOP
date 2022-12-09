package DoAnOOP.HoaDon.PhieuNhap;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachChiTietPhieuNhap {
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<ChiTietPhieuNhap> chiTietPhieuNhaps;

    public DanhSachChiTietPhieuNhap() {
        chiTietPhieuNhaps = new ArrayList<ChiTietPhieuNhap>();
    }

    public void addPhieuNhap(ChiTietPhieuNhap newPhieuNhap) {
        chiTietPhieuNhaps.add(newPhieuNhap);
    }

    public void setPhieuNhaps(String maPhieuNhapCanSua, ChiTietPhieuNhap newPhieuNhap) {
        for (int i = 0; i < chiTietPhieuNhaps.size(); i++) {
            if (Objects.equals(chiTietPhieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanSua)) {
                chiTietPhieuNhaps.set(i,newPhieuNhap);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH");
    }

    public void removePhieuNhap(String maPhieuNhapCanXoa) {
        for (int i  = 0; i < chiTietPhieuNhaps.size(); i++) {
            if (Objects.equals(chiTietPhieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanXoa)) {
                chiTietPhieuNhaps.remove(chiTietPhieuNhaps.get(i));
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH");
    }

    public ChiTietPhieuNhap getByIdChiTietPhieuNhap(String maPhieuNhapCanTim) {
        for (int i = 0; i < chiTietPhieuNhaps.size(); i++) {
            if (Objects.equals(chiTietPhieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanTim)) {
                return chiTietPhieuNhaps.get(i);
            }
        }
        return null;
    }

    public ArrayList<ChiTietPhieuNhap> getChiTietPhieuNhap(String idPhieuNhap) {
        ArrayList<ChiTietPhieuNhap> arr = new ArrayList<>();
        for (int i  = 0; i < chiTietPhieuNhaps.size(); i++) {
            if (Objects.equals(chiTietPhieuNhaps.get(i).getMaPhieuNhap(), idPhieuNhap)) {
                arr.add(chiTietPhieuNhaps.get(i));
            }
        }
        return arr;
    }

}
