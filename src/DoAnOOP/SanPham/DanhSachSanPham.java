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

public class DanhSachSanPham extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersionUID = 5554643215L;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachSanPham.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<SanPham> danhSachSanPham ;
    public DanhSachSanPham() {
        danhSachSanPham = new ArrayList<SanPham>();
    }

    public void addSanPham(SanPham newSanPham) {
        if (Database.getDanhSachSanPham().getByIdSanPham(newSanPham.getMaSanPham()) == null) {
            danhSachSanPham.add(newSanPham);
        } else {
            System.out.println("ID ĐÃ TỒN TẠI TRONG DANH SÁCH.");
        }
    }

    public void updateSanPham(String maSanPham, SanPham newSanPham) {
        for(int i = 0; i < danhSachSanPham.size(); i++ ){
            if(Objects.equals(danhSachSanPham.get(i).getMaSanPham(), maSanPham)) {
                danhSachSanPham.set(i,newSanPham);
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH.");
    }

    public void removeSanPham(String maSanPham) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (Objects.equals(danhSachSanPham.get(i).getMaSanPham(), maSanPham)) {
                danhSachSanPham.remove(danhSachSanPham.get(i));
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH.");
    }

    public SanPham getByIdSanPham(String maSanPham) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (Objects.equals(danhSachSanPham.get(i).getMaSanPham(), maSanPham)) {
                return danhSachSanPham.get(i);
            }
        }
        return null;
    }

    public SanPham findById(String idCanTim) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getMaSanPham() == idCanTim) {
                return danhSachSanPham.get(i);
            }
        }
        return null;
    }

    public SanPham findByName(String nameCanTim) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getTenSanPham().toLowerCase().contains(nameCanTim.toLowerCase())) {
                return danhSachSanPham.get(i);
            }
        }
        return null;
    }

    public void getAll() {
//        Table.createTable(danhSachSanPham);
        Table.printTable(danhSachSanPham);
    }

    public SanPham getById(String idCanCheck) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (Objects.equals(danhSachSanPham.get(i).getMaSanPham(), idCanCheck)) {
                return danhSachSanPham.get(i);
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.danhSachSanPham =  ((DanhSachSanPham)newDanhSach).danhSachSanPham;
    }

    public void menu(){
        String luachon;
        do {
            System.out.println("\n\n\t\tMENU DANH SÁCH SẢN PHẨM.");
            System.out.println("1.Thêm Sản Phẩm Vào Danh Sách.");
            System.out.println("2.Sửa Sản Phẩm Trong Danh Sách.");
            System.out.println("3.Xóa Sản Phẩm Trong Danh Sách.");
            System.out.println("4.Xem Danh Sách Sản Phẩm.");
            System.out.println("5.Tìm Kiếm Sản Phẩm Trong Danh Sách Theo Id.");
            System.out.println("6.Tìm Kiếm Sản Phẩm Trong Danh Sách Theo Tên.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Nhập Thông Tin Sản Phẩm Cần Thêm Vào Danh Sách.");
                    SanPham newSanPham = new SanPham();
                    newSanPham.input();
                    addSanPham(newSanPham);
                }
                case "2" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                    System.out.println("Sửa Thông Tin Sản Phẩm Trong Danh Sách");
                    System.out.print("Nhập Mã Sản Phẩm Cần Thay Đổi Thông Tin: ");
                    String maSanPham = scanner.nextLine();
                    System.out.print("Nhập Thông Tin Sản Phẩm Bạn Muốn Thay Đổi: ");
                    SanPham newSanPham = new SanPham();
                    newSanPham.input();
                    updateSanPham(maSanPham,newSanPham);
                }
                case "3" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                    System.out.print("Nhập Mã Sản Phẩm Cần Xóa: ");
                    String maSanPhamCanXoa = scanner.nextLine();
                    removeSanPham(maSanPhamCanXoa);
                }
                case "4" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                }
                case "5" -> {
                    System.out.print("Nhập ID Sản Phẩm Cần Tìm Kiếm Thông Tin: ");
                    String idCanTim = scanner.nextLine();
                    findById(idCanTim);
                }
                case "6" -> {
                    System.out.print("Nhập Tên Sản Phẩm Cần Tìm Kiếm Thông Tin: ");
                    String nameCanTim = scanner.nextLine();
                    findByName(nameCanTim);
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

    public void menuKH() {
        String luachon;
        do {
            System.out.println("\n\n\t\tMenu Sản Phẩm.");
            System.out.println("1.Xem Danh Sách Sản Phẩm.");
            System.out.println("2.Tìm Kiếm Sản Phẩm Theo Mã Sản Phẩm.");
            System.out.println("3.Tìm Kiếm Sản Phẩm Theo Tên Sản Phẩm.");
            System.out.println("0.Thoát.");
            System.out.println("Nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                }
                case "2" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                    System.out.print("Nhập Mã Sản Phẩm Mà Bạn Muốn Tìm Kiếm Thông Tin: ");
                    String idCanTim = scanner.nextLine();
                    findById(idCanTim).output();
                }
                case "3" -> {
                    System.out.println("Danh Sách Sản Phẩm.");
                    getAll();
                    System.out.print("Nhập Tên Sản Phẩm Mà Bạn Muốn Tìm Kiếm Thông Tin: ");
                    String nameCanTim = scanner.nextLine();
                    findByName(nameCanTim).output();
                }
                case "0" -> {
                    System.out.println("\t\tThoát.");
                }
                default -> {
                    System.err.println("\t\tLỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while(luachon == "0");
    }

    public static void main(String[] args) {
        DanhSachSanPham danhSachSanPham1 = new DanhSachSanPham();
        danhSachSanPham1.menu();
    }
}
