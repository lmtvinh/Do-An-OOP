package DoAnOOP.ThongTin;

import DoAnOOP.Output;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Provider implements Output, Serializable {
	@Serial
	private static long serialVersionUID = 45645648897L;
	final static Scanner sc = new Scanner(System.in);
	protected String maNCC;
	protected String tenNCC;
	protected QuocGia quocGia;
	protected Address address;
	protected String phoneNumber;
	
	public Provider() {
		maNCC = null;
		tenNCC =null;
		quocGia = null;
		address = null;
		phoneNumber = null;
	}
	public Provider(String maNCC, String tenNCC, QuocGia quocGia, Address address, String phoneNumber) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.quocGia = quocGia;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getMaNCC() {
		return maNCC;
	}
	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public Address getAddress() {
		System.out.print("Nhap Address: ");
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void input() {
		System.out.print("Nhap ma Nha cung cap: ");
        maNCC = sc.nextLine();
        System.out.print("Nhap ten Nha cung cap: ");
        tenNCC = sc.nextLine();
        System.out.println("Nhap Quoc Gia: ");
//        quocGia = sc.nextLine();
		quocGia.input();
        System.out.print("Nhap So dien thoai: ");
        phoneNumber = sc.nextLine();
	}
	// public void output() {
	// 	System.out.printf("%-20s%-20s%-20s%-20s\n","Ma NCC","Ten NCC","Quoc Gia","Dien thoai");
    //     System.out.printf("%-20s%-20s%-20s%-20s\n", (Object) maNCC,tenNCC,quocGia,phoneNumber);
	// }

	@Override
	public String[] getThuocTinh() {
		return new String[]{"Ma Nha Cung Cap","Ten Nha Cung Cap","Quoc Gia","So Dien Thoai"};
	}

	@Override
	public String[] getDuLieu() {
		return new String[]{this.maNCC,this.tenNCC,this.quocGia.getTenQuocGia(),this.phoneNumber};
	}
}
