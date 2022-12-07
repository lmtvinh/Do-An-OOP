package DoAnOOP.SanPham.PC;

import DoAnOOP.SanPham.SanPham;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;

import java.util.Scanner;

public class PC extends SanPham {
    static final Scanner scanner = new Scanner(System.in);
    public static int id = 0;
    private String maPC;
    private String mainboard, casePC, SSD, HHD, cooling, VGA;
    private String maLoaiPC;

    public PC() {
    }

    public PC(String tenSanPham, String CPU, String ramCapacity, Maker thongTinNXS, Provider thongTinNCC, float price, int thoiGianBaoHanh, String maPC, String mainboard, String casePC, String SSD, String HHD, String cooling, String VGA,String maLoaiPC) {
        super(tenSanPham, CPU, ramCapacity, thongTinNXS, thongTinNCC, price, thoiGianBaoHanh);
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
        System.out.print("Nhap Thong tin ve CPU: ");
        CPU = scanner.nextLine();
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

//    public void output() {
//
//    }
}
