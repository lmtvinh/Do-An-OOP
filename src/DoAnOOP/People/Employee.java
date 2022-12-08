package DoAnOOP.People;

import DoAnOOP.Output;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.Help.Check;

import java.util.Scanner;

public class Employee extends Person implements Output {
    static final Scanner scanner = new Scanner(System.in);
    private String maNV;
    private float heSoLuong, luongCoBan, soGioLam;

    public Employee() {
    }

    public Employee(String maNV, float heSoLuong, float luongCoBan, float soGioLam) {
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soGioLam = soGioLam;
    }

    public Employee(String fullname, String email, Address address, Date dateOfBirth, String maNV, float heSoLuong, float luongCoBan, float soGioLam) {
        super(fullname, email, address, dateOfBirth);
        this.maNV = maNV;
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
        do {
            System.out.println("-------------Menu----------");
            System.out.println("1.Dang nhap.");
            System.out.println("0.Thoat.");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (Integer.parseInt(luachon)) {
                case 1 -> {
                    do {
                        System.out.println("-------------Menu----------");
                        System.out.print("user name: ");
                        String user = scanner.nextLine();
                        System.out.print("password: ");
                        String password = scanner.nextLine();
                        if (user.equals("quanli") && password.equals("quanli")) {
                            super.input();
                            System.out.print("Nhap Ma Quan Li: ");
                            maNV = Check.checkMSQL();
                            System.out.print("Nhap Luong co ban Quan Li: ");
                            luongCoBan = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nhap so Gio lam cua Quan Li: ");
                            soGioLam = Integer.parseInt(scanner.nextLine());
                        } else {
                            super.input();
                            System.out.print("Nhap Ma Nhan vien: ");
                            maNV = Check.checkMSNV();
                            System.out.print("Nhap Luong co ban Nhan vien: ");
                            luongCoBan = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nhap so Gio lam cua Nhan vien: ");
                            soGioLam = Integer.parseInt(scanner.nextLine());
                        }
                    } while (luachon != "0");
                }
            }
        } while (luachon != "0");
    }
    public void output() {
        System.out.printf("%-15s%-25s%-25s%-25s%-15s%-12s%-12s\n","Ma Nhan Vien","Ten Nhan Vien","Email","Address","Luong Co Ban","So Gio Lam","Luong");
        System.out.printf("%-15s%-25s%-25s%-25s%-15f%-12f%-12f\n",getMaNV(),getFullname(),getEmail(),getAddress().toString(),getLuongCoBan(),getSoGioLam(),tinhLuong());
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
