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
    private int tongTien = 0;
    private boolean thanhToan = false;

    public HoaDonBan() {
        address = new Address("273C","An Duong Vuong","Phuong 4","Quan 5","TP Ho Chi Minh");
        ngayBan = LocalDateTime.now();
        ngaySua = LocalDateTime.now();
    }

    public HoaDonBan(String maKhachHang, String maNhanVien, int tongTien, boolean thanhToan) {
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.tongTien = tongTien;
        this.thanhToan = thanhToan;
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
        System.out.print("Nh???p M?? Kh??ch H??ng: ");
        maKhachHang = Check.checkMaKHTrongDanhSach();
        System.out.println("Ngay Ban: " + formattedDate());
    }

    public void suaHoaDonBan() {
        System.out.println("\tDanh S??ch Kh??ch H??ng.");
        Database.getDanhSachKhachHang().getAll();
        System.out.print("Nh???p M?? Kh??ch H??ng B???n Mu???n S???a: ");
        maKhachHang = Check.checkMaKhachHangTrongDanhSanh();
        System.out.println("Ng??y S???a H??a ????n: " + formattedDateS());
    }

    public int getTongTien() {
        var n = Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon());
//        bieu thuc lamda, foreach trong java
        n.forEach(c->tongTien+=c.getThanhTien());
        return tongTien;
    }

    public void xuatHoaDon() {
        System.out.println("M?? H??a ????n: " + getMaHoaDon());
        System.out.println("T??n Nh??n Vi??n: " + Database.getDanhSachNhanVien().getByIdEmployee(getMaNhanVien()).getFullname());
        System.out.println("T??n Kh??ch H??ng: " + Database.getDanhSachKhachHang().getByIdCustomer(getMaKhachHang()).getFullname());
        var n = Database.getDanhSachChiTietHoaDonBan().getChiTietHoaDonBan(getMaHoaDon());
        Table.printTable(n);
        System.out.println("T???ng Ti???n: " + getTongTien());
    }



    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Hoa Don","Ma Nhan Vien","Ten Nhan Vien","Ma Khach Hang","Ten Khach Hang","Tong Tien","Tr???ng Th??i H??a ????n"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maHoaDon,this.maNhanVien,Database.getDanhSachNhanVien().getByIdEmployee(this.getMaNhanVien()).getFullname(),this.maKhachHang,Database.getDanhSachKhachHang().getByIdCustomer(this.maKhachHang).getFullname(),""+this.getTongTien(),thanhToan?"???? thanh to??n":"Ch??a thanh to??n"};
    }
}
