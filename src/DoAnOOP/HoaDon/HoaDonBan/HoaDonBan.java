package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.People.Customer;
import DoAnOOP.People.Employee;
import DoAnOOP.Table;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.View.Main;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonBan implements Output, Serializable {
    @Serial
    private static final long serialVersion = -464542135464646l;
    static final Scanner scanner = new Scanner(System.in);
    private String maHoaDon, maKhachHang, maNhanVien;
    private Address address;
    private LocalDateTime ngayBan,ngaySua;
    private int tongTien;
    private boolean thanhToan = false;

    public HoaDonBan() {
        address = new Address("273C","An Duong Vuong","Phuong 4","Quan 5","TP Ho Chi Minh");
        ngayBan = LocalDateTime.now();
        ngaySua = LocalDateTime.now();
    }

    public HoaDonBan(String maKhachHang, String maNhanVien, int tongTien) {
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.tongTien = tongTien;
    }

    public String formattedDate() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return ngayBan.format(myFormatObj);
    }

    public String formattedDateS() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return ngaySua.format(myFormatObj);
    }

    public boolean isThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(boolean thanhToan) {
        this.thanhToan = thanhToan;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public LocalDateTime getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(LocalDateTime ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Employee getEmployee() {
        return Database.getDanhSachNhanVien().getByIdEmployee(getMaNhanVien());
    }

    public Customer getCustomer() {
        return Database.getDanhSachKhachHang().getByIdCustomer(getMaKhachHang());
    }
     public ArrayList<ChiTietHoaDonBan> getChiTietHoaDonBan() {
         return Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon());
     }

    public void input() {
        maNhanVien = Main.nguoiDung.getMaNV();
        System.out.print("Nhập Mã Khách Hàng: ");
        maKhachHang = Check.checkMaKHTrongDanhSach();
        System.out.println("Ngay Ban: " + formattedDate());
    }

    public void suaHoaDonBan() {
        System.out.println("\tDanh Sách Khách Hàng.");
        Database.getDanhSachKhachHang().getAll();
        System.out.print("Nhập Mã Khách Hàng Bạn Muốn Sửa: ");
        maKhachHang = Check.checkMaKhachHangTrongDanhSanh();
        System.out.println("Ngày Sửa Hóa Đơn: " + formattedDateS());
    }

    public int getTongTien() {
        var n = Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon());
        tongTien = 0;
//        bieu thuc lamda, foreach trong java
        n.forEach(c->tongTien+=c.getThanhTien());
        return tongTien;
    }

    public void xuatHoaDon() {
        System.out.println("Mã Hóa Đơn: " + getMaHoaDon());
        System.out.println("Tên Nhân Viên: " + Database.getDanhSachNhanVien().getByIdEmployee(getMaNhanVien()).getFullname());
        System.out.println("Tên Khách Hàng: " + Database.getDanhSachKhachHang().getByIdCustomer(getMaKhachHang()).getFullname());
        var n = Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon());
        Table.printTable(n);
        System.out.println("Tổng Tiền: " + getTongTien());
    }



    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Hoa Don","Ma Nhan Vien","Ten Nhan Vien","Ma Khach Hang","Ten Khach Hang","Tong Tien"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maHoaDon,this.maNhanVien,Database.getDanhSachNhanVien().getByIdEmployee(this.getMaNhanVien()).getFullname(),this.maKhachHang,Database.getDanhSachKhachHang().getByIdCustomer(this.maKhachHang).getFullname(),""+this.tongTien};
    }
}
