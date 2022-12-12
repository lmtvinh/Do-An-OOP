package DoAnOOP.HoaDon.HoaDonBan;

import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Output;
import DoAnOOP.People.Customer;
import DoAnOOP.People.Employee;
import DoAnOOP.ThongTin.Address;

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
    private LocalDateTime ngayBan;
    private int tongTien;

    public HoaDonBan() {
        address = new Address("273C","An Duong Vuong","Phuong 4","Quan 5","TP Ho Chi Minh");
        ngayBan = LocalDateTime.now();
    }

    public HoaDonBan(String maKhachHang, String maNhanVien) {
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
    }

    public String formattedDate() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = ngayBan.format(myFormatObj);
        return formattedDate;
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
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = scanner.nextLine();
        System.out.println("Ngay Ban: " + formattedDate());
    }

//    public int getTongTien() {
//        for (int i = 0; i < Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon()).size(); i++) {
//            tongTien += Database.getChiTietPhieuNhap(getMaHoaDon()).getThanhTienLaptop();
//            tongTien += Database.getChiTietPhieuNhap(getMaHoaDon()).getThanhTienPC();
//        }
//        return tongTien;
//    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Hoa Don","Ma Nhan Vien","Ten Nhan Vien","Ma Khach Hang","Ten Khach Hang","Tong Tien"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maHoaDon,this.maNhanVien,Database.getDanhSachNhanVien().getByIdEmployee(this.getMaNhanVien()).getFullname(),this.maKhachHang,Database.getDanhSachKhachHang().getByIdCustomer(this.maKhachHang).getFullname(),""+this.tongTien};
    }
}
