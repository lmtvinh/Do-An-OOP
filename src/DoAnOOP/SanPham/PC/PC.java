package DoAnOOP.SanPham.PC;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.SanPham;

import java.util.Scanner;

public class PC extends SanPham implements Output {
    static final Scanner scanner = new Scanner(System.in);
    public static int id = 0;
    private String maPC;
    private String mainboard, casePC, SSD, HHD, cooling, VGA;
    private String maLoaiPC;

    public PC() {
    }

    public PC(String tenSanPham, String CPU, String ramCapacity, String maNXS, String maNCC, int price, int thoiGianBaoHanh, String maPC, String mainboard, String casePC, String SSD, String HHD, String cooling, String VGA,String maLoaiPC) {
        super(tenSanPham, CPU, ramCapacity, maNXS, maNCC, price, thoiGianBaoHanh);
        this.maPC = maPC;
        this.mainboard = mainboard;
        this.casePC = casePC;
        this.SSD = SSD;
        this.HHD = HHD;
        this.cooling = cooling;
        this.VGA = VGA;
        this.maLoaiPC = maLoaiPC;
    }

    public String getMaPC() {
        return maPC;
    }

    public void setMaPC(String maPC) {
        this.maPC = maPC;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getCasePC() {
        return casePC;
    }

    public void setCasePC(String casePC) {
        this.casePC = casePC;
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

    public String getMaLoaiPC() {
        return maLoaiPC;
    }

    public void setMaLoaiPC(String maLoaiPC) {
        this.maLoaiPC = maLoaiPC;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Thong tin ve Mainboard: ");
        mainboard = scanner.nextLine();
        System.out.print("Nhap Thong tin ve Case PC: ");
        casePC = scanner.nextLine();
        System.out.print("Nhap Thong tin ve SSD: ");
        SSD = scanner.nextLine();
        System.out.print("Nhap Thong tin ve HHD: ");
        HHD = scanner.nextLine();
        System.out.print("Nhap Thong tin ve Tan nhiet: ");
        cooling = scanner.nextLine();
        System.out.print("Nhap Thong tin ve VGA: ");
        VGA = scanner.nextLine();
        System.out.print("Nhap Ma Loai PC.");
        maLoaiPC = scanner.nextLine();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","CPU","Ram","Nha Cung Cap","Nha San Xuat","Thoi han bao hanh","Gia","Mainboard","Case","SSD","HHD","Tan nhiet","VGD","Loai PC"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham,this.tenSanPham,this.CPU,this.ramCapacity, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(),Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh,""+this.price,this.mainboard,this.casePC,this.SSD,this.HHD,this.cooling,Database.getDanhSachLoaiPC().getByIdLoaiPC(this.maLoaiPC).getTenLoai()};
    }

//    public void output() {
//
//    }
}
