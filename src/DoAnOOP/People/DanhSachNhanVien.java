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

public class DanhSachNhanVien extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersionUID = 456464897L;
    public final static String DUONG_DAN_LUU_FILE = HoTro.duongDanTuongDoi + "DanhSachNhanVien.bin";
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
        if (Database.getDanhSachNhanVien().getByIdEmployee(a.getMaNV()) == null) {
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
        } else {
            System.out.print("ID BẠN NHẬP ĐÃ CÓ TRONG DANH SÁCH.");
        }
    }

    public void remove(int index, Employee a) {
        if (index < 0 || index >= length) return;
        for (int i = index; i < length; i++) {
            set(a,index,employees);
        }
    }

    public void removeEmployee() {
        System.out.print("\nNhập Mã Nhân Viên Bạn Cần Xóa Khỏi Danh Sách: ");
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
//        Table.createTable(arrayListEmployee);
        Table.printTable(arrayListEmployee);
    }

    public void menuQL() {
        String luachon;
        do {
            System.out.println("\t\t\n\nMenu Quản Lí Danh Sách Nhân Viên Của Cửa Hàng");
            System.out.println("1.Thêm Nhân Viên Vào Danh Sách.");
            System.out.println("2.Sửa Danh Sách Nhân Viên.");
            System.out.println("3.Xóa Danh Sách Nhân Viên.");
            System.out.println("4.Xem Danh Sách Nhân Viên.");
            System.out.println("5.Tìm Kiếm Nhân Viên Theo Mã.");
            System.out.println("6.Tìm Kiếm Nhân Viên Theo Tên.");
            System.out.println("0.Thoát");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    HoTro.clearConsole();
                    employees = new Employee[length];
                    System.out.println("Nhập Thông Tin Của Nhân Viên Cần Thêm Vào Danh Sách.");
                    Employee a = new Employee();
                    a.input();
                    addEmployee(a);
                }
                case "2" -> {
                    HoTro.clearConsole();
                    System.out.println("Danh Sách Nhân Viên.");
                    output();
                    System.out.println("Nhập Mã Số Nhân Viên Cần Sửa: ");
                    String index = scanner.nextLine();
                    updateEmployee(index);
                }
                case "3" -> {
                    HoTro.clearConsole();
                    removeEmployee();
                }
                case "4" -> {
                    HoTro.clearConsole();
                    System.out.println("Danh Sách Nhân Viên.");
                    output();
                }
                case "5" -> {
                    System.out.println("Danh Sách Nhân Viên.");
                    output();
                    System.out.println("Nhập Mã Nhân Viên Mà Bạn Muốn Xem Thông Tin: ");
                    String maNhanVien = scanner.nextLine();
                    findById(maNhanVien);
                }
                case "6" -> {
                    System.out.println("Danh Sách Nhân Viên.");
                    output();
                    System.out.println("Nhập Tên Nhân Viên Mà Bạn Muốn Xem Thông Tin: ");
                    String tenNhanVien = scanner.nextLine();
                    findByName(tenNhanVien);
                }
                case "0" -> {
                    HoTro.clearConsole();
                    System.out.println("\t\tTHOÁT");
                }
                default -> {
                    HoTro.clearConsole();
                    System.err.println("\t\tLỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP.");
                }
            }
            break;
        } while (!Objects.equals(luachon, "0"));
    }

    public void menuNV() {
        String luachon;
        do {
            System.out.println("\t\t\n\nMenu Quản Lí Danh Sách Nhân Viên Của Cửa Hàng");
            System.out.println("1.Xem Danh Sách Nhân Viên.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập Lựa Chọn Của Bạn: ");
            luachon = scanner.nextLine();
            switch (Integer.parseInt(luachon)) {
                case 1 -> {
                    HoTro.clearConsole();
                    System.out.println("Danh Sách Nhân Viên Của Cửa Hàng.");
                    output();
                } case 0 -> {
                    HoTro.clearConsole();
                    System.out.println("\t\tThoát");
                }default ->  {
                    System.err.println("\t\tLựa Chọn Của Bạn Không Phù Hợp.");
                }
            }
        } while (luachon == "0");
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
        this.length = ((DanhSachNhanVien)newDanhSach).length;
    }

    public void findById(String idCanTim) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(employees[i].getMaNV(), idCanTim)) {
                System.out.println("THÔNG TIN NHÂN VIÊN MÀ BẠN MUỐN TÌM.");
                employees[i].output();
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public void findByName(String nameCanCheck) {
        for (int i = 0; i < length; i++) {
            if (employees[i].getFullname().toLowerCase().contains(nameCanCheck.toLowerCase())) {
                System.out.println("THÔNG TIN NHÂN VIÊN MÀ BẠN MUỐN TÌM.");
                employees[i].output();
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }
}
