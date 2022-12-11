package DoAnOOP.View;

import DoAnOOP.KhoDuLieu.Database;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class NhanVien implements Serializable {
    @Serial
    private static long serialVersion = 45641213213l;
    final static Scanner scanner = new Scanner(System.in);
    private static void menu() {
        System.out.println("1.Quan Li Phieu Nhap.");
        System.out.println("2.Quan Li Hoa Don Ban.");
        System.out.println("3.Quan Li Khach Hang.");
        System.out.println("4.Quan Li San Pham.");
        System.out.println("0.Thoat");
    }

    public static void run() {
        String luachon;
        do {
            menu();
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1"-> {
                    Database.getDanhSachPhieuNhap().menuQL();
                }
                case "2" -> {
                    Database.getDanhSachHoaDonBan().menuQL();
                }
                case "3" -> {
                    Database.getDanhSachKhachHang().menu();
                }
                case "4" -> {
                    Database.getDanhSachSanPham().menu();
                }
                case "0" -> {
                    System.err.println("Thoat.");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        } while(luachon != "0");
    }
}
