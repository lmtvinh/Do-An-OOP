package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.People.Employee;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.ThongTin.Provider;

import java.util.ArrayList;
import java.util.Scanner;

public class PhieuNhap implements Output {
    final static Scanner scanner = new Scanner(System.in);
    private String maPhieuNhap, maNhanVien, maNhaCungCap;
    private Date ngayNhap;
    private static int idIncrement = 0;
    private int tongTien;

    public PhieuNhap() {
        maPhieuNhap = "PN" + PhieuNhap.idIncrement;
        PhieuNhap.idIncrement++;
    }

    public PhieuNhap(String maNhanVien, String maNhaCungCap, Date ngayNhap) {
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
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

    public int getTongTien() {
        for (int i = 0; i < Database.getDanhSachChiTietPhieuNhap().getChiTietPhieuNhap(getMaPhieuNhap()).size();i++) {
            tongTien += Database.getChiTietPhieuNhap(getMaPhieuNhap()).getThanhTienPC();
            tongTien += Database.getChiTietPhieuNhap(getMaPhieuNhap()).getThanhTienLaptop();
        }
        return tongTien;
    }

    public void input() {
        System.out.print("Nhap Ma Nhan Vien: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhap Ma Nha Cung Cap: ");
        maNhaCungCap = scanner.nextLine();
        System.out.println("Nhap Thong tin Ngay Nhap.");
        ngayNhap.input();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Phieu Nhap","Ma Nhap Vien","Ten Nhan Vien","Ma Nha Cung Cap","Ten Nha Cung Cap","Ngay nhap"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maPhieuNhap,this.maNhanVien,Database.getDanhSachNhanVien().getByIdEmployee(this.maNhanVien).getFullname(),this.maNhaCungCap,this.ngayNhap.toString()};
    }
}
