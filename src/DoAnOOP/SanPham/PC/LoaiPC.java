package DoAnOOP.SanPham.PC;

import java.util.Scanner;

public class LoaiPC {
    static final Scanner scanner = new Scanner(System.in);
    private String tenLoai, ghiChu;
    private static String maLoai;
    public static String idMaLoai = maLoai;
    public static int id = 0;

    public LoaiPC() {
        id++;
    }

    public LoaiPC(String tenLoai, String ghiChu) {
        maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.ghiChu = ghiChu;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        LoaiPC.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void input() {
        System.out.print("Nhap ma loai PC: ");
        maLoai = scanner.nextLine();
        System.out.print("Nhap ten loai PC: ");
        tenLoai = scanner.nextLine();
        System.out.print("Nhap ghi chu(neu co): ");
        ghiChu = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-8s%-25s%-25s","Ma loai","Ten loai","Ghi chu");
        System.out.printf("%-8s%-25s%-25s",maLoai,tenLoai,ghiChu);
    }

    public String toString() {
        return String.format("%d, %s, %s",maLoai,tenLoai,ghiChu);
    }
}
