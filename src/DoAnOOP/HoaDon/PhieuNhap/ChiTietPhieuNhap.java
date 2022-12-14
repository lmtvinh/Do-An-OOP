package DoAnOOP.HoaDon.PhieuNhap;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class ChiTietPhieuNhap implements Output, Serializable {
    @Serial
    private static final long serialVersion = -55545321321l;
    final static Scanner scanner = new Scanner(System.in);
    private String maPhieuNhap, maSanPham, maNhanVien;
    private int soLuong;
    private static int idIncrement = 0;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPhieuNhap, String maSanPham, String maNhanVien, int soLuong) {
        this.maPhieuNhap = maPhieuNhap;
        this.maSanPham = maSanPham;
        this.maNhanVien = maNhanVien;
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

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void input() {
        System.out.print("Nhap Ma Phieu Nhap: ");
        maPhieuNhap = scanner.nextLine();
        System.out.print("Nhap Ma San Pham: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhap So luong: ");
    }

//    public float getThanhTienLaptop() {
//        return Database.getDanhSachLaptop().getByIdLaptop(getMaSanPham()).getPrice()*soLuong;
//    }

//    public float getThanhTienPC() {
//        return Database.getDanhSachPC().getByIdPC(getMaSanPham()).getPrice()*soLuong;
//    }

    public int getThanhTienSanPham() {
        return Database.getDanhSachSanPham().getByIdSanPham(getMaSanPham()).getPrice()*soLuong;
    }

    public PhieuNhap getPhieuNhap() {
        return Database.getDanhSachPhieuNhap().getByIdPhieuNhap(getMaPhieuNhap());
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"M?? Phi???u Nh???p","T??n S???n Ph???m","S??? L?????ng","Th??nh Ti???n"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maPhieuNhap,Database.getDanhSachSanPham().getByIdSanPham(this.getMaSanPham()).getTenSanPham(),""+this.soLuong,""+this.getThanhTienSanPham()};
    }
}
