package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.KhoDuLieu.Database;

import java.util.Scanner;

public class ChiTietPhieuNhap {
    final static Scanner scanner = new Scanner(System.in);
    private String maPhieuNhap, maSanPham;
    private int soLuong;
    private static int idIncrement = 0;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPhieuNhap, String maSanPham, int soLuong) {
        this.maPhieuNhap = maPhieuNhap;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input() {
        System.out.print("Nhap Ma Phieu Nhap: ");
        maPhieuNhap = scanner.nextLine();
        System.out.print("Nhap Ma San Pham: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhap So luong: ");
    }

    public float getThanhTienLaptop() {
        return Database.getDanhSachLaptop().getByIdLaptop(getMaSanPham()).getPrice()*soLuong;
    }

    public float getThanhTienPC() {
        return Database.getDanhSachPC().getByIdPC(getMaSanPham()).getPrice()*soLuong;
    }

    public PhieuNhap getPhieuNhap() {
        return Database.getDanhSachPhieuNhap().getByIdPhieuNhap(getMaPhieuNhap());
    }
}
