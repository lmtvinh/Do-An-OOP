package DoAnOOP.People;

import DoAnOOP.Help.HoTro;

import java.util.Objects;
import java.util.Scanner;

public class DanhSachNhanVien {
    static final Scanner scanner = new Scanner(System.in);
    private Employee[] employees;
    private int length;
    public DanhSachNhanVien() {
        employees = null;
        length = 0;
    }
    public DanhSachNhanVien(int length) {
        this.length = length;
        employees = new Employee[length];
    }

    public Employee get(int index) {
        return employees[index];
    }

    public void set(Employee a, int index, Employee[] arr) {
        arr[index] = a;
    }

    public void addEmployee(Employee a) {
        if(length == 0) {
            employees = new Employee[1];
            employees[0] = a;
            length++;
        } else {
            Employee[] temp = new Employee[length + 1];
            for (int i = 0; i < length; i++) {
                temp[i] = employees[i];
            }
            temp[length] = a;
            employees = temp;
            length++;
        }
    }

    public void remove(int index, Employee a) {
        if (index < 0 || index >= length) return;
        for (int i = index; i < length; i++) {
            set(a,index,employees);
        }
    }

    public void removeEmployee() {
        System.out.print("\nNhap ma nhan vien: ");
        String check = scanner.nextLine();
        for (int i =0;i < length; i++){
            boolean result = get(i).getMaNV().equalsIgnoreCase(check);
            if(result) {
                remove(i,get(i));
            }
        }
    }

    public void updateEmployee(String index) {
        int temp = -1;
        Employee newEmployee = null;
        for (int i = 0; i < length; i++) {
            if (employees[i].getMaNV() == index) {
                temp = i;
                newEmployee = employees[i];
            }
        }
        if (temp != -1 && newEmployee != null) {
            Employee newEmployee1 = null;
            newEmployee1.input();
            set(newEmployee1, temp, employees);
        }
        System.out.println("Khong co ID trong danh sach");
    }

    public void output() {
        System.out.printf("%-15s%-25s%-15s%-12s%-12s\n","Ma Nhan Vien","Ten Nhan Vien","Luong Co Ban","So Gio Lam","Luong");
        for (int i = 0; i < length; i++) {
            employees[i].output();
        }
    }

    public void menu(String user, String password) {
        String luachon;
        if (user.equals("admin") && password.equals("admin")) {
            do {
                System.out.println("---------------Menu-------------");
                System.out.println("1.Them vao Danh sach Nhan Vien.");
                System.out.println("2.Sua Danh sach Nhan Vien.");
                System.out.println("3.Xoa Danh sach Nhan Vien.");
                System.out.println("4.Xem Danh sach Nhan Vien.");
                System.out.println("0.Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                luachon = scanner.nextLine();
                switch (luachon) {
                    case "1" -> {
                        HoTro.clearConsole();
                        employees = new Employee[length];
                        System.out.println("Nhap Thong tin cua Nhan vien can them.");
                        Employee a = new Employee();
                        a.input();
                        addEmployee(a);
                    }
                    case "2" -> {
                        HoTro.clearConsole();
                        System.out.println("Danh sach Nhan vien hien tai.");
                        output();
                        System.out.println("Nhap ma so Nhan vien can sua: ");
                        String index = scanner.nextLine();
                        updateEmployee(index);
                    }
                    case "3" -> {
                        HoTro.clearConsole();
                        removeEmployee();
                    }
                    case "4" -> {
                        HoTro.clearConsole();
                        System.out.println("Danh sach Nhan vien hien tai.");
                        output();
                    }
                    case "0" -> {
                        HoTro.clearConsole();
                        System.out.println("THOAT");
                    }
                    default -> {
                        HoTro.clearConsole();
                        System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
                    }
                }
                break;
            } while (luachon != "0");
        }
        else {
            do {
                System.out.println("---------------Menu-------------");
                System.out.println("1.Xem danh sach Nhan Vien.");
                System.out.println("0.Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                luachon = scanner.nextLine();
                switch (Integer.parseInt(luachon)) {
                    case 1 -> {
                        HoTro.clearConsole();
                        System.out.println("Danh sach Nhan Vien cua Cua Hang.");
                        output();
                    } case 0 -> {
                        HoTro.clearConsole();
                        System.out.println("Thoat");
                    }default ->  {
                        System.err.println("Lua chon cua ban khong phu hop.");
                    }
                }
            } while (luachon != "0");
        }
        System.out.println("End");
    }

    public Employee getByIdEmployee(String idCanCheck) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(employees[i].getMaNV(), idCanCheck)) {
                return employees[i];
            }
        }
        return null;
    }
}
