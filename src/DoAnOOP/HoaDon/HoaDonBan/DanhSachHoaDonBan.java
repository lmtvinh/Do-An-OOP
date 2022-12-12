package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachHoaDonBan extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = 46465123131l;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachHoaDonBan.bin";
    final static Scanner scanner = new Scanner(System.in);
    private ArrayList<HoaDonBan> hoaDonBans;
    private int idIncrement = 0;

    public DanhSachHoaDonBan() {
        hoaDonBans = new ArrayList<HoaDonBan>();
    }

    public void addHoaDonBan(HoaDonBan a) {
        hoaDonBans.add(a);
        a.setMaHoaDon("" + this.idIncrement);
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

    public void getAll() {
        Table.createTable(hoaDonBans);
    }

    public void menuQL() {
        String luachon;
        do {
            System.out.println("Menu Hóa Đơn Bán Của Cửa Hàng.");
            System.out.println("1.Xem Hóa Đơn Bán Hàng.");
            System.out.println("2.Thêm Hóa Đơn Bán Hàng.");
            System.out.println("3.Sửa Hóa Đơn Bán Hàng.");
            System.out.println("4.Xóa Hóa Đơn Bán Hàng.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán");
                    getAll();
                }
                case "2" -> {
                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Cần Thêm.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    addHoaDonBan(newHoaDonBan);
                }
                case "3" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán.");
                    getAll();
                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Hàng Cần Sửa.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    System.out.print("Nhập Mã Hóa Đơn Bán Hàng Cần Sửa: ");
                    String manewHoaDonBanSua = scanner.nextLine();
                    setHoaDonBan(manewHoaDonBanSua, newHoaDonBan);
                }
                case "4" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán.");
                    getAll();
                    System.out.print("Nhập Mã Hóa Đơn Bán Cần Xóa: ");
                    String maHoaDonBanCanXoa = scanner.nextLine();
                    removeHoaDonBan(maHoaDonBanCanXoa);
                }
                case "0" -> {
                    System.err.println("THOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while (luachon != "0");
    }

    public void menuNV() {
        String luachon;
        do {
            System.out.println("Menu Hóa Đơn Bán Của Cửa Hàng.");
            System.out.println("1.Xem Hóa Đơn Bán Hàng.");
            System.out.println("2.Thêm Hóa Đơn Bán Hàng.");
            System.out.println("4.Xóa Hóa Đơn Bán Hàng.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
            switch(luachon) {
                case "1" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán");
                    getAll();
                }
                case "2" -> {
                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Cần Thêm.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    addHoaDonBan(newHoaDonBan);
                }
                case "3" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán.");
                    getAll();
                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Hàng Cần Sửa.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    System.out.print("Nhập Mã Hóa Đơn Bán Hàng Cần Sửa: ");
                    String manewHoaDonBanSua = scanner.nextLine();
                    setHoaDonBan(manewHoaDonBanSua, newHoaDonBan);
                }
                case "0" -> {
                    System.err.println("THOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        }while(luachon != "0");
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.hoaDonBans = ((DanhSachHoaDonBan)newDanhSach).hoaDonBans;
    }
}
