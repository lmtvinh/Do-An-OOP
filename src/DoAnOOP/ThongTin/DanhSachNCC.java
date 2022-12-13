package DoAnOOP.ThongTin;

import DoAnOOP.File.ADanhSach;
import DoAnOOP.KhoDuLieu.Database;
import DoAnOOP.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachNCC extends ADanhSach implements Serializable {
    @Serial
    private static long serialVersionUID = 45465465L;
    public final static String DUONG_DAN_LUU_FILE = "D:\\Do An OOP\\DoAnOOP\\DanhSachNCC.bin";
    final static Scanner scanner = new Scanner(System.in);
    ArrayList<Provider> providers;

    public DanhSachNCC() {
        providers = new ArrayList<Provider>();
    }

    public void addProvider(Provider newProvider) {
        if (Database.getDanhSachNCC().getByIdProvider(newProvider.getMaNCC()) == null) {
            providers.add(newProvider);
        } else {
            System.out.println("ID HIỆN CÓ TRONG DANH SÁCH.");
        }
    }

    public void setProviders(String maCanSua, Provider newProvider) {
        for (int i = 0;i < providers.size(); i++) {
            if (Objects.equals(providers.get(i).getMaNCC(), maCanSua)) {
                providers.set(i, newProvider);
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public void removeProvider(String maCanXoa) {
        for (int i = 0; i < providers.size(); i++) {
            if (Objects.equals(providers.get(i).getMaNCC(), maCanXoa)) {
                providers.remove(i);
                return;
            }
        }
        System.out.println("ID KHÔNG CÓ TRONG DANH SÁCH.");
    }

    public Provider getByIdProvider(String maCanCheck) {
        for (int i = 0; i < providers.size(); i++) {
            if (Objects.equals(providers.get(i).getMaNCC(), maCanCheck)) {
                return providers.get(i);
            }
        }
        return null;
    }

    @Override
    public void copyFrom(ADanhSach newDanhSach) {
        this.providers = ((DanhSachNCC)newDanhSach).providers;
    }

    public void getAll() {
        Table.printTable(providers);
    }
}
