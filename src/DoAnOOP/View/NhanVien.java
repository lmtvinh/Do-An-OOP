package DoAnOOP.View;

import DoAnOOP.KhoDuLieu.Database;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class NhanVien{
    final static Scanner scanner = new Scanner(System.in);
    private static void menu() {
        System.out.println("\n\n\t\tMENU DÀNH CHO NhÂN VIÊN.");
        System.out.println("1.Quản Lí Phiếu Nhập.");
        System.out.println("2.Quản Lí Hóa Đơn Bán.");
        System.out.println("3.Quản Lí Khách Hàng.");
        System.out.println("4.Quản Lí Sản Phẩm.");
        System.out.println("0.Thoát");
    }

    public static void run() {
        String luachon;
        do {
            menu();
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1"-> {
                    Database.getDanhSachPhieuNhap().menuQLDSPN();
                }
                case "2" -> {
                    Database.getDanhSachHoaDonBan().menuQLDSHDB();
                }
                case "3" -> {
                    Database.getDanhSachKhachHang().menu();
                }
                case "4" -> {
                    Database.getDanhSachSanPham().menu();
                }
                case "0" -> {
                    System.out.println("Thoát.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while(!luachon.equals("0"));
    }
}
