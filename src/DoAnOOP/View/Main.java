package DoAnOOP.View;

import DoAnOOP.Help.Check;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.People.Employee;

public class Main {
    public static Employee nguoiDung = null;
    private static boolean login(){
        System.out.println("\n\n\t\t DANG NHAP");
        System.out.print("Nhap ma nhan vien: ");
        String maNhanVien = Check.inputEmpty().trim();
        System.out.print("Nhap mat khau: ");
        String matKhau = Check.inputEmpty().trim();
        Employee user = Database.getDanhSachNhanVien().getByIdEmployee(maNhanVien);
        if (user == null) {
            System.out.println("Ma nhan vien khong ton tai");
            return false;
        }
        if (!user.getMatKhau().equals(matKhau)) {
            System.out.println("Mat khau khong dung");
            return false;
        }
        nguoiDung = user;
        System.out.println("Dang nhap thanh cong.");
        System.out.println("Xin chao " + nguoiDung.getFullname());
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
