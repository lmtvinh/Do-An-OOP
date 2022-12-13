package DoAnOOP.View;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.People.Customer;
import DoAnOOP.People.Employee;

import javax.xml.crypto.Data;

public class Main {
    public static Employee nguoiDung = null;
    public static Customer khachHang = null;
    private static boolean loginNV(){
        System.out.println("\n\n\t\tĐĂNG NHẬP");
        System.out.print("Nhập Mã Nhân Viên: ");
        String maNhanVien = Check.inputEmpty().trim();
        System.out.print("Nhập Mật Khẩu: ");
        String matKhau = Check.inputEmpty().trim();
        Employee user = Database.getDanhSachNhanVien().getByIdEmployee(maNhanVien);
        if (user == null) {
            System.out.println("\n\n\t\tMã Nhân Viên Không Tồn Tại.");
            return false;
        }
        if (!user.getMatKhau().equals(matKhau)) {
            System.out.println("Mật Khẩu Không Chính Xác.");
            return false;
        }
        nguoiDung = user;
        System.out.println("ĐĂNG NHẬP THÀNH CÔNG.");
        System.out.println("Xin Chào " + nguoiDung.getFullname());
        return true;
    }

    private static boolean loginKH() {
        System.out.println("\n\n\t\tĐĂNG NHẬP");
        System.out.print("Nhập Mã Khách Hàn: ");
        String maKhachHang = Check.inputEmpty().trim();
        System.out.print("Nhập Mật Khẩu: ");
        String matKhau = Check.inputEmpty().trim();
        Customer user = Database.getDanhSachKhachHang().getByIdCustomer(maKhachHang);
        if (user == null) {
            System.out.println("\n\n\t\tMã Khách Hàng Không Tồn Tại.");
            return false;
        }
        if (!user.getMatKhau().equals(matKhau)) {
            System.out.println("Mật Khẩu Không Chính Xác.");
            return false;
        }
        khachHang = user;
        System.out.println("ĐĂNG NHẬP THÀNH CÔNG.");
        System.out.println("Xin Chào " + khachHang.getFullname());
        return true;
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                Database.luuNhanh();
            }
        }));
        String yourChoice;
        do {
            System.out.println("\n\n\t\tMENU ĐĂNG NHẬP.");
            System.out.println("1.Nhân Viên.");
            System.out.println("2.Khách Hàng.");
            System.out.println("0.Thoát");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            yourChoice = Check.inputEmpty().trim();
            switch (yourChoice) {
                case "1" -> {
                    while (true) {
                        while (!loginNV()) {
                        }
                        if(nguoiDung.getMaNV().equals("QL")) {
                            QuanLy.run();
                        } else {
                            NhanVien.run();
                        }
                    }
                }
                case "2" -> {
                    while(true) {
                        while (!loginKH()){
                            KhachHang.run();
                        }
                    }
                }
            }
        } while (yourChoice == "0");
    }
}
