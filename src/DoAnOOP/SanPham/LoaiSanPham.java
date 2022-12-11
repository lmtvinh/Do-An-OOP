package DoAnOOP.SanPham;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class LoaiSanPham implements Serializable{
    @Serial
    private static long serialVersionUID = 546546464L;
    final static Scanner scanner = new Scanner(System.in);
    private String maLoai, tenLoai, ghiChu;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoai, String tenLoai, String ghiChu) {
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
        System.out.print("Nhap Ma Loai San Pham: ");
        maLoai = scanner.nextLine();
        System.out.print("Nhap Ten Loai San Pham: ");
        tenLoai = scanner.nextLine();
        System.out.print("Nhap ghi chu(neu co): ");
        ghiChu = scanner.nextLine();
    }

    public void output() {

    }
}
