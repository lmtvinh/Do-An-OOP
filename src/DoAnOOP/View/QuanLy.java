package DoAnOOP.View;

import DoAnOOP.KhoDuLieu.Database;

import java.util.Scanner;

public class QuanLy {
    final static Scanner scanner = new Scanner(System.in);
    private static void menu() {
        System.out.println("1.Quan Li Phieu Nhap.");
        System.out.println("2.Quan Li Hoa Don Ban.");
        System.out.println("3.Quan Li Nhan Vien.");
        System.out.println("4.Quan Li Khach Hang.");
        System.out.println("5.Quan Li Laptop.");
        System.out.println("6.Quan Li PC.");
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
                    Database.getDanhSachNhanVien().menuQL();
                }
                case "4" -> {
                    Database.getDanhSachKhachHang().menu();
                }
                case "5" -> {
                    Database.getDanhSachLaptop().menuLaptop();
                }
                case "6" -> {
                    Database.getDanhSachPC().menuPC();
                }
                case "0" -> {
                    System.out.println("DANG XUAT.");
                    Main.nguoiDung = null;
                    System.err.println("Thoat");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        } while(luachon != "0");
        Database.xuatFielDatabase();
    }
}
