package DoAnOOP.SanPham.PC;

import java.util.Objects;
import java.util.Scanner;

public class DanhSachLoaiPC {
    static final Scanner scanner = new Scanner(System.in);
    private int length = LoaiPC.id;
    private LoaiPC[] arrLPC = new LoaiPC[length];

    public void addLoaiPC(LoaiPC newLPC) {
        arrLPC[length] = newLPC;
        length++;
        LoaiPC.id++;
    }

    public void set(LoaiPC a, int index, LoaiPC[] arr) {
        arr[index] = a;
    }

    public boolean check(String maLoaiPC) {
        for (int i = 0; i < arrLPC.length; i++) {
            if (Objects.equals(maLoaiPC, arrLPC[i].getMaLoai())) {
                return true;
            }
        }
        return false;
    }

    public void removeLoaiPC(String index) {
        int temp=-1;
        LoaiPC newLPC = null;
        for (int i = 0;i<length;i++) {
            if(Objects.equals(arrLPC[i].getMaLoai(), index)) {
                temp = i;
                newLPC = arrLPC[i];
            }
        }
        if (temp!=-1 && newLPC != null) {
            LoaiPC newLoaiPC = null;
            for (int i = temp;i<length;i++) {
                set(newLoaiPC,i,arrLPC);
            }
        } else {
            System.out.println("Khong co Id trong danh sach");
        }
    }

    public void updateLoaiPC(String index) {
        int temp = -1;
        LoaiPC newLPC = null;
        for (int i = 0;i<length;i++) {
            if (Objects.equals(arrLPC[i].getMaLoai(), index)) {
                temp = i;
                newLPC = arrLPC[i];
            }
        }
        if (temp != -1 && newLPC != null) {
            LoaiPC newLoaiPC = null;
            newLoaiPC.input();
            set(newLoaiPC,temp,arrLPC);
        }
        System.out.println("Khong co Id trong danh sach");
    }

    public void output() {
        System.out.println("Danh Sach Ma Loai PC.");
        for (int i = 0;i<length;i++) {
            arrLPC[i].output();
        }
    }

    public LoaiPC getByIdLoaiPC(String id) {
        LoaiPC loaiPC = null;
        for (int i = 0;i<length;i++) {
            if (Objects.equals(arrLPC[i].getMaLoai(), id)) {
                loaiPC = arrLPC[i];
            }
        }
        return loaiPC;
    }
}
