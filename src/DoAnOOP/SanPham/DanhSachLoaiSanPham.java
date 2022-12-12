package DoAnOOP.SanPham;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachLoaiSanPham extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersionUID = -4645649789L;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachLoaiSanPham.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<LoaiSanPham> danhSachLoaiSanPham;
    public DanhSachLoaiSanPham() {
        danhSachLoaiSanPham = new ArrayList<LoaiSanPham>();
    }

    public void addLoaiSanPham(LoaiSanPham newLoaiSanPham) {
        if (Database.getDanhSachLoaiSanPham().getById(newLoaiSanPham.getMaLoai()) == null) {
            danhSachLoaiSanPham.add(newLoaiSanPham);
        } else {
            System.out.println("ID ĐÃ TỒN TẠI TRONG DANH SÁCH.");
        }
    }

    public void removeLoaiSanPham(String maLoaiCanXoa) {
        for (int i = 0;i < danhSachLoaiSanPham.size(); i++) {
            if (Objects.equals(danhSachLoaiSanPham.get(i).getMaLoai(), maLoaiCanXoa)) {
                danhSachLoaiSanPham.remove(danhSachLoaiSanPham.get(i));
                return;
            }
        }
        System.err.println("KHÔNG CÓ ID TRONG DANH SÁCH.");
    }

    public void updateLoaiSanPham(String maLoaiCanSua, LoaiSanPham newLoaiSanPham) {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            if (Objects.equals(danhSachLoaiSanPham.get(i).getMaLoai(), maLoaiCanSua)) {
                danhSachLoaiSanPham.set(i,danhSachLoaiSanPham.get(i));
                return;
            }
        }
        System.err.println("KHÔNG CÓ ID TRONG DANH SÁCH.");
    }

    public void getAll() {
        Table.createTable(danhSachLoaiSanPham);
        Table.printTable(danhSachLoaiSanPham);
    }

    public LoaiSanPham getById(String idCanCheck) {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            if (Objects.equals(danhSachLoaiSanPham.get(i).getMaLoai(), idCanCheck)) {
                return danhSachLoaiSanPham.get(i);
            }
        }
        return null;
    }

    public LoaiSanPham findByName(String nameCheck) {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            if (danhSachLoaiSanPham.get(i).getTenLoai().toLowerCase().contains(nameCheck.toLowerCase())) {
                return danhSachLoaiSanPham.get(i);
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.danhSachLoaiSanPham = ((DanhSachLoaiSanPham)newDanhSach).danhSachLoaiSanPham;
    }

    public void menu() {
        String luachon;
        do {
            System.out.println("\n\n\t\tMENU DANH SÁCH LOẠI SẢN PHẨM.");
            System.out.println("1.Xem Danh Sách Loại Sản Phẩm.");
            System.out.println("2.Thêm Loại Sản Phẩm Vào Danh Sách Loại Sản Phẩm.");
            System.out.println("3.Sửa Loại Sản Phẩm Trong Danh Sách Loại Sản Phẩm.");
            System.out.println("4.Xóa Loại Sản Phẩm Trong Danh Sách Loại Sản Phẩm.");
            System.out.println("5.Tìm Kiếm Loại Sản Phẩm Theo Mã Sách Loại Sản Phẩm.");
            System.out.println("6.Tìm Kiếm Loại Sản Phẩm Theo Tên Loại Sản Phẩm.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("DANH SÁCH LOẠI SẢN PHẨM.");
                    getAll();
                }
                case "2" -> {
                    System.out.println("THÊM LOẠI SẢN PHẨM VÀO DANH SÁCH LOẠI SẢN PHẨM.");
                    LoaiSanPham newLoaiSanPham = new LoaiSanPham();
                    newLoaiSanPham.input();
                    addLoaiSanPham(newLoaiSanPham);
                }
                case "3" -> {
                    System.out.println("DANH SÁCH LOẠI SẢN PHẨM.");
                    getAll();
                    System.out.print("Nhập Mã Loại Sản Phẩm Cần Sửa: ");
                    String maLoaiCanSua = scanner.nextLine();
                    System.out.println("Nhập Thông Loại Sản Phẩm Mà Bạn Muốn Sửa: ");
                    LoaiSanPham loaiSanPham = new LoaiSanPham();
                    loaiSanPham.input();
                    updateLoaiSanPham(maLoaiCanSua,loaiSanPham);
                }
                case "4" -> {
                    System.out.println("DANH SÁCH LOẠI SẢN PHẨM.");
                    getAll();
                    System.out.print("Nhập Mã Lọai Sản Phẩm Mà Bạn Muốn Xóa: ");
                    String maLoaiSanPham = scanner.nextLine();
                    removeLoaiSanPham(maLoaiSanPham);
                }
                case "5" -> {
                    System.out.print("Nhập Mã Loại Sản Phẩm Mà Bạn Muốn Tìm: ");
                    String maLoaiCanCheck = scanner.nextLine();
                    if (getById(maLoaiCanCheck) == null) {
                        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
                    } else {
                        getById(maLoaiCanCheck).output();
                    }
                }
                case "6" -> {
                    System.out.print("Nhập Tên Loại Sản Phẩm Mà Muốn Tìm: ");
                    String tenLoaiCanCheck = scanner.nextLine();
                    findByName(tenLoaiCanCheck);
                }
                case "0" -> {
                    System.out.println("THOÁT.");
                }
                default -> {
                    System.err.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while (luachon != "0");
    }
}
