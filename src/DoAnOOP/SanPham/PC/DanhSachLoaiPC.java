package DoAnOOP.SanPham.PC;

import java.util.Objects;
import java.util.Scanner;

public class DanhSachLoaiPC {
    static final Scanner scanner = new Scanner(System.in);
    private int length = LoaiPC.id;
    private LoaiPC[] arr = new LoaiPC[length];

    public void addLoaiPC(LoaiPC newLPC) {
        arr[length] = newLPC;
        length++;
        LoaiPC.id++;
    }

    public void set(LoaiPC a, int index, LoaiPC[] arr) {
        arr[index] = a;
    }

    public boolean check(String maLoaiPC) {
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(maLoaiPC, arr[i].getMaLoai())) {
                return true;
            }
        }
        return false;
    }

    public void removeLoaiPC(String index) {
        int temp=-1;
        LoaiPC newLPC = null;
        for (int i = 0;i<length;i++) {
            if(Objects.equals(arr[i].getMaLoai(), index)) {
                temp = i;
                newLPC = arr[i];
            }
        }
        if (temp!=-1 && newLPC != null) {
            LoaiPC newLoaiPC = null;
            for (int i = temp;i<length;i++) {
                set(newLoaiPC,i,arr);
            }
        }
        System.out.println("Khong co Id trong danh sach");
    }

    public void updateLoaiPC(String index) {
        int temp = -1;
        LoaiPC newLPC = null;
        for (int i = 0;i<length;i++) {
            if (Objects.equals(arr[i].getMaLoai(), index)) {
                temp = i;
                newLPC = arr[i];
            }
        }
        if (temp != -1 && newLPC != null) {
            LoaiPC newLoaiPC = null;
            newLoaiPC.input();
            set(newLoaiPC,temp,arr);
        }
        System.out.println("Khong co Id trong danh sach");
    }

    public void output() {
        System.out.println("Danh Sach Ma Loai PC.");
        for (int i = 0;i<length;i++) {
            arr[i].output();
        }
    }

    public LoaiPC getById(String id) {
        LoaiPC loaiPC = null;
        for (int i = 0;i<length;i++) {
            if (Objects.equals(arr[i].getMaLoai(), id)) {
                loaiPC = arr[i];
            }
        }
        return loaiPC;
    }
}
