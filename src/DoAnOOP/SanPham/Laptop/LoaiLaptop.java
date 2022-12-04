package DoAnOOP.SanPham.Laptop;

import java.util.Scanner;

public class LoaiLaptop {
    static final Scanner scanner = new Scanner(System.in);
    private String maLoai, tenLoai, ghiChu;

    public LoaiLaptop() {
    }

    public LoaiLaptop(String maLoai, String tenLoai, String ghiChu) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.ghiChu = ghiChu;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
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
        maLoai = scanner.nextLine();
        System.out.print("Nhap Ten loai Laptop: ");
        tenLoai = scanner.nextLine();
        System.out.print("Nhap Ghi chu(neu co): ");
        ghiChu = scanner.nextLine();
    }
}
