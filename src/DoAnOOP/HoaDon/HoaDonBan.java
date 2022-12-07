package DoAnOOP.HoaDon;

import DoAnOOP.ThongTin.Address;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonBan {
    static final Scanner scanner = new Scanner(System.in);
    private String maHoaDon, maKhachHang, maNhanVien;
    private Address address;
    private LocalDateTime ngayBan;
    private static int idIncrement = 0;

    public HoaDonBan() {
        address = new Address("273C","An Duong Vuong","Phuong 4","Quan 5","TP Ho Chi Minh");
        ngayBan = LocalDateTime.now();
        maHoaDon ="HDB" + HoaDonBan.idIncrement;
        HoaDonBan.idIncrement++;
    }

    public HoaDonBan(String maKhachHang, String maNhanVien, LocalDateTime ngayBan) {
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.ngayBan = ngayBan;
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

    public void input() {
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = scanner.nextLine();
        System.out.println("Ngay Ban: " + formattedDate());
    }

}
