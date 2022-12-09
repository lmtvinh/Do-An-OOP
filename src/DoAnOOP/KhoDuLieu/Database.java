package DoAnOOP.KhoDuLieu;

import DoAnOOP.HoaDon.HoaDonBan.DanhSachChiTietHoaDonBan;
import DoAnOOP.HoaDon.HoaDonBan.DanhSachHoaDonBan;
import DoAnOOP.HoaDon.PhieuNhap.DanhSachChiTietPhieuNhap;
import DoAnOOP.HoaDon.PhieuNhap.DanhSachPhieuNhap;
import DoAnOOP.People.DanhSachKhachHang;
import DoAnOOP.People.DanhSachNhanVien;
import DoAnOOP.SanPham.DanhSachLoaiSanPham;
import DoAnOOP.SanPham.DanhSachSanPham;
import DoAnOOP.ThongTin.DanhSachNCC;
import DoAnOOP.ThongTin.DanhSachNSX;

public class Database {
    private static DanhSachNSX danhSachNSX = null;
    private static DanhSachNCC danhSachNCC = null;
//    private static DanhSachLaptop danhSachLaptop = null;
//    private static DanhSachLoaiLaptop danhSachLoaiLaptop = null;
//    private static DanhSachPC danhSachPC = null;
//    private static DanhSachLoaiPC danhSachLoaiPC = null;
    private static DanhSachSanPham danhSachSanPham = null;
    private static DanhSachLoaiSanPham danhSachLoaiSanPham = null;
    private static DanhSachKhachHang danhSachKhachHang = null;
    private static DanhSachNhanVien danhSachNhanVien = null;

    private static DanhSachHoaDonBan danhSachHoaDonBan = null;
    private static DanhSachChiTietHoaDonBan danhSachChiTietHoaDonBan = null;

    private static DanhSachPhieuNhap danhSachPhieuNhap = null;
    private static DanhSachChiTietPhieuNhap danhSachChiTietPhieuNhap = null;

    public static  DanhSachNSX getDanhSachNSX() {
        if (danhSachNSX == null) {
            danhSachNSX = new DanhSachNSX();
            danhSachNSX.docFile(DanhSachNSX.DUONG_DAN_LUU_FILE);
        }
        return danhSachNSX;
    }

    public static DanhSachNCC getDanhSachNCC() {
        if (danhSachNCC == null) {
            danhSachNCC = new DanhSachNCC();
            danhSachNCC.docFile(DanhSachNCC.DUONG_DAN_LUU_FILE);
        }
        return danhSachNCC;
    }

//    public static DanhSachLaptop getDanhSachLaptop() {
//        if (danhSachLaptop == null) {
//            danhSachLaptop = new DanhSachLaptop();
//            danhSachLaptop.docFile();
//        }
//        return danhSachLaptop;
//    }
//
//    public static DanhSachLoaiLaptop getDanhSachLoaiLaptop() {
//        if (danhSachLoaiLaptop == null) {
//            danhSachLoaiLaptop = new DanhSachLoaiLaptop();
////            danhSachLoaiLaptop.docFile();
//        }
//        return danhSachLoaiLaptop;
//    }
//
//    public static DanhSachPC getDanhSachPC() {
//        if (danhSachPC == null) {
//            danhSachPC = new DanhSachPC();
////            danhSachPC.docFile();
//        }
//        return danhSachPC;
//    }
//
//    public static DanhSachLoaiPC getDanhSachLoaiPC() {
//        if (danhSachLoaiPC == null) {
//            danhSachLoaiPC = new DanhSachLoaiPC();
////            danhSachLoaiLaptop.docFile();
//        }
//        return  danhSachLoaiPC;
//    }

    public static DanhSachSanPham getDanhSachSanPham() {
        if (danhSachSanPham == null) {
            danhSachSanPham = new DanhSachSanPham();
            danhSachSanPham.docFile(DanhSachSanPham.DUONG_DAN_LUU_FILE);
        }
        return danhSachSanPham;
    }

    public static DanhSachLoaiSanPham getDanhSachLoaiSanPham() {
        if (danhSachLoaiSanPham == null) {
            danhSachLoaiSanPham = new DanhSachLoaiSanPham();
            danhSachLoaiSanPham.docFile(DanhSachLoaiSanPham.DUONG_DAN_LUU_FILE);
        }
        return danhSachLoaiSanPham;
    }

