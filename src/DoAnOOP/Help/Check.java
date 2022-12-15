package DoAnOOP.Help;

import DoAnOOP.HoaDon.PhieuNhap.PhieuNhap;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.People.Customer;
import DoAnOOP.SanPham.LoaiSanPham;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;
import DoAnOOP.View.KhachHang;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Check {
    static final Scanner scanner = new Scanner(System.in);
    public static boolean checkNgayThangNam(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        }
        else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
            sdfrmt.setLenient(false);
            try {
                Date javaDate = sdfrmt.parse(strDate);
            } catch (ParseException e) {
                return false;
            }
        }
        return true;
    }

    public static String checkMSNV() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if(input.matches("NV"+"[0-9]{3}") && (Database.getDanhSachNhanVien().getByIdEmployee(input)==null)) {
                return input;
            } else {
                System.out.println("Dinh danh Ma Nhan Vien: NV___.ViDu: NV001");
            }
            System.out.print("Moi nhap lai: ");
        }
    }

    public static String checkInputEmail() {
        while(true){
            String input = scanner.nextLine();
            if (input.contains("@gmail.com")) {
                return input;
            }
            System.out.print("Moi nhap lai: ");
        }
    }

    public static String checkMSQL() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if((input.matches("QL"+"[0-9]{3}")) && (Database.getDanhSachNhanVien().getByIdEmployee(input)==null)) {
                return input;
            } else {
                System.out.println("Dinh danh Ma Nhan Vien: QL___.ViDu: QL001");
            }
            System.out.print("Moi nhap lai: ");
        }
    }

    public static String checkMSP() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if ((input.matches("SP"+"[0-9]{3}"))&&(Database.getDanhSachSanPham().getByIdSanPham(input)==null)) {
                return input;
            } else {
                System.out.println("Định Danh Mã Sản Phẩm: SP___.Ví Dụ: SP001");
            }
            System.out.print("Mời Nhập Lại: ");
        }
    }

    public static String checkMKH() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if(input.matches("KH"+"[0-9]{3}") && (Database.getDanhSachKhachHang().getByIdCustomer(input)==null)) {
                return input;
            } else {
                System.out.println("Dinh danh Ma Khach Hang: KH___.ViDu: KH001");
            }
            System.out.print("Moi nhap lai: ");
        }
    }

    public static String checkMaKHTrongDanhSach() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if(input.matches("KH"+"[0-9]{3}") && (Database.getDanhSachKhachHang().getByIdCustomer(input)!=null)) {
                return input;
            } else {
                System.out.println("Thêm Thông Tin Khách Hàng Mới Vào Danh Sách.");
                Customer newKhachHang = new Customer();
                newKhachHang.input();
                Database.getDanhSachKhachHang().addCustomer(newKhachHang);
            }
        }
    }

    public static int checkInputInteger() {
        String n;
        while (true) {
            n = scanner.nextLine();
            if (n.matches("^\\-?\\d+$")) {
                return Integer.parseInt(n);
            } else {
                System.out.println(n + " Không Phải Số Tự Nhiên.");
            }
            System.out.print("Moi nhap lai: ");
        }
    }

    public static String inputEmpty() {
        String input = scanner.nextLine();
        while (input.trim().equals("")){
            System.out.println("Không được để trống. Vui lòng nhập lại: ");
            input = scanner.nextLine();
        }
        return input;
    }

    public static String checkMaNhaCungCap() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (Database.getDanhSachNCC().getByIdProvider(input) != null) {
                return input;
            } else {
                System.out.println("Nhập Thông Tin Nhà Cung Cấp Mới: ");
                Provider newProvider = new Provider();
                newProvider.input();
                Database.getDanhSachNCC().addProvider(newProvider);
                return newProvider.getMaNCC();
            }
        }
    }

    public static String checkMaNhaSanXuat() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (Database.getDanhSachNSX().findById(input) != null) {
                return input;
            } else {
                System.out.println("Nhập Thông Tin Nhà Sản Xuất Mới: ");
                Maker newMaker = new Maker();
                newMaker.input();
                Database.getDanhSachNSX().addMaker(newMaker);
                return newMaker.getMaNSX();
            }
        }
    }

    public static String checkMaLoaiSanPham() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (Database.getDanhSachLoaiSanPham().getById(input) != null) {
                return input;
            } else {
                System.out.println("Nhập Thông Tin Loại Sản Phẩm Mới: ");
                LoaiSanPham newLoaiSanPham = new LoaiSanPham();
                newLoaiSanPham.input();
                Database.getDanhSachLoaiSanPham().addLoaiSanPham(newLoaiSanPham);
                return newLoaiSanPham.getMaLoai();
            }
        }
    }

    public static String checkMaSP() {
        String input;
        while (true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if (input.matches("SP"+"[0-9]{3}")&&(Database.getDanhSachSanPham().getByIdSanPham(input)==null)) {
                return input;
            } else {
                System.out.println("Định Danh Mã Sản Phẩm:SP___   .Ví Dụ:SP001");
            }
            System.out.println("Mời Nhập Lại: ");
        }
    }

    public static String checkPhoneNumber() {
        String input;
        while(true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if (input.matches("^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$")){
                return input;
            } else {
                System.out.println("Ví Dụ: 0346575111");
            }
            System.out.print("Mời Nhập Lại: ");
        }
    }

    public static String checkMaKhachHangTrongDanhSanh() {
        String input;
        while (true) {
            input = scanner.nextLine();
            input = input.toUpperCase();
            if (Database.getDanhSachKhachHang().getByIdCustomer(input) != null) {
                return input;
            } else {
                System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
            }
            System.out.print("Mời Nhập Lại: ");
        }
    }
}
