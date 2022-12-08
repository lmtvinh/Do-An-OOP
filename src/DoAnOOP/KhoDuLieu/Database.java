package DoAnOOP.KhoDuLieu;

import DoAnOOP.HoaDon.HoaDonBan.DanhSachChiTietHoaDonBan;
import DoAnOOP.HoaDon.HoaDonBan.DanhSachHoaDonBan;
import DoAnOOP.People.DanhSachKhachHang;
import DoAnOOP.People.DanhSachNhanVien;
import DoAnOOP.SanPham.Laptop.DanhSachLaptop;
import DoAnOOP.SanPham.Laptop.DanhSachLoaiLaptop;
import DoAnOOP.SanPham.PC.DanhSachLoaiPC;
import DoAnOOP.SanPham.PC.DanhSachPC;
import DoAnOOP.ThongTin.DanhSachNCC;
import DoAnOOP.ThongTin.DanhSachNSX;

public class Database {
    private static DanhSachNSX danhSachNSX = null;
    private static DanhSachNCC danhSachNCC = null;
    private static DanhSachLaptop danhSachLaptop = null;
    private static DanhSachLoaiLaptop danhSachLoaiLaptop = null;
    private static DanhSachPC danhSachPC = null;
    private static DanhSachLoaiPC danhSachLoaiPC = null;

    private static DanhSachKhachHang danhSachKhachHang = null;
    private static DanhSachNhanVien danhSachNhanVien = null;

    private static DanhSachHoaDonBan danhSachHoaDonBan = null;
    private static DanhSachChiTietHoaDonBan danhSachChiTietHoaDonBan = null;

    public static  DanhSachNSX getDanhSachNSX() {
        if (danhSachNSX == null) {
            danhSachNSX = new DanhSachNSX();
//            danhSachNSX.docFile();
        }
        return danhSachNSX;
    }

    public static DanhSachNCC getDanhSachNCC() {
        if (danhSachNCC == null) {
            danhSachNCC = new DanhSachNCC();
//            danhSachNCC.docFile();
        }
        return danhSachNCC;
    }

    public static DanhSachLaptop getDanhSachLaptop() {
        if (danhSachLaptop == null) {
            danhSachLaptop = new DanhSachLaptop();
//            danhSachLaptop.docFile();
        }
        return danhSachLaptop;
    }

    public static DanhSachLoaiLaptop getDanhSachLoaiLaptop() {
        if (danhSachLoaiLaptop == null) {
            danhSachLoaiLaptop = new DanhSachLoaiLaptop();
//            danhSachLoaiLaptop.docFile();
        }
        return danhSachLoaiLaptop;
    }

    public static DanhSachPC getDanhSachPC() {
        if (danhSachPC == null) {
            danhSachPC = new DanhSachPC();
//            danhSachPC.docFile();
        }
        return danhSachPC;
    }

    public static DanhSachLoaiPC getDanhSachLoaiPC() {
        if (danhSachLoaiPC == null) {
            danhSachLoaiPC = new DanhSachLoaiPC();
//            danhSachLoaiLaptop.docFile();
        }
        return  danhSachLoaiPC;
    }

    public static DanhSachKhachHang getDanhSachKhachHang() {
        if (danhSachKhachHang == null) {
            danhSachKhachHang = new DanhSachKhachHang();
//            danhSachKhachHang.docFile();
        }
        return danhSachKhachHang;
    }

    public static DanhSachNhanVien getDanhSachNhanVien() {
        if (danhSachNhanVien == null) {
            danhSachNhanVien = new DanhSachNhanVien();
//            danhSachNhanVien.docFile();
        }
        return danhSachNhanVien;
    }

    public static DanhSachHoaDonBan getDanhSachHoaDonBan() {
        if (danhSachHoaDonBan == null) {
            danhSachHoaDonBan = new DanhSachHoaDonBan();
//            danhSachHoaDonBan.docFile();
        }
        return danhSachHoaDonBan;
    }

    public static DanhSachChiTietHoaDonBan getDanhSachChiTietHoaDonBan() {
        if (danhSachChiTietHoaDonBan == null) {
            danhSachChiTietHoaDonBan = new DanhSachChiTietHoaDonBan();
//            danhSachChiTietHoaDonBan.docFile();
        }
        return danhSachChiTietHoaDonBan;
    }
}
