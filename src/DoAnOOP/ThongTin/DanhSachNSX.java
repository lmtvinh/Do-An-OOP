package DoAnOOP.ThongTin;

import DoAnOOP.File.ADanhSach;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachNSX extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersion = 555641313155L;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachNSX.bin";
    static final Scanner scanner = new Scanner(System.in);
    private int length = Maker.id;
    private Maker[] makers = new Maker[length];



    public void addMaker(Maker newMaker) {
        if(length == 0) {
            makers = new Maker[1];
            makers[0] = newMaker;
            length++;
        } else {
            Maker[] temp = new Maker[length + 1];
            for (int i = 0; i < length; i++) {
                temp[i] = makers[i];
            }
            temp[length] = newMaker;
            makers = temp;
            length++;
        }
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

    public Maker findById(String idCanTim) {
        for (int i = 0;i < length; i++) {
            if (Objects.equals(makers[i].getMaNSX(), idCanTim)) {
                return makers[i];
            }
        }
        return null;
    }


    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.makers = ((DanhSachNSX)newDanhSach).makers;
    }
}
