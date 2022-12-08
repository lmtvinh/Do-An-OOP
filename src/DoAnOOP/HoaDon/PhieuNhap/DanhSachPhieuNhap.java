package DoAnOOP.HoaDon.PhieuNhap;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachPhieuNhap {
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<PhieuNhap> phieuNhaps;

    public DanhSachPhieuNhap() {
        phieuNhaps = new ArrayList<PhieuNhap>();
    }

    public void addPhieuNhap(PhieuNhap newPhieuNhap) {
        phieuNhaps.add(newPhieuNhap);
    }

    public void setPhieuNhaps(String maPhieuNhapCanSua, PhieuNhap newPhieuNhap) {
        for (int i = 0; i < phieuNhaps.size(); i++) {
            if (Objects.equals(phieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanSua)) {
                phieuNhaps.set(i,newPhieuNhap);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public void removePhieuNhap(String maPhieuNhapCanXoa) {
        for (int i = 0; i < phieuNhaps.size(); i++){
            if (Objects.equals(phieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanXoa)) {
                phieuNhaps.remove(i);
                return;
            }
        }
        System.err.println("ID KHONG CO TRONG DANH SACH.");
    }

    public int lengthOfPhieuNhaps() {
        return phieuNhaps.size();
    }

    public PhieuNhap getByIdPhieuNhap(String maPhieNhapCanTim) {
        for (int i = 0; i < phieuNhaps.size(); i++) {
            if (Objects.equals(phieuNhaps.get(i).getMaPhieuNhap(), maPhieNhapCanTim)) {
                return phieuNhaps.get(i);
            }
        }
        return null;
    }
}
