package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class ChiTietHoaDonBan implements Output, Serializable {
    @Serial
    private static final long serialVersion = -456541231254l;
    final static Scanner scanner = new Scanner(System.in);
    private String maHD, maSP;
    private int soLuong;

    public ChiTietHoaDonBan() {
    }

    public ChiTietHoaDonBan(String maHD, String maSP, int soLuong){
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

    public float getThanhTien() {
        return Database.getDanhSachSanPham().getByIdSanPham(getMaSP()).getPrice()*soLuong;
    }

//    public float getThanhTienLaptop() {
//        float tien;
//        tien = Database.getDanhSachLaptop().getByIdLaptop(getMaSP()).getPrice()*soLuong;
//        return tien;
//    }
//
//    public float getThanhTienPC() {
//        float tien;
//        tien = Database.getDanhSachPC().getByIdPC(getMaSP()).getPrice()*soLuong;
//        return tien;
//    }

    public HoaDonBan getHoaDonBan() {
        return Database.getDanhSachHoaDonBan().getByIdHoaDonBan(getMaHD());
    }

    public void input() {
        System.out.print("Nhap ma Hoa Don: ");
        maHD = scanner.nextLine();
        System.out.print("Nhap ma San Pham: ");
        maSP = scanner.nextLine();
        System.out.print("Nhap So Luong: ");
        soLuong = Check.checkInputInteger();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Mã Sản Phẩm","Tên Sản Phẩm","Số Lượng","Thành Tiền"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSP,Database.getDanhSachSanPham().getByIdSanPham(this.maSP).getTenSanPham(),""+this.soLuong,""+getThanhTien()};
    }
}
