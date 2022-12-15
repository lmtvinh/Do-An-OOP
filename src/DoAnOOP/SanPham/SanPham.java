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
        System.out.print("Nhập Mã Sản Phẩm: ");
        maSanPham = Check.checkMaSP();
        System.out.print("Nhập Tên Sản Phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhập Thông Tin Mainboard: ");
        mainboard = scanner.nextLine();
        System.out.print("Nhập Thông Tin CPU: ");
        CPU = scanner.nextLine();
        System.out.print("Nhập Thông Tin Ram: ");
        ramCapacity = scanner.nextLine();
        System.out.print("Nhập Thông Tin SSD: ");
        SSD = scanner.nextLine();
        System.out.print("Nhập Thông Tin HHD: ");
        HHD = scanner.nextLine();
        System.out.print("Nhập Thông Tin Tản Nhiệt: ");
        cooling = scanner.nextLine();
        System.out.print("Nhập Thông Tin VGA: ");
        VGA = scanner.nextLine();
        System.out.print("Nhập Giá Bán: ");
        price = Check.checkInputInteger();
//        Nha Cung Cap
        System.out.println("Danh Sách Nhà Cung Cấp.");
        Database.getDanhSachNCC().getAll();
        System.out.print("Nhập Mã Nhà Cung Cấp: ");
        maNCC = Check.checkMaNhaCungCap();
//        Nha San Xuat
        System.out.println("Danh Sách Nhà Sản Xuất.");
        Database.getDanhSachNSX().getAll();
        System.out.print("Nhập Mã Nhà Sản Xuất: ");
        maNXS = Check.checkMaNhaSanXuat();
        System.out.print("Thời Gian Bảo Hành Của Sản Phẩm: ");
        thoiGianBaoHanh = Check.checkInputInteger();
        System.out.println("Danh Sách Loại Sản Phẩm.");
        Database.getDanhSachLoaiSanPham().getAll();
        System.out.print("Nhập Mã Loại Sản Phẩm: ");
        idMaLoai = Check.checkMaLoaiSanPham();
        System.out.print("Nhập Số Lượng Sản Phẩm: ");
        soLuongSanPham = Check.checkInputInteger();
    }
//in ra all + nhom san pham
    @Override
    public String[] getThuocTinh() {
        return new String[]{"Mã Sản Phẩm","Tên Sản Phẩm","Mainboard","CPU","Ram","SSD","HHD","Tản Nhiệt","VGA","Giá Bán","Tên Nhà Cung Cấp","Tên Nhà Sản Xuất","Thời Gian Bảo Hành","Mã Loại","Số Lượng"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham, this.tenSanPham, this.mainboard, this.CPU, this.ramCapacity, this.SSD, this.HHD, this.cooling, this.VGA,""+this.price, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(), Database.getDanhSachNSX().findById(this.maNXS).getTenNSX(),""+this.thoiGianBaoHanh, Database.getDanhSachLoaiSanPham().getById(this.idMaLoai).getTenLoai(),""+this.soLuongSanPham};
    }

    public abstract void suaSanPham();

    public void output() {
        System.out.println("Tên Sản Phẩm: " + getTenSanPham());
        System.out.println("Mainboared: " + getMainboard());
        System.out.println("CPU: " + getCPU());
        System.out.println("Ram: " + getRamCapacity());
        System.out.println("SSD: " + getSSD());
        System.out.println("HHD: " + getHHD());
        System.out.println("Tản Nhiệt: " + getCooling());
        System.out.println("VGA: " + getVGA());
        System.out.println("Giá Bán: " + getPrice());
        System.out.println("Tên Nhà Cung Cấp: " + Database.getDanhSachNCC().getByIdProvider(getMaNCC()).getTenNCC());
        System.out.println("Tên Nhà Sản Xuất: " + Database.getDanhSachNSX().findById(getMaNXS()).getTenNSX());
        System.out.println("Thời Gian Bảo Hành: " + thoiGianBaoHanh);
        System.out.println("Tên Loại Sản Phẩm: " + Database.getDanhSachLoaiSanPham().getById(getIdMaLoai()).getTenLoai());
    }

}
