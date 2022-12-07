package DoAnOOP.HoaDon;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class ChiTietHoaDonBan {
    final static Scanner scanner = new Scanner(System.in);
    private String maHD, maSP;
    private int soLuong;

    public void ChiTietHoaDonBan(String maHD, String maSP, int soLuong){
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTienLaptop() {
        float tien;
        tien = Database.getDanhSachLaptop().getByIdLaptop(getMaSP()).getPrice()*soLuong;
        return tien;
    }

    public float getThanhTienPC() {
        float tien;
        tien = Database.getDanhSachPC().getByIdPC(getMaSP()).getPrice()*soLuong;
        return tien;
    }

    public HoaDonBan getHoaDonBan() {
        return Database.getDanh   
    }

    public void input() {
        System.out.print("Nhap ma Hoa Don: ");
        maHD = scanner.nextLine();
        System.out.print("Nhap ma San Pham: ");
        maSP = scanner.nextLine();
        System.out.print("Nhap So Luong: ");
        soLuong = Check.checkInputInteger();
    }
}
