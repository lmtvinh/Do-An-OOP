package DoAnOOP.ThongTin;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DanhSachNCC {
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
}
