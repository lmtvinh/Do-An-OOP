package DoAnOOP.People;

import DoAnOOP.Output;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.Help.Check;
import DoAnOOP.ThongTin.Address;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Output, Serializable {
    @Serial
    private static long serialVersionUID = -4641318484654L;
    static final Scanner in=new Scanner(System.in);

    protected String fullname, email, matKhau;
    protected Address address;
    protected Date dateOfBirth;

    public Person() {
        this.fullname = null;
        this.address = new Address();
        this.dateOfBirth = new Date();
    }
    public Person(String fullname,String email,String matKhau, Address address, Date dateOfBirth) {
        this.email = email;
        this.fullname = fullname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.matKhau = matKhau;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullname() {
        return fullname;
    }
    public Address Address() {
        return address;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input(){
        System.out.print("Nhập Họ Và Tên: ");
        setFullname(in.nextLine());
        System.out.print("Nhập Email: ");
        email = Check.checkInputEmail();
        System.out.println("Nhập Mật Khẩu: ");
        matKhau = Check.inputEmpty().trim();
        System.out.println("Nhập Thông Tin Về Địa Chỉ: ");
        address.input();
        System.out.println("Nhập Ngày Sinh: ");
        dateOfBirth.input();
    }

    public void output(){
        System.out.println("Họ và tên: " + getFullname());
        System.out.println("Email: " + getEmail());
        System.out.println("Địa Chỉ: " + getAddress().toString());
        System.out.println("Ngày Sinh: " + getDateOfBirth().toString());
    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        person.input();
//        person.output();
//    }

    public abstract void suaThongTinConNguoi();

    @Override
    public String[] getThuocTinh() {
        return new String[]{"Ho va ten","Email","Dia Chi","Ngay Sinh"};
    }

    @Override
    public String[] getDuLieu() {
        return new String[]{this.fullname,this.email,this.address.toString(),this.dateOfBirth.toString()};
    }
}
