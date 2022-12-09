package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.File.ADanhSach;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachHoaDonBan extends ADanhSach {
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachHoaDonBan.bin";
    final static Scanner scanner = new Scanner(System.in);
    private ArrayList<HoaDonBan> hoaDonBans;

    public DanhSachHoaDonBan() {
        hoaDonBans = new ArrayList<HoaDonBan>();
    }

    public void addHoaDonBan(HoaDonBan a) {
        hoaDonBans.add(a);
    }

    public void setHoaDonBan(String maHoaDonCanSua, HoaDonBan newHoaDonBan) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (Objects.equals(hoaDonBans.get(i).getMaHoaDon(), maHoaDonCanSua)) {
                hoaDonBans.set(i, newHoaDonBan);
            }
        }
    }

    public void removeHoaDonBan(String maHoaDonCanXoa) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (Objects.equals(hoaDonBans.get(i).getMaHoaDon(), maHoaDonCanXoa)) {
                hoaDonBans.remove(i);
            }
        }
    }

    public HoaDonBan getByIdHoaDonBan(String maHoaDonBanCanTim) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (Objects.equals(hoaDonBans.get(i).getMaHoaDon(), maHoaDonBanCanTim)) {
                return hoaDonBans.get(i);
            }
        }
        return null;
    }

    public void output() {

    }

    public void menuQL() {
        String luachon;
        do {
            System.out.println("Menu Hoa Don Ban.");
            System.out.println("1.Xem Hoa Don Ban.");
            System.out.println("2.Them Hoa Don Ban.");
            System.out.println("3.Sua Hoa Don Ban.");
            System.out.println("4.Xoa Hoa Don Ban.");
            System.out.println("0.Thoat.");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    output();
                }
                case "2" -> {
                    System.out.println("Nhap thong tin Hoa Don Ban can them.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    addHoaDonBan(newHoaDonBan);
                }
                case "3" -> {
                    System.out.println("Nhap thong tin Hoa Don Ban can them.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    System.out.print("Nhap Ma Hoa Don Ban can sua: ");
                    String manewHoaDonBanSua = scanner.nextLine();
                    setHoaDonBan(manewHoaDonBanSua, newHoaDonBan);
                }
                case "4" -> {
                    System.out.print("Nhap Ma Hoa Don Ban can xoa: ");
                    String maHoaDonBanCanXoa = scanner.nextLine();
                    removeHoaDonBan(maHoaDonBanCanXoa);
                }
                case "0" -> {
                    System.err.println("Thoat.");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        } while (luachon != "0");
    }

    public void menuNV() {
        String luachon;
        do {
            System.out.println("Menu Hoa Don Ban.");
            System.out.println("1.Xem Hoa Don Ban.");
            System.out.println("2.Them Hoa Don Ban.");
            System.out.println("3.Xoa Hoa Don Ban.");
            System.out.println("0.Thoat.");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch(luachon) {
                case "1" -> {
                    output();
                }
                case "2" -> {
                    System.out.println("Nhap thong tin Hoa Don Ban can them.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    addHoaDonBan(newHoaDonBan);
                }
                case "3" -> {
                    System.out.print("Nhap Ma Hoa Don Ban can xoa: ");
                    String maHoaDonBanCanXoa = scanner.nextLine();
                    removeHoaDonBan(maHoaDonBanCanXoa);
                }
                case "0" -> {
                    System.err.println("THOAT.");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        }while(luachon != "0");
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.hoaDonBans = ((DanhSachHoaDonBan)newDanhSach).hoaDonBans;
    }
}
