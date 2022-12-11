package DoAnOOP.View;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.People.Employee;

public class Main {
    public static Employee nguoiDung = null;
    private static boolean login(){
        System.out.println("\n\n\t\tĐĂNG NHẬP");
        System.out.print("Nhập Mã Nhân Viên: ");
        String maNhanVien = Check.inputEmpty().trim();
        System.out.print("Nhập Mật Khẩu: ");
        String matKhau = Check.inputEmpty().trim();
        Employee user = Database.getDanhSachNhanVien().getByIdEmployee(maNhanVien);
        System.out.println(Database.getDanhSachNhanVien().getByIdEmployee(maNhanVien));
        if (user == null) {
            System.out.println("\n\n\t\tMã Nhân Viên Không Tồn Tại.");
            return false;
        }
        if (!user.getMatKhau().equals(matKhau)) {
            System.out.println("Mật Khẩu Không Chính Xác");
            return false;
        }
        nguoiDung = user;
        System.out.println("ĐĂNG NHẬP THÀNH CÔNG.");
        System.out.println("Xin Chào " + nguoiDung.getFullname());
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            while (!login()) {
            }
            if(nguoiDung.getMaNV().equals("QL")) {
                QuanLy.run();
            } else {
                NhanVien.run();
            }
        }
    }
}
