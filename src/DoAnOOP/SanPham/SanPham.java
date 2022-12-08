package DoAnOOP.SanPham;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.ThongTin.Maker;

import java.util.Scanner;

public class SanPham implements Output {
    final static Scanner scanner = new Scanner(System.in);
    protected String maSanPham, CPU, ramCapacity, tenSanPham, maNXS, maNCC;
    protected float price;
    protected int thoiGianBaoHanh;

    public SanPham() {
    }

    public SanPham(String tenSanPham, String CPU, String ramCapacity, String maNXS, String maNCC, float price, int thoiGianBaoHanh) {
        this.tenSanPham = tenSanPham;
        this.CPU = CPU;
        this.ramCapacity = ramCapacity;
        this.maNXS = maNXS;
        this.maNCC = maNCC;
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

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMaNXS() {
        return maNXS;
    }

    public void setMaNXS(String maNXS) {
        this.maNXS = maNXS;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
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

    public Maker getThongTinNXS(String idCanCheck) {
        return Database.getDanhSachNSX().findById(idCanCheck);
    }

    public void input() {
        System.out.print("Nhap Ten San Pham: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhap Thong Tin CPU: ");
        CPU = scanner.nextLine();
        System.out.print("Nhap Thong Tin Ram: ");
        ramCapacity = scanner.nextLine();
        System.out.println("Nhap Ma Nha Cung Cap.");
        maNCC = scanner.nextLine();
        System.out.println("Nhap Ma Nha San Xuat.");
        maNCC = scanner.nextLine();
        System.out.print("Thoi gian bao hanh cua san pham: ");
        thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.print("Gia: ");
        price = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","CPU","Ram","Nha Cung Cap","Nha San Xuat","Thoi han bao hanh","Gia"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham,this.tenSanPham,this.CPU,this.ramCapacity,Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(),Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh,""+this.price};
    }

//    public void output() {
//        System.out.printf("%");
//    }
}
