package DoAnOOP.SanPham.PC;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.SanPham.SanPham;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class PC extends SanPham implements Output, Serializable {
    @Serial
    private static long serialVersionUID = 4564131L;
    static final Scanner scanner = new Scanner(System.in);
    private String casePC;
    public PC() {
        super("PC");
    }

    public PC(String maSanPham, String tenSanPham, String mainboard, String CPU, String ramCapacity, String maNXS, String maNCC, String SSD, String HHD, String cooling, String VGA, String idMaLoai, int price, int thoiGianBaoHanh, int soLuongSanPham, String casePC) {
        super(maSanPham, tenSanPham, mainboard, CPU, ramCapacity, maNXS, maNCC, SSD, HHD, cooling, VGA, idMaLoai, price, thoiGianBaoHanh, soLuongSanPham);
        this.casePC = casePC;
        this.nhomSP = "PC";
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap Case PC: ");
        casePC = scanner.nextLine();
    }

    public String getCasePC() {
        return casePC;
    }

    public void setCasePC(String casePC) {
        this.casePC = casePC;
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma San Pham","Ten San Pham","Mainboard","CPU","Ram","SSD","HHD","Tan Nhiet","VGA","Gia Ban","Thong tin Nha Cung Cap","Thong tin Nha San Xuat","Thoi gian bao hanh","Ma Loai","Số Lượng"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maSanPham, this.tenSanPham, this.mainboard, this.CPU, this.ramCapacity, this.SSD, this.HHD, this.cooling, this.VGA,""+this.price, Database.getDanhSachNCC().getByIdProvider(this.maNCC).getTenNCC(), Database.getDanhSachNSX().findById(getMaNXS()).getTenNSX(),""+this.thoiGianBaoHanh, Database.getDanhSachLoaiSanPham().getById(this.idMaLoai).getTenLoai(),""+this.soLuongSanPham};
    }

    @Override
    public void suaSanPham() {
        System.out.print("Nhập Tên Sản Phẩm: ");
        setTenSanPham(scanner.nextLine());
        System.out.print("Mainboard: ");
        setMainboard(scanner.nextLine());
        System.out.print("CPU: ");
        setCPU(scanner.nextLine());
        System.out.print("RAM: ");
        setRamCapacity(scanner.nextLine());
        System.out.print("SSD: ");
        setSSD(scanner.nextLine());
        System.out.print("HHD: ");
        setHHD(scanner.nextLine());
        System.out.print("Tản Nhiệt: ");
        setCooling(scanner.nextLine());
        System.out.print("VGA: ");
        setVGA(scanner.nextLine());
        System.out.print("Giá Bán: ");
        setPrice(Check.checkInputInteger());
        System.out.println("\tDanh Sách Nhà Cung Cấp.");
        Database.getDanhSachNCC().getAll();
        System.out.print("Tên Nhà Cung Cấp: ");
        setMaNCC(Check.checkMaNhaCungCap());
        System.out.println("\tDanh Sách Nhà Sản Xuất.");
        Database.getDanhSachNSX().getAll();
        System.out.print("Tên Nhà Sản Xuất: ");
        setMaNXS(Check.checkMaNhaSanXuat());
        System.out.print("Thời Gian Bảo Hàng: ");
        setThoiGianBaoHanh(Check.checkInputInteger());
        System.out.println("\tDanh Sách Loại Sản Phẩm.");
        Database.getDanhSachLoaiSanPham().getAll();
        System.out.print("Tên Loại Sản Phẩm: ");
        setIdMaLoai(Check.checkMaLoaiSanPham());
        System.out.print("CasePC: ");
        setCasePC(scanner.nextLine());
    }

    @Override
   public void output() {
        super.output();
        System.out.println("Case PC: " + getCasePC());
        System.out.println("Nhóm Sản Phẩm: " + this.nhomSP);
   }
}
