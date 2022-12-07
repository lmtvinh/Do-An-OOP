package DoAnOOP.People;

import DoAnOOP.Help.Check;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.ThongTin.Date;

import java.util.Scanner;

public class Customer extends Person  {
    static final Scanner scanner = new Scanner(System.in);
    private String maKhachHang;
    static private int phanLoaiKhachHang;
    public Customer() {
    }

    public Customer(String maKhachHang, int phanLoaiKhachHang) {
        this.maKhachHang = maKhachHang;
        this.phanLoaiKhachHang = phanLoaiKhachHang;
    }

    public Customer(String fullname, String email, Address address, Date dateOfBirth, String maKhachHang) {
        super(fullname, email, address, dateOfBirth);
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getPhanLoaiKhachHang() {
        return phanLoaiKhachHang;
    }

    public void setPhanLoaiKhachHang(int phanLoaiKhachHang) {
        this.phanLoaiKhachHang = phanLoaiKhachHang;
    }

    @Override
    public void input() {
        super.input();
        String luachon;
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = Check.checkMKH();
        // System.out.println("Khach hang thuoc nhom nao?");
        // System.out.println("1.Nhom I(Giam gia 25%): ");
        // System.out.println("2.Nhom II(Giam gia 15%): ");
        // System.out.println("3.Nhom IV(Giam gia 10%): ");
        // System.out.print("Nhap: ");
        // phanLoaiKhachHang = Check.checkPLKH();
    }

    public void output() {
        System.out.printf("%-8s%-25s%-15s%-12s\n",getMaKhachHang(),null,getPhanLoaiKhachHang());
    }

//    public static void main(String[] args) {
//        Customer e = new Customer();
//        e.input();
//        e.output();
//    }
}
