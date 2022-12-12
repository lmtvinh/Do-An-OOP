package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Table;

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
    private int idIncrement = 0;
    ArrayList<PhieuNhap> phieuNhaps;

    public DanhSachPhieuNhap() {
        phieuNhaps = new ArrayList<PhieuNhap>();
    }

    public void addPhieuNhap(PhieuNhap newPhieuNhap) {
        phieuNhaps.add(newPhieuNhap);
        newPhieuNhap.setMaPhieuNhap("" + this.idIncrement++);
    }

    public void setPhieuNhaps(String maPhieuNhapCanSua, PhieuNhap newPhieuNhap) {
        for (int i = 0; i < phieuNhaps.size(); i++) {
            if (Objects.equals(phieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanSua)) {
                phieuNhaps.set(i,newPhieuNhap);
                return;
            }
        }
        System.err.println("\tID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public void removePhieuNhap(String maPhieuNhapCanXoa) {
        for (int i = 0; i < phieuNhaps.size(); i++){
            if (Objects.equals(phieuNhaps.get(i).getMaPhieuNhap(), maPhieuNhapCanXoa)) {
                phieuNhaps.remove(i);
                return;
            }
        }
        System.err.println("\tID KHÔNG CÓ TRONG DANH SÁCH.");
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

    public void getAll() {
//        Table.createTable(phieuNhaps);
        Table.printTable(phieuNhaps);
    }

    public void menuQL() {
        String luachon;
        do {
            System.out.println("Menu Phiếu Nhập Của Cửa Hàng.");
            System.out.println("1.Xem Thông Tin Phiếu Nhập.");
            System.out.println("2.Thêm Thông Tin Phiếu Nhập.");
            System.out.println("3.Sửa Thông Tin Phiếu Nhập.");
            System.out.println("4.Xóa Phiếu Nhập Trong Danh Sách.");
            System.out.println("5.Tìm Kiếm Thông Tin Phiếu Nhập Theo Mã");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Danh Sách Thông Tin Phiếu Nhập.");
                    getAll();
                }
                case "2" -> {
                    System.out.println("Nhập Thông Tin Phiếu Nhập Cần Thêm.");
                    PhieuNhap newPhieuNhap = new PhieuNhap();
                    newPhieuNhap.input();
                    addPhieuNhap(newPhieuNhap);
                }
                case "3" -> {
                    System.out.println("Danh Sách Thông Tin Phiếu Nhập.");
                    getAll();
                    System.out.println("Nhập Thông Tin Phiếu Nhập Cần Thêm.");
                    PhieuNhap newPhieuNhap = new PhieuNhap();
                    newPhieuNhap.input();
                    System.out.print("Nhập Mã Phiếu Nhập Cần Sửa: ");
                    String maPhieuNhapCanSua = scanner.nextLine();
                    setPhieuNhaps(maPhieuNhapCanSua,newPhieuNhap);
                }
                case "4" -> {
                    System.out.println("Danh Sách Thông Tin Phiếu Nhập.");
                    getAll();
                    System.out.print("Nhập Mã Phiếu Nhập Cần Xóa: ");
                    String maPhieuNhapCanXoa = scanner.nextLine();
                    removePhieuNhap(maPhieuNhapCanXoa);
                }
                case "5" -> {
                    System.out.print("Nhập Mã Phiếu Nhập Cần Tìm Kiếm: ");
                    String check = scanner.nextLine();
                    Database.getDanhSachPhieuNhap().getByIdPhieuNhap(check).output();
                }
                case "0" -> {
                    System.err.println("THOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while(luachon != "0");
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.phieuNhaps = ((DanhSachPhieuNhap)newDanhSach).phieuNhaps;
        this.idIncrement = ((DanhSachPhieuNhap)newDanhSach).idIncrement;
    }
}
