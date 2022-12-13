package DoAnOOP.SanPham.Laptop;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.SanPham;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Laptop extends SanPham implements Output, Serializable {
    @Serial
    private static long serialVersionUID = 46456457978L;
    static final Scanner scanner = new Scanner(System.in);
    private String screensize, resolution;
    public Laptop() {
    }

    public Laptop(String maSanPham, String tenSanPham, String mainboard, String CPU, String ramCapacity, String maNXS, String maNCC, String SSD, String HHD, String cooling, String VGA, String idMaLoai, int price, int thoiGianBaoHanh, int soLuongSanPham, String screensize, String resolution) {
        super(maSanPham, tenSanPham, mainboard, CPU, ramCapacity, maNXS, maNCC, SSD, HHD, cooling, VGA, idMaLoai, price, thoiGianBaoHanh, soLuongSanPham);
        this.screensize = screensize;
        this.resolution = resolution;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Kich thuoc Man hinh Laptop(inch): ");
        screensize = scanner.nextLine();
        System.out.print("Nhap Do phan giai Man hinh Laptop: ");
        resolution = scanner.nextLine();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","Mainboard","CPU","Ram","SSD","HHD","Tan Nhiet","VGA","Gia Ban","Thong tin Nha Cung Cap","Thong tin Nha San Xuat","Thoi gian bao hanh","Ma Loai","Kich Thuoc Man Hinh","Do Phan Giai"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham, this.tenSanPham, this.mainboard, this.CPU, this.ramCapacity, this.SSD, this.HHD, this.cooling, this.VGA,""+this.price, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(), Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh, Database.getDanhSachLoaiSanPham().getById(this.idMaLoai).getTenLoai(),this.screensize,this.resolution};
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Kích Thước Màn Hình: " + screensize);
        System.out.println("Độ Phân Giải Màn Hình: " + resolution);
    }
}
