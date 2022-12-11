package DoAnOOP.ThongTin;

import DoAnOOP.File.ADanhSach;

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
        providers.add(newProvider);
    }

    public void setProviders(String maCanSua, Provider newProvider) {
        for (int i = 0;i < providers.size(); i++) {
            if (Objects.equals(providers.get(i).getMaNCC(), maCanSua)) {
                providers.set(i, newProvider);
            }
        }
    }

    public void removeProvider(String maCanXoa) {
        for (int i = 0; i < providers.size(); i++) {
            if (Objects.equals(providers.get(i).getMaNCC(), maCanXoa)) {
                providers.remove(i);
            }
        }
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
}
