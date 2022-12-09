package DoAnOOP.People;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.Help.HoTro;
import DoAnOOP.Table;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachNhanVien extends ADanhSach {
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachNhanVien.bin";
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
        ArrayList<Employee> arrayListEmployee = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayListEmployee.add(employees[i]);
        }
        Table.createTable(arrayListEmployee);
    }

    public void menuQL() {
        String luachon;
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

    public void menuNV() {
        String luachon;
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

    public Employee getByIdEmployee(String idCanCheck) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(employees[i].getMaNV(), idCanCheck)) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.employees = ((DanhSachNhanVien)newDanhSach).employees;
    }
}
