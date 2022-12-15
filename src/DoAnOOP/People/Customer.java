package DoAnOOP.People;

import DoAnOOP.Help.Check;
import DoAnOOP.Output;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.ThongTin.Date;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Customer extends Person implements Output, Serializable {
    @Serial
    private static long serialVersionUID = -123546455L;
    static final Scanner scanner = new Scanner(System.in);
    private String maKhachHang;
    public Customer() {
    }

    public Customer(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Customer(String fullname, String email, String matKhau, Address address, Date dateOfBirth, String maKhachHang) {
        super(fullname, email, matKhau, address, dateOfBirth);
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập Mã Khách Hàng: ");
        maKhachHang = Check.checkMKH();
    }

    @Override
    public void output() {
        System.out.println("Mã Khách Hàng: " + getMaKhachHang());
        super.output();
    }

    @Override
    public void suaThongTinConNguoi() {
        System.out.print("Họ Và Tên: ");
        setFullname(scanner.nextLine());
        System.out.print("Email: ");
        setEmail(Check.checkInputEmail());
        System.out.print("Mật Khẩu: ");
        setMatKhau(Check.inputEmpty().trim());
        System.out.println("Địa Chỉ: ");
        Address a = new Address();
        System.out.print("+Số Nhà: ");
        a.setApartmentNumber(scanner.nextLine());
        System.out.print("+Tên Đường: ");
        a.setStreet(scanner.nextLine());
        System.out.print("+Tên Phường: ");
        a.setPrecinct(scanner.nextLine());
        System.out.print("+Tên Quận: ");
        a.setDistrict(scanner.nextLine());
        System.out.print("+Tên Thành Phố: ");
        a.setCity(scanner.nextLine());
        setAddress(a);
        System.out.println("Ngày Sinh: ");
        Date d = new Date();
        System.out.print("+Ngày: ");
        d.setDay(Check.checkInputInteger());
        System.out.print("+Tháng: ");
        d.setMonth(Check.checkInputInteger());
        System.out.print("+Năm: ");
        d.setYear(Check.checkInputInteger());
        setDateOfBirth(d);
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Khach Hang","Ten Khach Hang","Email","Dia chi","Ngay Sinh"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maKhachHang,this.fullname,this.email,this.address.toString(),this.dateOfBirth.toString()};
    }

//    public static void main(String[] args) {
//        Customer e = new Customer();
//        e.input();
//        e.output();
//    }
}
