package DoAnOOP.ThongTin;

import DoAnOOP.Output;

import java.util.Scanner;

public class Maker implements Output {
    final static Scanner scanner = new Scanner(System.in);
    private String maNSX, tenNSX;
    public static String maNhaSanXuat;
    public static int id = 0;
    private QuocGia quocGia;

    public Maker() {
        id++;
    }

    public Maker(String maNSX, String tenNSX, QuocGia quocGia) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.quocGia = quocGia;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public void input() {
        System.out.print("Nhap Ma Nha San Xuat: ");
        maNSX = scanner.nextLine();
        System.out.print("Nhap Ten Nha San Xuat: ");
        tenNSX = scanner.nextLine();
        System.out.print("Nhap Thong tin Quoc Gia: ");
        quocGia.input();
    }

    @Override
    public String toString() {
        return getTenNSX() + "," + quocGia.toString();
    }

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ma Nha San Xuat","Ten Nha San Xuat","Quoc Gia"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.maNSX,this.tenNSX,this.quocGia.getTenQuocGia()};
    }
}
