package DoAnOOP.SanPham;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.PC.PC;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;

import java.util.Scanner;

public class SanPham implements Output {
    final static Scanner scanner = new Scanner(System.in);
    protected String maSanPham,tenSanPham, mainboard, CPU, ramCapacity, maNXS, maNCC, SSD, HHD, cooling, VGA, idMaLoai;
    protected int price, thoiGianBaoHanh;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String mainboard, String CPU, String ramCapacity, String maNXS, String maNCC, String SSD, String HHD, String cooling, String VGA, String idMaLoai, int price, int thoiGianBaoHanh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.mainboard = mainboard;
        this.CPU = CPU;
        this.ramCapacity = ramCapacity;
        this.maNXS = maNXS;
        this.maNCC = maNCC;
        this.SSD = SSD;
        this.HHD = HHD;
        this.cooling = cooling;
        this.VGA = VGA;
        this.idMaLoai = idMaLoai;
        this.price = price;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
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

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getHHD() {
        return HHD;
    }

    public void setHHD(String HHD) {
        this.HHD = HHD;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public String getVGA() {
        return VGA;
    }

    public void setVGA(String VGA) {
        this.VGA = VGA;
    }

    public String getIdMaLoai() {
        return idMaLoai;
    }

    public void setIdMaLoai(String idMaLoai) {
        this.idMaLoai = idMaLoai;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public Provider getThongTinNCC(String idCanCheck) {
        return Database.getDanhSachNCC().getByIdProvider(idCanCheck);
    }

    public void input() {
        System.out.print("Nhap Ma San Pham: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhap Ten San Pham: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhap Thong Tin Mainboard: ");
        mainboard = scanner.nextLine();
        System.out.print("Nhap Thong Tin CPU: ");
        CPU = scanner.nextLine();
        System.out.print("Nhap Thong Tin Ram: ");
        ramCapacity = scanner.nextLine();
        System.out.print("Nhap Thong Tin SSD: ");
        SSD = scanner.nextLine();
        System.out.print("Nhap Thong Tin HHD: ");
        HHD = scanner.nextLine();
        System.out.print("Nhap Thong Tin Tan Nhiet: ");
        cooling = scanner.nextLine();
        System.out.print("Nhap Thong Tin VGA: ");
        VGA = scanner.nextLine();
        System.out.print("Nhap Gia Ban: ");
        price = Check.checkInputInteger();
        System.out.print("Nhap Ma Nha Cung Cap.");
        maNCC = scanner.nextLine();
        System.out.print("Nhap Ma Nha San Xuat.");
        maNCC = scanner.nextLine();
        System.out.print("Thoi gian bao hanh cua san pham: ");
        thoiGianBaoHanh = Check.checkInputInteger();
        System.out.print("Nhap Ma Loai San Pham: ");
        idMaLoai = scanner.nextLine();
    }
//in ra all + nhom san pham
    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Sa"};
    }

//

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham,this.tenSanPham,this.CPU,this.ramCapacity,Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(),Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh,""+this.price,this instanceof PC ?"PC":"LAPTOP"};
    }

}
