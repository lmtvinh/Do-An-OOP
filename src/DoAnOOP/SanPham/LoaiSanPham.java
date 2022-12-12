package DoAnOOP.SanPham;

import DoAnOOP.Output;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class LoaiSanPham implements Serializable, Output {
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
        System.out.print("Nhập Mã Loại Sản Phẩm: ");
        maLoai = scanner.nextLine();
        System.out.print("Nhập Tên Loại Sản Phẩm: ");
        tenLoai = scanner.nextLine();
        System.out.print("Nhập Ghi Chú(Nếu có): ");
        ghiChu = scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã Loại Sản Phẩm: " + this.getMaLoai());
        System.out.println("Tên Loại Sản Phẩm: " + this.getTenLoai());
        System.out.println("Ghi chú: " + this.getGhiChu());
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Mã Loại Sản Phẩm","Tên Loại Sản Phẩm","Ghi Chú"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.getMaLoai(),this.getTenLoai(),this.getGhiChu()};
    }
}
