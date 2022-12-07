package DoAnOOP.SanPham.Laptop;

import java.util.Objects;
import java.util.Scanner;

public class DanhSachLoaiLaptop {
    static final Scanner scanner = new Scanner(System.in);
    private int length = LoaiLaptop.id;
    private LoaiLaptop[] arrLoaiLaptop = new LoaiLaptop[length];

    public void addLoaiLaptop(LoaiLaptop newLoaiLaptop) {
        arrLoaiLaptop[length] = newLoaiLaptop;
        length++;
        LoaiLaptop.id++;
    }

    public void set(LoaiLaptop a, int index, LoaiLaptop[] arr) {
        arr[index] = a;
    }

    public boolean check(String maLoaiLaptop) {
        for (int i = 0; i < arrLoaiLaptop.length; i++) {
            if (Objects.equals(maLoaiLaptop, arrLoaiLaptop[i].getMaLoai())) {
                return true;
            }
        }
        return false;
    }

    public void removeLoaiLaptop(String indexMaLoaiLaptop) {
        int temp =-1;
        LoaiLaptop newLL = null;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLoaiLaptop[i].getMaLoai(), indexMaLoaiLaptop)) {
                temp = i;
                newLL = arrLoaiLaptop[i];
            }
        }
        if (temp != -1 && newLL != null) {
            LoaiLaptop newLoaiLaptop = null;
            for (int i = temp; i < length; i++) {
                set(newLoaiLaptop,i,arrLoaiLaptop);
            }
        } else {
            System.out.println("Khong co Id trong danh sach");
        }
    }

    public void updateLoaiLaptop(String indexMaLoaiLaptop) {
        int temp =-1;
        LoaiLaptop newLL = null;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLoaiLaptop[i].getMaLoai(), indexMaLoaiLaptop)) {
                temp = i;
                newLL = arrLoaiLaptop[i];
            }
        }
        if (temp != -1 && newLL != null) {
            LoaiLaptop newLoaiLaptop = null;
            newLoaiLaptop.input();
            for (int i = temp; i < length; i++) {
                set(newLoaiLaptop,i,arrLoaiLaptop);
            }
        } else {
            System.out.println("Khong co Id trong danh sach");
        }
    }

//    public void output() {
//        System.out.println("Danh Sach Ma Loai Laptop.");
//        for (int i = 0; i < length; i++) {
//            arrLoaiLaptop[i].output();
//        }
//    }

    public LoaiLaptop getByIdLoaiLaptop(String id) {
        LoaiLaptop loaiLaptop = null;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLoaiLaptop[i].getMaLoai(), id)) {
                loaiLaptop = arrLoaiLaptop[i];
            }
        }
        return loaiLaptop;
    }
}
