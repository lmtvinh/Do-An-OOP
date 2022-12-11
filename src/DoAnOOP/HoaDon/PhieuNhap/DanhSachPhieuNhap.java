package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.File.ADanhSach;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachPhieuNhap extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = -4645645664l;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachPhieuNhap.bin";
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

    public void output() {
    }

    public void menuQL() {
        String luachon;
        do {
            System.out.println("Menu Phieu Nhap.");
            System.out.println("1.Xem Phieu Nhap.");
            System.out.println("2.Them Phieu Nhap.");
            System.out.println("3.Sua Phieu Nhap.");
            System.out.println("4.Xoa Phieu Nhap.");
            System.out.println("0.Thoat.");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    output();
                }
                case "2" -> {
                    System.out.println("Nhap thong tin Phieu Nhap can them.");
                    PhieuNhap newPhieuNhap = new PhieuNhap();
                    newPhieuNhap.input();
                    addPhieuNhap(newPhieuNhap);
                }
                case "3" -> {
                    System.out.println("Nhap thong tin Phieu Nhap can them.");
                    PhieuNhap newPhieuNhap = new PhieuNhap();
                    newPhieuNhap.input();
                    System.out.print("Nhap Ma Phieu Nhap can sua: ");
                    String maPhieuNhapCanSua = scanner.nextLine();
                    setPhieuNhaps(maPhieuNhapCanSua,newPhieuNhap);
                }
                case "4" -> {
                    System.out.print("Nhap Ma Phieu Nhap can xoa: ");
                    String maPhieuNhapCanXoa = scanner.nextLine();
                    removePhieuNhap(maPhieuNhapCanXoa);
                }
                case "0" -> {
                    System.err.println("Thoat.");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        } while(luachon != "0");
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.phieuNhaps = ((DanhSachPhieuNhap)newDanhSach).phieuNhaps;
    }
}
