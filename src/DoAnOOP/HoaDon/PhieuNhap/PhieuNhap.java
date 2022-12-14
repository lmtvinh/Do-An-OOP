package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.People.Employee;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.ThongTin.Provider;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class PhieuNhap implements Output, Serializable {
    @Serial
    private static long serialVersion = -4651454612311l;
    final static Scanner scanner = new Scanner(System.in);
    private String maPhieuNhap, maNhanVien, maNhaCungCap;
    private Date ngayNhap;
    private int tongTien;

    public PhieuNhap() {
    }

    public PhieuNhap(String maNhanVien, String maNhaCungCap, Date ngayNhap) {
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public static void setSerialVersion(long serialVersion) {
        PhieuNhap.serialVersion = serialVersion;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Employee getNhanVien() {
        return Database.getDanhSachNhanVien().getByIdEmployee(getMaNhanVien());
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public Provider getNhaCungCap() {
        return Database.getDanhSachNCC().getByIdProvider(getMaNhaCungCap());
    }

    public ArrayList<ChiTietPhieuNhap> getChiTietPhieuNhap() {
        return Database.getDanhSachChiTietPhieuNhap().getChiTietPhieuNhap(getMaPhieuNhap());
    }

//    public int getTongTien() {
//        for (int i = 0; i < Database.getDanhSachChiTietPhieuNhap().getChiTietPhieuNhap(getMaPhieuNhap()).size();i++) {
//            tongTien += Database.getChiTietPhieuNhap(getMaPhieuNhap()).getThanhTienPC();
//            tongTien += Database.getChiTietPhieuNhap(getMaPhieuNhap()).getThanhTienLaptop();
//        }
//        return tongTien;
//    }

    public void input() {
        System.out.print("Nhap Ma Nhan Vien: ");
        maNhanVien = Check.checkMSQL();
        System.out.print("Nhap Ma Nha Cung Cap: ");
        maNhaCungCap = scanner.nextLine();
        System.out.println("Nhap Thong tin Ngay Nhap.");
        ngayNhap.input();
    }

    public void output() {
        System.out.println("Mã Phiếu Nhập: " + getMaPhieuNhap());
        System.out.println("Tên Nhân Viên: " + Database.getDanhSachNhanVien().getByIdEmployee(getMaNhanVien()).getFullname());
        System.out.println("Tên Nhà Cung Cấp: " + Database.getDanhSachNCC().getByIdProvider(getMaNhaCungCap()).getTenNCC());
        System.out.println("Ngày Nhập: " +  getNgayNhap().toString());
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Phieu Nhap","Ma Nhap Vien","Ten Nhan Vien","Ma Nha Cung Cap","Ten Nha Cung Cap","Ngay nhap"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maPhieuNhap,this.maNhanVien,Database.getDanhSachNhanVien().getByIdEmployee(this.maNhanVien).getFullname(),this.maNhaCungCap,Database.getDanhSachNCC().getByIdProvider(getMaNhaCungCap()).getTenNCC(),this.ngayNhap.toString()};
    }
}
