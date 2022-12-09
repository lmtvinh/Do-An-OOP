package DoAnOOP.SanPham.PC;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.SanPham;

import java.util.Scanner;

public class PC extends SanPham implements Output {
    static final Scanner scanner = new Scanner(System.in);
    private String casePC;
    public PC() {
    }

    public PC(String maSanPham, String tenSanPham, String mainboard, String CPU, String ramCapacity, String maNXS, String maNCC, String SSD, String HHD, String cooling, String VGA, String idMaLoai, int price, int thoiGianBaoHanh, String casePC) {
        super(maSanPham, tenSanPham, mainboard, CPU, ramCapacity, maNXS, maNCC, SSD, HHD, cooling, VGA, idMaLoai, price, thoiGianBaoHanh);
        this.casePC = casePC;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Case PC: ");
        casePC = scanner.nextLine();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","Mainboard","CPU","Ram","SSD","HHD","Tan Nhiet","VGA","Gia Ban","Thong tin Nha Cung Cap","Thong tin Nha San Xuat","Thoi gian bao hanh","Ma Loai","Case PC"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham, this.tenSanPham, this.mainboard, this.CPU, this.ramCapacity, this.SSD, this.HHD, this.cooling, this.VGA,""+this.price, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(), Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh, Database.getDanhSachLoaiSanPham().getById(this.idMaLoai).getTenLoai(),this.casePC};
    }

//    public void output() {
//
//    }
}
