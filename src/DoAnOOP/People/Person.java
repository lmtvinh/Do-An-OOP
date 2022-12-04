package DoAnOOP.People;

import DoAnOOP.ThongTin.Date;
import DoAnOOP.Help.Check;
import DoAnOOP.ThongTin.Address;

import java.util.Scanner;

public class Person {
    static final Scanner in=new Scanner(System.in);

    protected String fullname, email;
    protected Address address;
    protected Date dateOfBirth;

    public Person() {
        this.fullname = null;
        this.address = new Address();
        this.dateOfBirth = new Date();
    }
    public Person(String fullname,String email,Address address, Date dateOfBirth) {
        this.email = email;
        this.fullname = fullname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
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
        System.out.print("Nhap full name: ");
        setFullname(in.nextLine());
        System.out.print("Nhap email: ");
        email = Check.checkInputEmail();
        address.input();
        dateOfBirth.input();
    }

    public void output(){
//        System.out.println("Full name: " + getFullname());
//        System.out.println("Dia chi: " + add.getAddress());
//        System.out.println("Ngay sinh: " + dateOfBirth.getDate());
        System.out.printf("%-25s%-25s%-25s%-15s%","Full name","Email","Address","Date Of Brith");
        System.out.printf("%-25s%-25s%-25s%-15s%",getFullname(),getEmail(),getAddress().toString(),getDateOfBirth().toString());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        person.output();
    }
}
