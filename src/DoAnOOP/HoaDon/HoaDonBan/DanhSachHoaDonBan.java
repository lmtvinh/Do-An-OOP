package DoAnOOP.HoaDon.HoaDonBan;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoaDonBan {
    final static Scanner scanner = new Scanner(System.in);
    private ArrayList<HoaDonBan> hoaDonBans;

    public DanhSachHoaDonBan() {
        hoaDonBans = new ArrayList<HoaDonBan>();
    }

    public void addHoaDonBan(HoaDonBan a) {
        hoaDonBans.add(a);
    }

    public void setHoaDonBan(String maHoaDonCanSua, HoaDonBan newHoaDonBan) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (hoaDonBans.get(i).getMaHoaDon() == maHoaDonCanSua) {
                hoaDonBans.set(i, newHoaDonBan);
            }
        }
    }

    public void removeHoaDonBan(String maHoaDonCanXoa) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (hoaDonBans.get(i).getMaHoaDon() == maHoaDonCanXoa) {
                hoaDonBans.remove(i);
            }
        }
    }

    public void findByMaHoaDonBan(String maHoaDonBanCanTim) {
        for (int i = 0; i < hoaDonBans.size(); i++) {
            if (hoaDonBans.get(i).getMaHoaDon() == maHoaDonBanCanTim) {
                // hoaDonBans.get(i).output();
            }
        }
    }
}
