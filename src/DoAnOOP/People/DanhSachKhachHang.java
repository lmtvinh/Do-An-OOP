package DoAnOOP.People;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Help.HoTro;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachKhachHang extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersionUID = 4654646546L;
    public final static String DUONG_DAN_LUU_FILE = HoTro.duongDanTuongDoi + "DanhSachKhachHang.bin";

    static final Scanner scanner = new Scanner(System.in);
    private Customer[] customers;
    private int length;

    public DanhSachKhachHang() {
        customers = null;
        length = 0;
    }

    public DanhSachKhachHang(int length) {
        this.length = length;
        customers = new Customer[length];
    }

    public Customer get(int index) {
        return customers[index];
    }

    public void set(Customer a, int index, Customer[] arr) {
        arr[index] = a;
    }

    public void addCustomer(Customer a) {
        if (Database.getDanhSachKhachHang().getByIdCustomer(a.getMaKhachHang()) == null) {
            if (length == 0) {
                customers = new Customer[1];
                customers[0] = a;
                length++;
            } else {
                Customer[] temp = new Customer[length + 1];
                for (int i = 0; i < length; i++) {
                    temp[i] = customers[i];
                }
                temp[length] = a;
                customers = temp;
                length++;
            }
        } else {
            System.out.println("ID BẠN NHẬP HIỆN TẠI ĐÃ CÓ TRONG DANH SÁCH.");
        }
    }

    public void remove(int index, Customer a) {
        if (index < 0 || index > length)
            return;
        for (int i = index; i < length; i++) {
            set(a, index, customers);
        }
    }

    public void removeCustomer() {
        System.out.print("Nhap ma khach hang: ");
        String check = scanner.nextLine();
        for (int i = 0; i < length; i++) {
            boolean result = get(i).getMaKhachHang().equalsIgnoreCase(check);
            if (result) {
                remove(i, get(i));
            }
        }
    }

    public void updateCustomer(String index) {
        int temp = -1;
        Customer newCustomer = null;
        for (int i = 0; i < length; i++) {
            if (customers[i].getMaKhachHang().equals(index)) {
                temp = i;
                newCustomer = customers[i];
            }
        }
        if (temp != -1 && newCustomer != null) {
            Customer newCustomer1 = null;
            newCustomer1.input();
            set(newCustomer1, temp, customers);
        } else {
            System.out.println("Khong co ID trong danh sach.");
        }
    }

    public void getAll() {
        ArrayList<Customer> arrayListDSKH = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayListDSKH.add(customers[i]);
        }
        Table.createTable(arrayListDSKH);
        Table.printTable(arrayListDSKH);
    }

    public void findById(String idCanCheck) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(customers[i].getMaKhachHang(), idCanCheck)) {
                System.out.println("THÔNG TIN KHÁCH HÀNG BẠN MUỐN TÌM KIẾM.");
                customers[i].output();
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public void findByName(String nameCanCheck) {
        for (int i = 0; i < length; i++) {
            if (customers[i].getFullname().toLowerCase().contains(nameCanCheck.toLowerCase())) {
                System.out.println("THÔNG TIN KHÁCH HÀNG BẠN MUỐN TÌM KIẾM.");
                customers[i].output();
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public void menu() {
        String luachon;
        do {
            HoTro.clearConsole();
            System.out.println("\n\n\t\tMENU DANH SÁCH KHÁCH HÀNG.");
            System.out.println("1.Thêm Khách Hàng Vào Danh Sách Khách Hàng.");
            System.out.println("2.Sửa Thông Tin Khách Hàng Trong Danh Sách Khách Hàng.");
            System.out.println("3.Xóa Thông Tin Khách Hàng Trong Danh Sách Khách Hàng.");
            System.out.println("4.Xem Danh Sách Khách Hàng.");
            System.out.println("5.Tìm Kiếm Thông Tin Khách Hàng Theo Mã.");
            System.out.println("6.Tìm Kiếm Thông Tin Khách Hàng Theo Tên.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    Customer a = new Customer();
                    customers = new Customer[length];
                    System.out.println("Nhập Thông Tin Của Khách Hàng Mà Bạn Muốn Thêm Vào Danh Sách.");
                    a.input();
                    addCustomer(a);
                }
                case "2" -> {
                    System.out.println("Danh Sách Khách Hàng.");
                    getAll();
                    System.out.print("Nhập Mã Khách Hàng Muốn Thay Đổi Thông Tin: ");
                    String index = scanner.nextLine();
                    updateCustomer(index);
                }
                case "3" -> {
                    System.out.println("Danh Sách Khách Hàng.");
                    getAll();
                    System.out.println("Xóa Thông Tin Khách Hàng Ra Khỏi Danh Sách.");
                    removeCustomer();
                }
                case "4" -> {
                    System.out.println("Danh Sách Khách Hàng.");
                    getAll();
                }
                case "5" -> {
                    System.out.print("Nhập Mã Khách Hàng Bạn Muốn Xem Thông Tin: ");
                    String maKhachHang = scanner.nextLine();
                    findById(maKhachHang);
                }
                case "6" -> {
                    System.out.print("Nhập Tên Khách Hàng Bạn Muốn Tìm Kiếm: ");
                    String nameKhachHang = scanner.nextLine();
                    findByName(nameKhachHang);
                }
                case "0" -> {
                    System.out.println("\t\tTHOÁT.");
                }
                default -> {
                    System.err.println("\t\tLỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
        } while (luachon == "0");
    }

//    public static void main(String[] args) {
//        DanhSachKhachHang danhSachKhachHang = new DanhSachKhachHang();
//        danhSachKhachHang.menu("admin", "admin");
//    }

    public Customer getByIdCustomer(String idCanCheck) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(customers[i].getMaKhachHang(), idCanCheck)) {
                return customers[i];
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.customers = ((DanhSachKhachHang)newDanhSach).customers;
        this.length = ((DanhSachKhachHang)newDanhSach).length;
    }
}