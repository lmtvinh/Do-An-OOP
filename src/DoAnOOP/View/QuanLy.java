package DoAnOOP.View;

import DoAnOOP.KhoDuLieu.Database;

import java.util.Scanner;

public class QuanLy {
    final static Scanner scanner = new Scanner(System.in);
    private static void menu() {
        System.out.println("1.Quản Lí Phiếu Nhập.");
        System.out.println("2.Quản Lí Hóa Đơn Bán.");
        System.out.println("3.Quản Lí Nhân Viên.");
        System.out.println("4.Quản Lí Khách Hàng.");
        System.out.println("5.Quản Lí Sản Phẩm.");
        System.out.println("0.Thoát");
    }
    public static void run() {
        String luachon;
        do {
            menu();
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1"-> {
                    Database.getDanhSachPhieuNhap().menuQL();
                }
                case "2" -> {
                    Database.getDanhSachHoaDonBan().menuQL();
                }
                case "3" -> {
                    Database.getDanhSachNhanVien().menuQL();
                }
                case "4" -> {
                    Database.getDanhSachKhachHang().menu();
                }
                case "5" -> {
                    Database.getDanhSachSanPham().menu();
                }
                case "0" -> {
                    System.out.println("ĐĂNG XUẤT.");
                    Main.nguoiDung = null;
                    System.out.println("ThOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while(luachon != "0");
        Database.xuatFielDatabase();
    }
}
