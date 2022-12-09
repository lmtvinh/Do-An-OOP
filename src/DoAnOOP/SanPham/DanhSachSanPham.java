package DoAnOOP.SanPham;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Table;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachSanPham extends ADanhSach{
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachSanPham.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<SanPham> danhSachSanPham ;
    public DanhSachSanPham() {
        danhSachSanPham = new ArrayList<SanPham>();
    }

    public void addSanPham(SanPham newSanPham) {
        danhSachSanPham.add(newSanPham);
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
        Table.createTable(danhSachSanPham);
    }

    public SanPham getById(String idCanCheck) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getMaSanPham()==idCanCheck) {
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
            System.out.println("MENU DANH SACH SAN PHAM.");
            System.out.println("1.Them San Pham Vao Danh Sach.");
            System.out.println("2.Sua San Pham Trong Danh Sach.");
            System.out.println("3.Xoa San Pham Trong Danh Sach.");
            System.out.println("4.Xem Danh Sach San Pham.");
            System.out.println("5.Tim Kiem Danh Sach Theo Id.");
            System.out.println("6.Tim Kiem Danh Sach Theo Ten.");
            System.out.println("0.Thoat.");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("Nhap Thong Rin San Pham Can Them Vao Danh Sach.");
                    SanPham newSanPham = new SanPham();
                    newSanPham.input();
                    addSanPham(newSanPham);
                }
                case "2" -> {
                    System.out.println("Thong Tin Danh Sach San Pham.");
                    getAll();
                    System.out.println("Sua Thong Tin San Pham Trong Danh Sach");
                    System.out.print("Nhap Ma San Pham Can Sua: ");
                    String maSanPham = scanner.nextLine();
                    System.out.print("Nhap Thong Tin San Pham Ban Muon Sua: ");
                    SanPham newSanPham = new SanPham();
                    newSanPham.input();
                    updateSanPham(maSanPham,newSanPham);
                }
                case "3" -> {
                    System.out.println("Thong Tin Danh Sach San Pham.");
                    getAll();
                    System.out.print("Nhap Ma San Pham Can Xoa: ");
                    String maSanPhamCanXoa = scanner.nextLine();
                    removeSanPham(maSanPhamCanXoa);
                }
                case "4" -> {
                    System.out.println("Thong Tin Danh Sach San Pham.");
                    getAll();
                }
                case "5" -> {
                    System.out.print("Nhap ID San Pham Can Tim Kiem Thong Tin: ");
                    String idCanTim = scanner.nextLine();
                    findById(idCanTim);
                }
                case "6" -> {
                    System.out.print("Nhap Ten San Pham Can Tim Kiem Thong Tin: ");
                    String nameCanTim = scanner.nextLine();
                    findByName(nameCanTim);
                }
                case "0" -> {
                    System.err.println("THOAT.");
                }
                default -> {
                    System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                }
            }
        } while (luachon != "0");
    }

    public static void main(String[] args) {
        DanhSachSanPham danhSachSanPham1 = new DanhSachSanPham();
        danhSachSanPham1.menu();
    }
}
