package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.People.Employee;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.ThongTin.Provider;

import java.util.Scanner;

public class PhieuNhap {
    final static Scanner scanner = new Scanner(System.in); 
    private String maPhieuNhap, maNhanVien, maNhaCungCap;
    private Date ngayNhap;
    public PhieuNhap() {
    }

    public PhieuNhap(String maPhieuNhap, String maNhanVien, String maNhaCungCap, Date ngayNhap) {
        this.maPhieuNhap = maPhieuNhap;
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
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

    public Provider getNhaCungCap() {
        return Database.get
    }
}
