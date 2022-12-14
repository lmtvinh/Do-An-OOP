package DoAnOOP.SanPham;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public abstract class SanPham implements Output, Serializable {
    @Serial
    private static long serialVersionUID = 54561331213L;
    final static Scanner scanner = new Scanner(System.in);
    protected String maSanPham,tenSanPham, mainboard, CPU, ramCapacity, maNXS, maNCC, SSD, HHD, cooling, VGA, idMaLoai;
    protected int price, thoiGianBaoHanh, soLuongSanPham;

    protected String nhomSP;

    public String getNhomSP() {
        return nhomSP;
    }

    public void setNhomSP(String nhomSP) {
        this.nhomSP = nhomSP;
    }

    public SanPham(String nhomSP) {
        this.nhomSP = nhomSP;
    }

    public SanPham(String maSanPham, String tenSanPham, String mainboard, String CPU, String ramCapacity, String maNXS, String maNCC, String SSD, String HHD, String cooling, String VGA, String idMaLoai, int price, int thoiGianBaoHanh, int soLuongSanPham) {
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
        this.soLuongSanPham = soLuongSanPham;
    }

    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
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
        System.out.print("Nh???p M?? S???n Ph???m: ");
        maSanPham = Check.checkMaSP();
        System.out.print("Nh???p T??n S???n Ph???m: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin Mainboard: ");
        mainboard = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin CPU: ");
        CPU = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin Ram: ");
        ramCapacity = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin SSD: ");
        SSD = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin HHD: ");
        HHD = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin T???n Nhi???t: ");
        cooling = scanner.nextLine();
        System.out.print("Nh???p Th??ng Tin VGA: ");
        VGA = scanner.nextLine();
        System.out.print("Nh???p Gi?? B??n: ");
        price = Check.checkInputInteger();
//        Nha Cung Cap
        System.out.println("Danh S??ch Nh?? Cung C???p.");
        Database.getDanhSachNCC().getAll();
        System.out.print("Nh???p M?? Nh?? Cung C???p: ");
        maNCC = Check.checkMaNhaCungCap();
//        Nha San Xuat
        System.out.println("Danh S??ch Nh?? S???n Xu???t.");
        Database.getDanhSachNSX().getAll();
        System.out.print("Nh???p M?? Nh?? S???n Xu???t: ");
        maNXS = Check.checkMaNhaSanXuat();
        System.out.print("Th???i Gian B???o H??nh C???a S???n Ph???m: ");
        thoiGianBaoHanh = Check.checkInputInteger();
        System.out.println("Danh S??ch Lo???i S???n Ph???m.");
        Database.getDanhSachLoaiSanPham().getAll();
        System.out.print("Nh???p M?? Lo???i S???n Ph???m: ");
        idMaLoai = Check.checkMaLoaiSanPham();
        System.out.print("Nh???p S??? L?????ng S???n Ph???m: ");
        soLuongSanPham = Check.checkInputInteger();
    }
//in ra all + nhom san pham
    @Override
    public String[] getThuocTinh() {
        return new String[]{"M?? S???n Ph???m","T??n S???n Ph???m","Mainboard","CPU","Ram","SSD","HHD","T???n Nhi???t","VGA","Gi?? B??n","T??n Nh?? Cung C???p","T??n Nh?? S???n Xu???t","Th???i Gian B???o H??nh","M?? Lo???i","S??? L?????ng"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham, this.tenSanPham, this.mainboard, this.CPU, this.ramCapacity, this.SSD, this.HHD, this.cooling, this.VGA,""+this.price, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(), Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh, Database.getDanhSachLoaiSanPham().getById(this.idMaLoai).getTenLoai(),""+this.soLuongSanPham};
    }

    public abstract void suaSanPham();

    public void output() {
        System.out.println("T??n S???n Ph???m: " + getTenSanPham());
        System.out.println("Mainboared: " + getMainboard());
        System.out.println("CPU: " + getCPU());
        System.out.println("Ram: " + getRamCapacity());
        System.out.println("SSD: " + getSSD());
        System.out.println("HHD: " + getHHD());
        System.out.println("T???n Nhi???t: " + getCooling());
        System.out.println("VGA: " + getVGA());
        System.out.println("Gi?? B??n: " + getPrice());
        System.out.println("T??n Nh?? Cung C???p: " + Database.getDanhSachNCC().getByIdProvider(getMaNCC()).getTenNCC());
        System.out.println("T??n Nh?? S???n Xu???t: " + Database.getDanhSachNSX().findById(getMaNXS()).getTenNSX());
        System.out.println("Th???i Gian B???o H??nh: " + thoiGianBaoHanh);
        System.out.println("T??n Lo???i S???n Ph???m: " + Database.getDanhSachLoaiSanPham().getById(getIdMaLoai()).getTenLoai());
    }

}
