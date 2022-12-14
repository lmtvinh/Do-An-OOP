package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Help.Check;
import DoAnOOP.Help.HoTro;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.SanPham.SanPham;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachHoaDonBan extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = 46465123131l;
    public final static String DUONG_DAN_LUU_FILE = HoTro.duongDanTuongDoi + "DanhSachHoaDonBan.bin";
    final static Scanner scanner = new Scanner(System.in);
    private ArrayList<HoaDonBan> hoaDonBans;
    private int idIncrement = 0;

    public DanhSachHoaDonBan() {
        hoaDonBans = new ArrayList<HoaDonBan>();
    }

    public void addHoaDonBan(HoaDonBan a) {
        hoaDonBans.add(a);
        a.setMaHoaDon("" + this.idIncrement);
        idIncrement++;
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
//        Table.createTable(hoaDonBans);
        Table.printTable(hoaDonBans);
    }

    public void menuQLDSHDB() {
        String luachon;
        do {
            System.out.println("\n\n\t\tMenu Hóa Đơn Bán Của Cửa Hàng.");
            System.out.println("1.Xem Hóa Đơn Bán Hàng.");
            System.out.println("2.Thêm Hóa Đơn Bán Hàng.");
            System.out.println("3.Sửa Hóa Đơn Bán Hàng.");
            System.out.println("4.Xóa Hóa Đơn Bán Hàng.");
            System.out.println("5.Thanh Tóan Hóa Đơn Bán Hàng.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Danh Sách Hóa Đơn Bán.");
                    getAll();
                }
                case "2" -> {
                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Cần Thêm.");
                    HoaDonBan newHoaDonBan = new HoaDonBan();
                    newHoaDonBan.input();
                    addHoaDonBan(newHoaDonBan);
                    char choose = 'y';
                    while (choose == 'y') {
                        System.out.println("Danh Sách Sản Phẩm.");
                        Database.getDanhSachSanPham().getAll();
                        System.out.print("Nhập Mã Sản Phẩm Cần Mua: ");
                        String maSanPhamCanMua = scanner.nextLine();
                        SanPham n = Database.getDanhSachSanPham().getByIdSanPham(maSanPhamCanMua);
                        if (n == null) {
                            System.out.println("ID KHÔNG TỒN TẠI.");
                        } else {
                            System.out.print("Nhập Số Lượng Muốn Mua: ");
                            int soLuong = Check.checkInputInteger();
                            int i = 0;
                            while (i == 0) {
                                if (soLuong > Database.getDanhSachSanPham().getByIdSanPham(maSanPhamCanMua).getSoLuongSanPham()) {
                                    ChiTietHoaDonBan c = new ChiTietHoaDonBan();
                                    c.setSoLuong(soLuong);
                                    c.setMaSP(maSanPhamCanMua);
                                    c.setMaHD(newHoaDonBan.getMaHoaDon());
                                    Database.getDanhSachChiTietHoaDonBan().addChiTietHoaDonBan(c);
                                    int sl = Database.getDanhSachChiTietHoaDonBan().getByIdChiTietHoaDonBan(maSanPhamCanMua).getSoLuong();
                                    sl -= soLuong;
                                    Database.getDanhSachSanPham().getByIdSanPham(maSanPhamCanMua).setSoLuongSanPham(sl);
                                    i = 1;
                                }
                                else {
                                    System.out.println("Số Lượng Bạn Muốn Mua Vượt Quá Số Lượng Còn Trong Kho.");
                                }
                            }
                        }
                        System.out.print("Bạn Có Muốn Mua Thêm Sản Phẩm Không(y/n): ");
                        choose = scanner.nextLine().charAt(0);
                    }
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
                case "5" -> {
                    thanhToan();
                }
                case "0" -> {
                    System.err.println("THOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while (luachon == "0");
    }

    public void thanhToan() {
        System.out.print("Nhập Id Của Hóa Đơn: ");
        String idCanThanhToan = scanner.nextLine();
        var a = Database.getDanhSachHoaDonBan().getByIdHoaDonBan(idCanThanhToan);
        if (a == null) {
            System.out.println("Không Tìm Thấy Hóa Đơn.");
            return;
        }
        if (a.isThanhToan()) {
            System.out.println("Đã Thanh Toán Hóa Đơn.");
            return;
        }
        a.setThanhToan(true);
    }

//    public void menuNV() {
//        String luachon;
//        do {
//            System.out.println("Menu Hóa Đơn Bán Của Cửa Hàng.");
//            System.out.println("1.Xem Hóa Đơn Bán Hàng.");
//            System.out.println("2.Thêm Hóa Đơn Bán Hàng.");
//            System.out.println("4.Xóa Hóa Đơn Bán Hàng.");
//            System.out.println("0.Thoát.");
//            System.out.print("Nhập lựa chọn của bạn: ");
//            luachon = scanner.nextLine();
//            switch(luachon) {
//                case "1" -> {
//                    System.out.println("Danh Sách Hóa Đơn Bán");
//                    getAll();
//                }
//                case "2" -> {
//                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Cần Thêm.");
//                    HoaDonBan newHoaDonBan = new HoaDonBan();
//                    newHoaDonBan.input();
//                    addHoaDonBan(newHoaDonBan);
//                }
//                case "3" -> {
//                    System.out.println("Danh Sách Hóa Đơn Bán.");
//                    getAll();
//                    System.out.println("Nhập Thông Tin Hóa Đơn Bán Hàng Cần Sửa.");
//                    HoaDonBan newHoaDonBan = new HoaDonBan();
//                    newHoaDonBan.input();
//                    System.out.print("Nhập Mã Hóa Đơn Bán Hàng Cần Sửa: ");
//                    String manewHoaDonBanSua = scanner.nextLine();
//                    setHoaDonBan(manewHoaDonBanSua, newHoaDonBan);
//                }
//                case "0" -> {
//                    System.err.println("THOÁT.");
//                }
//                default -> {
//                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
//                }
//            }
//        }while(luachon == "0");
//    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.hoaDonBans = ((DanhSachHoaDonBan)newDanhSach).hoaDonBans;
    }
}
