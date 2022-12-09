package DoAnOOP.SanPham.Laptop;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.SanPham;

import java.util.Scanner;

public class Laptop extends SanPham implements Output {
    static final Scanner scanner = new Scanner(System.in);
    private String maLaptop;
    private String screensize, resolution;
    private String maLoaiLaptop;
    public Laptop() {
    }

    public Laptop(String maLaptop, String screensize, String resolution, String maLoaiLaptop) {
        this.maLaptop = maLaptop;
        this.screensize = screensize;
        this.resolution = resolution;
        this.maLoaiLaptop = maLoaiLaptop;
    }

    public Laptop(String tenSanPham, String CPU, String ramCapacity, String maNXS, String maNCC, int price, int thoiGianBaoHanh, String maLaptop, String screensize, String resolution, String maLoaiLaptop) {
        super(tenSanPham, CPU, ramCapacity, maNXS, maNCC, price, thoiGianBaoHanh);
        this.maLaptop = maLaptop;
        this.screensize = screensize;
        this.resolution = resolution;
        this.maLoaiLaptop = maLoaiLaptop;
    }

    public String getMaLaptop() {
        return maLaptop;
    }

    public void setMaLaptop(String maLaptop) {
        this.maLaptop = maLaptop;
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

    public String getMaLoaiLaptop() {
        return maLoaiLaptop;
    }

    public void setMaLoaiLaptop(String maLoaiLaptop) {
        this.maLoaiLaptop = maLoaiLaptop;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Kich thuoc Man hinh Laptop(inch): ");
        screensize = scanner.nextLine();
        System.out.print("Nhap Do phan giai Man hinh Laptop: ");
        resolution = scanner.nextLine();
        System.out.print("Nhap Ma Loai Laptop.");
        maLoaiLaptop = scanner.nextLine();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","CPU","Ram","Nha Cung Cap","Nha San Xuat","Thoi han bao hanh","Gia","Kich thuoc Man hinh Laptop(inch)","Do phan giai Man hinh Laptop","Loai Laptop"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham,this.tenSanPham,this.CPU,this.ramCapacity, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(),Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh,""+this.price,this.screensize,this.resolution,Database.getDanhSachLoaiPC().getByIdLoaiPC(this.maLoaiLaptop).getTenLoai()};
    }
}
