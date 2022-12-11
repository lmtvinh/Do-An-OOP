package DoAnOOP.People;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Help.HoTro;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachKhachHang extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = 4654646546l;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachKhachHang.bin";

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

    public void output() {
        System.out.printf("%-8s%-25s%-15s%-12s\n", "Ma Khach Hang", "Ten Khach Hang", "Nhom Khach Hang");
        for (int i = 0; i < length; i++) {
            customers[i].output();
        }
    }

    public void menu() {
        String luachon;
        do {
            HoTro.clearConsole();
            System.out.println("-------------------Menu--------------------");
            System.out.println("1.Them Khach Hang vao Danh sach Khach Hang.");
            System.out.println("2.Sua Danh Sach Khach Hang.");
            System.out.println("3.Xoa Danh Sach Khach Hang.");
            System.out.println("4.Xem Danh Sach Khach Hang.");
            System.out.println("0.Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    Customer a = new Customer();
                    customers = new Customer[length];
                    System.out.println("Nhap thong tin cua Khach Hang.");
                    a.input();
                    addCustomer(a);
                }
                case "2" -> {
                    System.out.println("Danh sach Khach Hang.");
                    output();
                    System.out.print("Nhap Ma Khach Hang muon sua: ");
                    String index = scanner.nextLine();
                    updateCustomer(index);
                }
                case "3" -> {
                    removeCustomer();
                }
                case "4" -> {
                    output();
                }
                case "0" -> {
                    System.out.println("Thoat");
                }
                default -> {
                    System.out.println("Lua chon cua ban khong phu hop");
                }
            }
        } while (luachon != "0");
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
    }
}