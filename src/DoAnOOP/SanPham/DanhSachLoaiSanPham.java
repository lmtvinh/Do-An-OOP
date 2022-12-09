package DoAnOOP.SanPham;

import DoAnOOP.File.ADanhSach;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachLoaiSanPham extends ADanhSach {
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachLoaiSanPham.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<LoaiSanPham> danhSachLoaiSanPham;
    public DanhSachLoaiSanPham() {
        danhSachLoaiSanPham = new ArrayList<LoaiSanPham>();
    }

    public void addLoaiSanPham(LoaiSanPham newLoaiSanPham) {
        danhSachLoaiSanPham.add(newLoaiSanPham);
    }

    public void removeLoaiSanPham(String maLoaiCanXoa) {
        for (int i = 0;i < danhSachLoaiSanPham.size(); i++) {
            if (Objects.equals(danhSachLoaiSanPham.get(i).getMaLoai(), maLoaiCanXoa)) {
                danhSachLoaiSanPham.remove(danhSachLoaiSanPham.get(i));
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH.");
    }

    public void updateLoaiSanPham(String maLoaiCanSua, LoaiSanPham newLoaiSanPham) {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            if (Objects.equals(danhSachLoaiSanPham.get(i).getMaLoai(), maLoaiCanSua)) {
                danhSachLoaiSanPham.set(i,danhSachLoaiSanPham.get(i));
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH");
    }

    public void getAll() {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            danhSachLoaiSanPham.get(i);
        }
    }

    public LoaiSanPham getById(String idCanCheck) {
        for (int i = 0; i < danhSachLoaiSanPham.size(); i++) {
            if (danhSachLoaiSanPham.get(i).getMaLoai() == idCanCheck) {
                return danhSachLoaiSanPham.get(i);
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.danhSachLoaiSanPham = ((DanhSachLoaiSanPham)newDanhSach).danhSachLoaiSanPham;
    }
}
