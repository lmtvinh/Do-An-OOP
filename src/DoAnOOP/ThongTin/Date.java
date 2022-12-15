package DoAnOOP.ThongTin;

import DoAnOOP.Help.Check;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Date implements Serializable{
    @Serial
    private static long serialVersionUID = 46547987987L;
    static final Scanner scanner = new Scanner(System.in);
    private int day,month,year;
    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void input() {
        System.out.print("Nhập Ngày: ");
        day = Check.checkInputInteger();
        System.out.print("Nhập Tháng: ");
        month = Check.checkInputInteger();
        System.out.print("Nhập Năm: ");
        year = Check.checkInputInteger();
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",day,month,year);
    }

//    @Override
//    public String[] getThuocTinh() {
//        return null;
//    }
//
//    @Override
//    public String getDuLieu() {
//        return null;
//    }
}