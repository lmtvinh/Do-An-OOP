package DoAnOOP.View;

import DoAnOOP.KhoDuLieu.Database;

import java.util.Scanner;

public class KhachHang {
    final static Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("\n\n\t\tMenu Khách Hàng");
        System.out.println("1.Quản Lí Sản Phẩm.");
        System.out.println("2.Xem Thông Tin Hóa Đơn Của Bạn.");
        System.out.println("0.Thoát.");
    }
    public static void run() {
        String luachon;
        do {
            menu();
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    Database.getDanhSachSanPham().menuKH();
                }
                case "2" -> {
                    System.out.print("Nhập Mã Hóa Đơn Mà Bạn Muốn Xem: ");
                    String maHoaDon = scanner.nextLine();
                    Database.getDanhSachHoaDonBan().getByIdHoaDonBan(maHoaDon).getMaHoaDon();
                }
                case "0" -> {
                    System.out.println("\t\tTHOÁT");
                }
                default -> {
                    System.err.println("\t\tLỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while(luachon == "0");
    }
}
