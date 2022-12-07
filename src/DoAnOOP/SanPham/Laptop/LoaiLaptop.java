package DoAnOOP.SanPham.Laptop;

import java.util.Scanner;

public class LoaiLaptop {
    static final Scanner scanner = new Scanner(System.in);
    private String tenLoai, ghiChu;
    private static String maLoaiLaptop;
    public static String idMaLoai = maLoaiLaptop;
    public static int id = 0;

    public LoaiLaptop() {
        id++;
    }

    public LoaiLaptop(String tenLoai, String ghiChu) {
        this.tenLoai = tenLoai;
        this.ghiChu = ghiChu;
    }

    public String getMaLoai() {
        return maLoaiLaptop;
    }

    public void setMaLoai(String maLoaiLaptop) {
        this.maLoaiLaptop = maLoaiLaptop;
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
        System.out.print("Nhap Ma loai Laptop: ");
        maLoaiLaptop = scanner.nextLine();
        System.out.print("Nhap Ten loai Laptop: ");
        tenLoai = scanner.nextLine();
        System.out.print("Nhap Ghi chu(neu co): ");
        ghiChu = scanner.nextLine();
    }
}
