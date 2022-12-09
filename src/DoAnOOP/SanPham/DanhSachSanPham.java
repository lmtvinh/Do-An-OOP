package DoAnOOP.SanPham;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachSanPham {
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<SanPham> arrayList ;
    public DanhSachSanPham() {
        arrayList = new ArrayList<SanPham>();
    }

    public void addSanPham(SanPham newSanPham) {
        arrayList.add(newSanPham);
    }

    public void setSanPham(String maSanPham, SanPham newSanPham) {
        for(int i = 0; i < arrayList.size(); i++ ){
            if(Objects.equals(arrayList.get(i).getMaSanPham(), maSanPham)) {
                arrayList.set(i,newSanPham);
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH.");
    }

    public void removeSanPham(String maSanPham) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i).getMaSanPham(), maSanPham)) {
                arrayList.remove(arrayList.get(i));
                return;
            }
        }
        System.err.println("KHONG CO ID TRONG DANH SACH.");
    }

    public SanPham getByIdSanPham(String maSanPham) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i).getMaSanPham(), maSanPham)) {
                return arrayList.get(i);
            }
        }
        return null;
    }

//    public void menu() {
//        String luachon;
//        do {
//            System.out.println("MENU SAN PHAM.");
//        }
//    }
}
