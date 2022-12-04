package DoAnOOP.SanPham.Laptop;

import DoAnOOP.SanPham.SanPham;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;

import java.util.Scanner;

public class Laptop extends SanPham {
    static final Scanner scanner = new Scanner(System.in);
    private String maLaptop;
    private String screensize, resolution;
    private LoaiLaptop loaiLaptop;
    public Laptop() {
    }

    public Laptop(String maLaptop, String screensize, String resolution, LoaiLaptop loaiLaptop) {
        this.maLaptop = maLaptop;
        this.screensize = screensize;
        this.resolution = resolution;
        this.loaiLaptop = loaiLaptop;
    }

    public Laptop(String tenSanPham, String CPU, String ramCapacity, Maker thongTinNXS, Provider thongTinNCC, float price, int thoiGianBaoHanh, String maLaptop, String screensize, String resolution, LoaiLaptop loaiLaptop) {
        super(tenSanPham, CPU, ramCapacity, thongTinNXS, thongTinNCC, price, thoiGianBaoHanh);
        this.maLaptop = maLaptop;
        this.screensize = screensize;
        this.resolution = resolution;
        this.loaiLaptop = loaiLaptop;
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

    public LoaiLaptop getLoaiLaptop() {
        return loaiLaptop;
    }

    public void setLoaiLaptop(LoaiLaptop loaiLaptop) {
        this.loaiLaptop = loaiLaptop;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Kich thuoc Man hinh Laptop(inch): ");
        screensize = scanner.nextLine();
        System.out.print("Nhap Do phan giai Man hinh Laptop: ");
        resolution = scanner.nextLine();
        System.out.print("Nhap Thong tin ve Loai Laptop.");
        loaiLaptop.input();
    }
}
