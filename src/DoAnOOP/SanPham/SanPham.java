package DoAnOOP.SanPham;

import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;

import java.util.Scanner;

public class SanPham {
    final static Scanner scanner = new Scanner(System.in);
    protected String maSanPham, CPU, ramCapacity, tenSanPham;
    protected Maker thongTinNXS;
    protected Provider thongTinNCC;
    protected float price;
    protected int thoiGianBaoHanh;

    public SanPham() {
    }

    public SanPham(String tenSanPham, String CPU, String ramCapacity, Maker thongTinNXS, Provider thongTinNCC, float price, int thoiGianBaoHanh) {
        this.tenSanPham = tenSanPham;
        this.CPU = CPU;
        this.ramCapacity = ramCapacity;
        this.thongTinNXS = thongTinNXS;
        this.thongTinNCC = thongTinNCC;
        this.price = price;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public Maker getThongTinNXS() {
        return thongTinNXS;
    }

    public void setThongTinNXS(Maker thongTinNXS) {
        this.thongTinNXS = thongTinNXS;
    }

    public Provider getThongTinNCC() {
        return thongTinNCC;
    }

    public void setThongTinNCC(Provider thongTinNCC) {
        this.thongTinNCC = thongTinNCC;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void input() {
        System.out.print("Nhap Ten San Pham: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhap Thong Tin CPU: ");
        CPU = scanner.nextLine();
        System.out.print("Nhap Thong Tin Ram: ");
        ramCapacity = scanner.nextLine();
        System.out.println("Nhap Thong Tin Nha Cung Cap.");
        thongTinNCC.input();
        System.out.println("Nhap Thong Tin Nha San Xuat.");
        thongTinNXS.input();
        System.out.print("Thoi gian bao hanh cua san pham: ");
        thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.print("Gia: ");
        price = Float.parseFloat(scanner.nextLine());
    }

//    public void output() {
//        System.out.printf("%");
//    }
}
