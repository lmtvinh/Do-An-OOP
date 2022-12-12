package DoAnOOP.People;

import DoAnOOP.Output;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.Help.Check;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Employee extends Person implements Output, Serializable {
    @Serial
    private static long serialVersionUID = -456478797466L;
    static final Scanner scanner = new Scanner(System.in);
    private String maNV, matKhau;
    private float heSoLuong, luongCoBan, soGioLam;

    public Employee() {
    }

    public Employee(String maNV,String matKhau, float heSoLuong, float luongCoBan, float soGioLam) {
        this.matKhau = matKhau;
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soGioLam = soGioLam;
    }

    public Employee(String fullname, String email, Address address, Date dateOfBirth, String maNV,String matKhau, float heSoLuong, float luongCoBan, float soGioLam) {
        super(fullname, email, address, dateOfBirth);
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soGioLam = soGioLam;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float tinhLuong() {
        return heSoLuong*soGioLam + luongCoBan;
    }

    public float getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(float soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public void input() {
        String luachon;
        System.out.println("\n\n\t\tMenu Lựa Chọn.");
        System.out.println("1.Quản Lí.");
        System.out.println("2.Nhân Viên.");
        System.out.print("Nhập Lựa Chọn Của Bạn: ");
        luachon = scanner.nextLine();
        switch (luachon) {
            case "1" -> {
                super.input();
                System.out.print("Nhập Mã Quản Lí Của Nhân Viên(username): ");
                maNV = Check.checkMSQL();
                System.out.print("Nhập Mật Khẩu: ");
                matKhau = scanner.nextLine();
                System.out.print("Nhập Lương Cơ Bản Của Quản Lí: ");
                luongCoBan = Check.checkInputInteger();
                System.out.print("Nhập Số Giờ Làm Của Quản Lí: ");
                soGioLam = Check.checkInputInteger();
//              Hệ Số Lương Của Quản Lí
                setHeSoLuong(50000);
            }
            case "2" -> {
                super.input();
                System.out.print("Nhập Mã Quản Lí Của Quản Lí(username): ");
                maNV = Check.checkMSNV();
                System.out.print("Nhập Mật Khẩu: ");
                matKhau = scanner.nextLine();
                System.out.print("Nhập Lương Cơ Bản Của Nhân Viên: ");
                luongCoBan = Check.checkInputInteger();
                System.out.print("Nhập Số Giờ Làm Của Nhân Viên: ");
                soGioLam = Check.checkInputInteger();
//                Hệ Số Lương Của Nhân Viên
                setHeSoLuong(30000);
            }
            default -> {
                System.err.println("\t\tLỰA CHỌN CỦA BẠN KHÔNG HỢP LỆ");
            }
        }
    }

    @Override
    public void output() {
        System.out.println("Mã Nhân Viên: " + getMaNV());
        super.output();
        System.out.println("Số Giờ Làm: " + soGioLam);
        System.out.println("Lương: " + tinhLuong());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.output();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Nhan Vien","Ten Nhan Vien","Email","Dia Chi","Luong co ban","So gio lam","Luong"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maNV,this.fullname,this.email,this.address.toString(),""+this.luongCoBan,""+this.soGioLam,""+tinhLuong()};
    }
}