    public static DanhSachKhachHang getDanhSachKhachHang() {
        if (danhSachKhachHang == null) {
            danhSachKhachHang = new DanhSachKhachHang();
            danhSachKhachHang.docFile(DanhSachKhachHang.DUONG_DAN_LUU_FILE);
        }
        return danhSachKhachHang;
    }

    public static DanhSachNhanVien getDanhSachNhanVien() {
        if (danhSachNhanVien == null) {
            danhSachNhanVien = new DanhSachNhanVien();
            danhSachNhanVien.docFile(DanhSachNhanVien.DUONG_DAN_LUU_FILE);
        }
        return danhSachNhanVien;
    }

    public static DanhSachHoaDonBan getDanhSachHoaDonBan() {
        if (danhSachHoaDonBan == null) {
            danhSachHoaDonBan = new DanhSachHoaDonBan();
            danhSachHoaDonBan.docFile(DanhSachHoaDonBan.DUONG_DAN_LUU_FILE);
        }
        return danhSachHoaDonBan;
    }

    public static DanhSachChiTietHoaDonBan getDanhSachChiTietHoaDonBan() {
        if (danhSachChiTietHoaDonBan == null) {
            danhSachChiTietHoaDonBan = new DanhSachChiTietHoaDonBan();
            danhSachChiTietHoaDonBan.docFile(DanhSachChiTietHoaDonBan.DUONG_DAN_LUU_FILE);
        }
        return danhSachChiTietHoaDonBan;
    }

    public static DanhSachPhieuNhap getDanhSachPhieuNhap() {
        if (danhSachPhieuNhap == null) {
            danhSachPhieuNhap = new DanhSachPhieuNhap();
            danhSachPhieuNhap.docFile(DanhSachPhieuNhap.DUONG_DAN_LUU_FILE);
        }
        return danhSachPhieuNhap;
    }

    public static DanhSachChiTietPhieuNhap getDanhSachChiTietPhieuNhap() {
        if (danhSachChiTietPhieuNhap == null) {
            danhSachChiTietPhieuNhap = new DanhSachChiTietPhieuNhap();
            danhSachChiTietPhieuNhap.docFile(DanhSachChiTietPhieuNhap.DUONG_DAN_LUU_FILE);
        }
        return danhSachChiTietPhieuNhap;
    }


    public static void xuatFielDatabase() {
        if (danhSachSanPham != null) {
            danhSachSanPham.docFile(DanhSachSanPham.DUONG_DAN_LUU_FILE);
        }
        if (danhSachLoaiSanPham != null) {
            danhSachLoaiSanPham.docFile(DanhSachLoaiSanPham.DUONG_DAN_LUU_FILE);
        }
        if (danhSachPhieuNhap != null) {
            danhSachPhieuNhap.docFile(DanhSachPhieuNhap.DUONG_DAN_LUU_FILE);
        }
        if (danhSachChiTietPhieuNhap != null) {
            danhSachChiTietPhieuNhap.docFile(DanhSachChiTietPhieuNhap.DUONG_DAN_LUU_FILE);
        }
        if (danhSachHoaDonBan != null) {
            danhSachHoaDonBan.docFile(DanhSachHoaDonBan.DUONG_DAN_LUU_FILE);
        }
        if (danhSachHoaDonBan != null) {
            danhSachChiTietHoaDonBan.docFile(DanhSachChiTietHoaDonBan.DUONG_DAN_LUU_FILE);
        }
        if (danhSachKhachHang != null) {
            danhSachKhachHang.docFile(DanhSachKhachHang.DUONG_DAN_LUU_FILE);
        }
        if (danhSachNhanVien != null) {
            danhSachNhanVien.docFile(DanhSachNhanVien.DUONG_DAN_LUU_FILE);
        }
        if (danhSachNCC != null) {
            danhSachNCC.docFile(DanhSachNCC.DUONG_DAN_LUU_FILE);
        }
        if (danhSachNSX != null) {
           danhSachNSX.docFile(DanhSachNSX.DUONG_DAN_LUU_FILE);
        }
    }
}
