package DoAnOOP.ThongTin;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
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
        if (Database.getDanhSachNSX().findById(newMaker.getMaNSX()) == null) {
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
        } else {
            System.out.println("ID Hiện Tại Có Trong Danh Sách.");
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
            if (Objects.equals(makers[i].getMaNSX(), index)) {
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

    public void getAll() {
        ArrayList<Maker> arrayListMaker = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayListMaker.add(makers[i]);
        }
        Table.createTable(arrayListMaker);
        Table.printTable(arrayListMaker);
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.makers = ((DanhSachNSX)newDanhSach).makers;
    }

    public void menuNSX() {
        String luachon;
        do {
            System.out.println("\n\n\t\tMENU NHÀ SẢN XUẤT.");
            System.out.println("1.Xem Danh Sách Thông Tin Nhà Sản Xuất.");
            System.out.println("2.Thêm Thông Tin Nhà Sản Xuất Vào Danh Sách.");
            System.out.println("3.Sửa Thông Tin Nhà Sản Xuất Trong Danh Sách.");
            System.out.println("4.Xóa Thông Tin Nhà Sản Xuất Trong Danh Sách.");
            System.out.println("0.Thoát.");
            System.out.println("Nhập lựa chọn của bạn: ");
            luachon = scanner.nextLine();
            switch (luachon) {
                case "1" -> {
                    System.out.println("DANH SÁCH THÔNG TIN NHÀ SẢN XUẤT.");
                    getAll();
                }
                case "2" -> {
                    System.out.print("Nhập Thông Nhà Sản Xuất Muốn Thêm Vào Danh Sách Thông Tin.");
                    Maker newMaker = new Maker();
                    newMaker.input();
                    addMaker(newMaker);
                }
                case "3" -> {
                    System.out.println("");
                }
            }
        } while (luachon != "0");
    }
}
