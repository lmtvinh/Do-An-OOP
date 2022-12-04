package DoAnOOP.ThongTin;

import java.util.Objects;
import java.util.Scanner;

public class DanhSachNSX {
    static final Scanner scanner = new Scanner(System.in);
    private int length = Maker.id;
    private Maker[] makers = new Maker[length];

    public void addMaker(Maker newMaker) {
        makers[length] = newMaker;
        length++;
        Maker.id++;
    }

    public void set(Maker a, int index, Maker[] arr) {
        arr[index] = a;
    }

    public boolean check(String maNSX) {
        for (int i = 0; i < makers.length; i++) {
            if (Objects.equals(maNSX, makers[i].getMaNSX())) {
                return true;
            }
        }
        return false;
    }

    public void removeMaker(String index) {
        int temp = -1;
        Maker newMaker = null;
        for (int i = 0; i < length; i++) {
            if (makers[i].getMaNSX() == index) {
                temp = i;
                newMaker = makers[i];
            }
        }
        if (temp != -1 && newMaker != null) {
            Maker newMK = null;
            newMK.input();
            for (int i = temp; i < length; i++) {
                set(newMK, i, makers);
            }
        }
        System.out.println("Khong co Id trong danh sach");
    }
}
