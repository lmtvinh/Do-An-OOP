package DoAnOOP.ThongTin;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Address implements Serializable {
    @Serial
    private static long serialVersionUID = 46465487979L;
    final static Scanner scanner = new Scanner(System.in);
    private String apartmentNumber, street, precinct, district, city;
    public Address() {
    }

    public Address(String apartmentNumber, String street, String precinct, String district, String city) {
        this.apartmentNumber = apartmentNumber;
        this.street = street;
        this.precinct = precinct;
        this.district = district;
        this.city = city;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPrecinct() {
        return precinct;
    }

    public void setPrecinct(String precinct) {
        this.precinct = precinct;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        System.out.print("Nhap so Nha: ");
        apartmentNumber = scanner.nextLine();
        System.out.print("Nhap ten Duong: ");
        street = scanner.nextLine();
        System.out.print("Nhap ten Phuong: ");
        precinct = scanner.nextLine();
        System.out.print("Nhap ten Quan: ");
        district = scanner.nextLine();
        System.out.print("Nhap ten Thanh Pho: ");
        city = scanner.nextLine();
    }

    @Override
    public String toString() {
        return ""+getApartmentNumber()+","+getStreet()+","+getPrecinct()+","+getCity();
    }

//    @Override
//    public String getThuocTinh() {
//        return null;
//    }
//
//    @Override
//    public String getDuLieu() {
//        return null;
//    }
}
