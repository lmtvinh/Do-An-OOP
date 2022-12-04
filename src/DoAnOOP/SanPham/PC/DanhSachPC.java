package DoAnOOP.SanPham.PC;

import java.util.Scanner;

public class DanhSachPC {
    final static Scanner scanner = new Scanner(System.in);
    private PC[] arrPC;
    private int length;
    public DanhSachPC() {
        arrPC = null;
        length = 0;
    }

    public DanhSachPC(int length) {
        this.length = length;
        arrPC = new PC[length];
    }

    public PC get(int index) {
        return arrPC[index];
    }

    public void set(PC a, int index, PC[] arr) {
        arr[index] = a;
    }

    public void addPC(PC a) {
        if (length == 0) {
            arrPC = new PC[1];
            arrPC[0] = a;
            length++;
        } else {
            PC[] temp = new PC[length + 1];
            for (int i = 0; i < length; i++) {
                temp[i] = arrPC[i];
            }
            temp[length] = a;
            arrPC = temp;
            length++;
        }
    }

    public void remove(int index, PC a) {
        if (index < 0 || index > length) return;
        for (int i = index; i < length; i++) {
            set(a,index,arrPC);
        }
    }

    public void removePC() {
        System.out.print("Nhap ma PC: ");
        String check = scanner.nextLine();
        for (int i = 0;i < length; i++) {
            boolean result = get(i).getMaPC().equalsIgnoreCase(check);
            if(result) {
                remove(i,get(i));
            }
        }
    }

    public void updatePC(String indexMaPC) {
        int temp = -1;
        PC newPC = null;
        for (int i = 0; i < length; i++) {
            if (arrPC[i].getMaPC().equals(indexMaPC)) {
                temp = i;
                newPC = arrPC[i];
            }
        }
        if (temp != -1 < )
    }
}
