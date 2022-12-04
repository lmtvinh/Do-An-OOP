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

    public PC() {
        maPC = Maker. + id;
        id++;
    }

    public PC(String tenSanPham, String CPU, String ramCapacity, Maker thongTinNXS, Provider thongTinNCC, float price, int thoiGianBaoHanh, String maPC, String mainboard, String casePC, String SSD, String HHD, String cooling, String VGA) {
        super(tenSanPham, CPU, ramCapacity, thongTinNXS, thongTinNCC, price, thoiGianBaoHanh);
        this.maPC = maPC;
        this.mainboard = mainboard;
        this.casePC = casePC;
        this.SSD = SSD;
        this.HHD = HHD;
        this.cooling = cooling;
        this.VGA = VGA;
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

    public void input() {

    }
}
