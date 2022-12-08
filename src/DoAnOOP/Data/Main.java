package DoAnOOP.Data;

import DoAnOOP.HoaDon.HoaDonBan.ChiTietHoaDonBan;
import DoAnOOP.HoaDon.HoaDonBan.HoaDonBan;
import DoAnOOP.HoaDon.PhieuNhap.ChiTietPhieuNhap;
import DoAnOOP.HoaDon.PhieuNhap.PhieuNhap;
import DoAnOOP.People.Customer;
import DoAnOOP.People.Employee;
import DoAnOOP.SanPham.Laptop.Laptop;
import DoAnOOP.SanPham.Laptop.LoaiLaptop;
import DoAnOOP.SanPham.PC.LoaiPC;
import DoAnOOP.SanPham.PC.PC;
import DoAnOOP.ThongTin.Address;
import DoAnOOP.ThongTin.Date;
import DoAnOOP.ThongTin.Maker;
import DoAnOOP.ThongTin.Provider;
import DoAnOOP.ThongTin.QuocGia;

public class Main {

    public static void initEmployee() {
//        Quan ly 1
        Address a1 = new Address("273","An Duong Vuong","Phuong 8", "Quan 5","TP HCM");
        Date d1 = new Date(16,6,2003);
        Employee e1 = new Employee("Nguyen Van A","nguyenvana@gmail.com",a1,d1,"QL001",3,15000000,240);
//        Quan ly 2
        Address a2 = new Address("43","An Phu Dong 10","An Phu Dong","Quan 12","TP HCM");
        Date d2 = new Date(1,1,2000);
        Employee e2 = new Employee("Nguyen Van B","nguyenvanb@gmail.com",a2,d2,"QL002",3,16000000,200);
//        Quan ly 3
        Address a3 = new Address("828","Tran Hung Dao","Phuong 7","Quan 5","TP HCM");
        Date d3 = new Date(9,6,2003);
        Employee e3 = new Employee("Tran Luong Thieu Huy","tranluongthieuhuy@gmail.com",a3,d3,"QL003",3,17000000,210);
//        Quan ly 4
        Address a4 = new Address("D2/34","Kinh A","Xa Le Minh Xuan","Quan Binh Chanh","TP HCM");
        Date d4 = new Date(19,3,2003);
        Employee e4 = new Employee("Nguyen Minh Huu","nguyenminhhuu@gmail.com",a4,d4,"QL004",3,18000000,150);
//        Nhan vien 1
        Address a5 = new Address("18B","Duong so 2","Phuong Thanh My Loi","Quan 2","TP HCM");
        Date d5 = new Date(12,8,2003);
        Employee e5 = new Employee("Pham Van Du","phanvandu@gmail.com",a5,d5,"NV001",2.5f,8000000,300);
//        Nhan vien 2
        Address a6 = new Address("24","D2","Phuong 5","Quan Binh Thanh","TP HCM");
        Date d6 = new Date(5,6,2000);
        Employee e6 = new Employee("Luong Minh B","luongminhb@gmail.com",a6,d6,"NV002",2f,7000000,200);
//        Nhan vien 3
        Address a7 = new Address("25","D3","Phuong 6","Quan Tan Binh","TP HCM");
        Date d7 = new Date(5,6,2000);
        Employee e7 = new Employee("Ngo Minh C","ngominhc@gmail.com",a7,d7,"NV003",2f,7500000,200);
//        Nhan vien 4
        Address a8 = new Address("8","D8","Phuong 8","Quan Binh Tan","TP HCM");
        Date d8 = new Date(15,6,2000);
        Employee e8 = new Employee("Le Van B","levanb@gmail.com",a8,d8,"NV004",2f,6500000,210);
//        Nhan vien 5
        Address a9 = new Address("84","D3","Phuong 9","Quan Tan Phu","TP HCM");
        Date d9 = new Date(25,6,2000);
        Employee e9 = new Employee("Huynh Minh C","huynhminhc@gmail.com",a9,d9,"NV005",2f,6000000,150);
//        Nhan vien 6
        Address a10 = new Address("45","A10","Phuong 10","Quan 3","TP HCM");
        Date d10 = new Date(5,8,1999);
        Employee e10 = new Employee("Tran Luong Thieu H","tlth@gmail.com",a10,d10,"NV006",2F,5000000,155);
    }

    public static void initCustomer() {
//        Khach hang 1
        Address a1 = new Address("76","Le Khiet","Thi Tran Cho Chua","Huyen Nghia Hanh","Quang Ngai");
        Date d1 = new Date(16,6,2003);
        Customer c1 = new Customer("Luong Minh The Vinh","luongminhthevinh@gmail.com",a1,d1,"KH001");
//        Khach hang 2
        Address a2 = new Address("77","Le Hong Phong","Phuong Bong Son","Thi xa Hoai Nhon","Binh Dinh");
        Date d2 = new Date(16,5,2000);
        Customer c2 = new Customer("Ngo Van A","ngovana@gmail.com",a2,d2,"KH002");
//        Khach hang 3
        Address a3 = new Address("55","Nguyen Trai","Phuong 8","Quan 5","TP HCM");
        Date d3 = new Date(6,2,1999);
        Customer c3 = new Customer("Le Huu B","lehuub@gmail.com",a3,d3,"KH003");
//        Khach hang 4
        Address a4 = new Address("66","Luy Ban Bich","Phuong 9","Quan Tan phu","TP HCM");
        Date d4 = new Date(25,6,2005);
        Customer c4 = new Customer("Luong Huu D","luonghuud@gmail.com",a4,d4,"KH004");
//        Khach hang 5
        Address a5 = new Address("48","Le Dai Hanh","Phuong 9","Quan Hai Ba Trung","Ha Noi");
        Date d5 = new Date(27,5,2004);
        Customer c5 = new Customer("Le Van Ba","levanba@gmail.com",a5,d5,"KH005");
//        Khach hang 6
        Address a6 = new Address("172","Lac Long Quan","Phuong Buoi","Quan Tay Ho","Ha Noi");
        Date d6 = new Date(27,5,1995);
        Customer c6 = new Customer("Nguyen Tan Tu","nguyentantu@gmail.com",a6,d6,"KH006");
//        Khach hang 7
        Address a7 = new Address("158","Tran Phu","Phuong 5","Quan 5","TP HCM");
        Date d7 = new Date(27,7,1997);
        Customer c7 = new Customer("Ngo Huu N","ngohuun@gmail.com",a7,d7,"KH007");
//        Khach hang 8
        Address a8 = new Address("18","Ngo Tat To","Phuong 8","Quan 9","TP HCM");
        Date d8 = new Date(28,8,1998);
        Customer c8 = new Customer("Nguyen Tan Tu","nguyentantu@gmail.com",a8,d8,"KH008");
//        Khach hang 9
        Address a9 = new Address("9","Dao Duy Anh","Phuong 9","Quan Dong Da","Ha Noi");
        Date d9 = new Date(27,5,1995);
        Customer c9 = new Customer("Nguyen Tan Huy","nguyentanhuy@gmail.com",a9,d9,"KH009");
//        Khach hang 10
        Address a10 = new Address("150","Dao Duy Anh","Phuong 9","Quan Phu Nhuan","TP HCM");
        Date d10 = new Date(10,10,2000);
        Customer c10 = new Customer("Nguyen Tan Hoang","nguyentanhoang@gmail.com",a10,d10,"KH010");
    }

    public static void initProvider() {
        // GearVN
        QuocGia quocGia = new QuocGia("+84", "Viet Nam");
        Address address1 = new Address("80", "Hoang Hoa Tham", "12", "Tan Binh", "TP Ho Chi Minh");
        Provider provider1 = new Provider("GVN", "GearVN", quocGia, address1, "1800 6975");
        // Thegioididong
        Address address2 = new Address("440", "Tran Hung Dao", "11", "5", "TP Ho Chi Minh");
        Provider provider2 = new Provider("TGDD", "thegioididong", quocGia, address2, "1800 1060");
    }

    public static void initMaker() {
        // Hang San Xuat Dell
        QuocGia quocGia1 = new QuocGia("+1","Hoa Ky");
        Maker maker1 = new Maker("DE", "DELL", quocGia1);
        // Hang San Xuat ACER
        QuocGia quocGia2 = new QuocGia("+886", "Dai Loan");
        Maker maker2 = new Maker("AC", "ACER", quocGia2);
        // Hang San Xuat ASUS
        QuocGia quocGia3 = new QuocGia("+886", "Dai Loan");
        Maker maker3 = new Maker("AS", "ASUS", quocGia3);
        // Hang San Xuat LENOVO
        QuocGia quocGia4 = new QuocGia("+86", "Trung Quoc");
        Maker maker4 = new Maker("LE", "LENOVO", quocGia4);
        // Hang San Xuat HP Inc.
        QuocGia quocGia5 = new QuocGia("+1", "Hoa Ky");
        Maker maker5 = new Maker("HP", "HP Inc.", quocGia5);
    }

    public static void initLoaiLaptop() {
        LoaiLaptop loaiLaptop1 = new LoaiLaptop("Gaming","Danh cho nguoi dung co nhu cau choi game va lam do hoa.");
        LoaiLaptop loaiLaptop2 = new LoaiLaptop("Van phong","Danh cho nguoi dung co nhu cau su dung cac tac vu co ban.");
    }

    public static void initLaptop() {
//        ASUS
//        Laptop1
        Laptop laptop1 = new Laptop("ASUS ProArt Studiobook Pro 16 OLED W7600Z3A L2048W","Intel Core i9-12900H 2.5GHz up to 5.0GHz 24MB","32GB (16x2) DDR5 4800MHz (2x SO-DIMM socket, up to 64GB SDRAM)","AS","GVN",79990000f,48,"LP001","16 inch","4K (3840 x 2400) OLED 16:10","VP");
//        Laptop2
        Laptop laptop2 = new Laptop("ASUS ROG Strix SCAR 15 G533ZW LN134W","Intel Core i9-12900H 3.8GHz up to 5.0GHz 24MB","32GB (16GBx2) DDR5 4800MHz (2x SO-DIMM socket, up to 64GB SDRAM)","AS","GVN",71990000f,48,"LP002","15.6 inch","WQHD (2560 x 1440) 16:9","GM");
//        ACER
//        Laptop3
        Laptop laptop3 = new Laptop("Acer Swift Edge SFA16 41 R9WB","AMD Ryzen™ 7 PRO 6850U (2.7 GHz upto 4.70 GHz)","32GB LPDDR5 6400MHz (Onboard)","AC","GVN",45990000f,48,"LP003","16 inch","WQUXGA (3840x2400) OLED 16:10","VP");
//        Laptop4
        Laptop laptop4 = new Laptop("Acer Predator Triton 500 SE PT516 52S 91XH","Intel® Core™ i9-12900H 3.80 GHz up to 5.00 GHz","32GB DDR5 4800MHz Onboard","AC","GVN",105990000f,48,"LP004","16 inch","WQXGA (2560 x 1600) SlimBezel 240Hz","GA");
//        Lenovo
//        Laptop5
        Laptop laptop5 = new Laptop("Lenovo IdeaPad 5 Pro 16ARH7 82SN003LVN","AMD Ryzen 5 6600HS Creator Edition (6C / 12T, 3.3 / 4.5GHz, 3MB L2 / 16MB L3)","16GB LPDDR5 6400MHz dual-channel onboard","LE","GVN",26490000f,48,"LP005","16 inch", "2.5K WQXGA (2560x1600) IPS","VP");
//        Laptop6
        Laptop laptop6 = new Laptop("Lenovo Legion 7 16IAX7 82TD008FVN","Intel Core i7-12700H","32GB (2x16GB) DDR5 4800MHz (2x SO-DIMM socket, up to 32GB SDRAM)","LE","GVN",76990000f,48,"LP006","16 inch", "WQXGA (2560x1600) IPS 500nits Anti-glare","GA");
//        Dell
//        Laptop7
        Laptop laptop7 = new Laptop("Dell XPS 15 9520 70295790","Intel Core i9-12900HK 3.8GHz up to 5.0GHz 18MB","16GB (2 x 8GB) DDR5 4800MHz","DE","GVN",75990000f,48,"LP007","15.6 inch", "3.5K QHD+ (3456 x 2160)","VP");
//        Laptop8
        Laptop laptop8 = new Laptop("Dell Alienware M15 R6 70272633","Intel Core i7-11800H 2.3GHz up to 4.6GHz 24MB","32GB (16x2) DDR4 3200MHz (2x SO-DIMM socket, up to 64GB SDRAM)","DE","GVN",54990000f,48,"LP008","15.6 inch", "QHD (2560 x 1440) 240Hz","GA");
//        HP
//        Laptop9
        Laptop laptop9 = new Laptop("HP Spectre x360 14 ef0030TU 6K773PA","Intel Core i7-1255U 1.7GHz up to 4.7GHz 12MB","16GB LPDDR4x 4266MHz (Onboard)","HP","GVN",51990000f,48,"LP009","13.5 inch", "3K2K (3000 x 2000)","VP");
//        Laptop10
        Laptop laptop10 = new Laptop("HP Omen 16 b0127TX 4Y0W7PA","HP Omen 16 b0127TX 4Y0W7PA","16GB (2x8GB) DDR4 3200Mhz (2 khe, max 64GB RAM)","HP","GVN",45990000f,48,"LP010","16.1 inch", "QHD (2560 x 1440)","GA");
    }

    public void initLoaiPC() {
        LoaiPC loaiPC1 = new LoaiPC("Gaming","Danh cho nguoi dung co nhu cau choi game, thiet ke do hoa.");
        LoaiPC loaiPC2 = new LoaiPC("Van Phong","Danh cho nguoi dung co nhu cau su dung co ban.");
    }

    public void initPC() {
        // PC1
        PC pc1 = new PC("GVN POSEIDON 9 i3090 ( Cougar )","GVN POSEIDON 9 i3090 ( Cougar )","Corsair Dominator Platinum 32GB (2x16GB) RGB 5600 DDR5 White","GVN","GVN",125000000f,60,"PC001","ASUS ROG STRIX Z690-A GAMING WIFI DDR5","Cougar ConQuer 2 - Full Tower","SamSung 980 PRO 1TB M.2 PCIe gen 4 NVMe","Tùy chọn nâng cấp","Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO x 2","Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO","GA");
        // PC2
        PC pc2 = new PC("GVN ProArt Plus 9 a4090", "GVN ProArt Plus 9 a4090", "Kingston Fury Beast RGB 64GB (2x32GB) bus 5600 DDR5", "GVN", "GVN", 120000000f, 60, "PC002", "ASUS ProArt X670E-CREATOR WIFI (DDR5)", "NZXT H7 Flow Black", "Kingston KC3000 1TB M.2 PCIe gen 4 NVMe", "Seagate Barracuda 2TB 7200rpm", "Cooler Master SICKLEFLOW 120 ARGB 3 IN 1", "Cooler Master SICKLEFLOW 120 ARGB 3 IN 1", "GA");
        // PC3
        PC pc3 = new PC("GVN TITAN Plus i3080Ti", "Intel Core i9 12900K", "Kingston Fury Beast RGB 32GB (2x16GB) bus 5600 DDR5 (KF556C40BBAK2-32)", "GVN", "GVN", 89000000f, 60, "PC003", "MSI MAG X570S TOMAHAWK WIFI", "PC003", "SamSung 980 PRO 500GB M.2 PCIe gen 4 NVMe", "Tùy chọn nâng cấp", "Cooler Master SICKLEFLOW 120 ARGB 3 IN 1", "MSI GeForce RTX 3080 Ti GAMING X TRIO 12G", "GA");
        // PC4
        PC pc4 = new PC("MSI GeForce RTX 3080 Ti GAMING X TRIO 12G", "MSI GeForce RTX 3080 Ti GAMING X TRIO 12G", "Corsair Vengeance RS RGB 32gb (2x16GB) bus 3600", "GVN", "GVN", 67000000f, 60, "PC004", "MSI MAG X570S TOMAHAWK WIFI", "MSI MAG X570S TOMAHAWK WIFI", "SamSung 980 PRO 500GB M.2 PCIe gen 4 NVMe", "Tùy chọn nâng cấp", "Corsair H150i ELITE CAPELLIX", "MSI GeForce RTX 3080 Ti GAMING X TRIO 12G", "GA");
        // PC5
        PC pc5 = new PC("GVN PHANTOM Plus a3080Ti","AMD Ryzen 7 5800X3D","AMD Ryzen 7 5800X3D","GVN","GVN",67000000f,60,"PC005","MSI MAG X570S TOMAHAWK WIFI","MSI MAG X570S TOMAHAWK WIFI","SamSung 980 PRO 500GB M.2 PCIe gen 4 NVMe","Tùy chọn nâng cấp","Corsair H150i ELITE CAPELLIX","MSI GeForce RTX 3080 Ti GAMING X TRIO 12G","GA");
        // PC6
        PC pc6 = new PC("GVN Homework Athlon", "Athlon 3000G / 5MB / 3.5GHz / 2 nhân 4 luồng / AM4", "RAM Corsair Vengeance LPX 8GB bus 3200", "GVN", "GVN", 5000000, 36, "PC006", "RAM Corsair Vengeance LPX 8GB bus 3200", "Jetek EM4", "	Jetek EM4", "Tùy chọn nâng cấp", "JONSBO CR-1000 PLUS", "Khong co", "VP");
        // PC7
        PC pc7 = new PC("GVN VIPER i3050 WHITE", "Intel Core i5 12400F", "PNY XLR8 Silver 1x8GB 3600 RGB x 2", "GVN", "GVN", 21490000, 60, "PC007", "MSI MAG B660M MORTAR DDR4", "1st Player XF White (4 fan RGB)", "SSD Kingston NV2 250GB M.2 PCIe NVMe Gen4", "Tùy chọn nâng cấp", "ID COOLING SE-214-XT ARGB WHITE", "GIGABYTE GeForce RTX 3050 EAGLE OC 8G", "GA");
        // PC8
        PC pc8 = new PC("GVN TITAN Plus i3080Ti", "Intel Core i9 12900K", "Kingston Fury Beast RGB 32GB (2x16GB) bus 5600 DDR5 (KF556C40BBAK2-32)", "GVN", "GVN", 89000000, 60, "PC008", "ASUS ROG MAXIMUS Z690 HERO DDR5", "ASUS ROG Strix Helios GX601", "SamSung 980 PRO 500GB M.2 PCIe gen 4 NVMe", "Tùy chọn nâng cấp", "ASUS ROG RYUJIN II 360", "MSI GeForce RTX 3080 Ti GAMING X TRIO 12G", "GA");
        // PC9
        PC pc9 = new PC("GVN PHANTOM Plus i4080", "Intel Core i7 13700K", "Intel Core i7 13700K", "GVN", "GVN", 90000000, 60, "PC009", "GIGABYTE Z690 AERO D DDR5", "Corsair 5000D AIRFLOW Tempered Glass White", "Corsair 5000D AIRFLOW Tempered Glass White", "Tùy chọn nâng cấp", "Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO", "Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO", "GA");
        // PC10
        PC pc10 = new PC("Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO", "Corsair LL120 RGB LED 120mm White — Triple Pack with Lighting Node PRO", "PNY XLR8 Silver 1x8GB 3600 RGB x 2", "GVN", "GVN", 23000000, 60, "PC010", "ASUS TUF GAMING B550M-PLUS WIFI II (Socket AM4)", "ASUS TUF GAMING B550M-PLUS WIFI II (Socket AM4)", "ASUS TUF GAMING B550M-PLUS WIFI II (Socket AM4)", "Tùy chọn nâng cấp", "DEEPCOOL AG400 ARGB", "DEEPCOOL AG400 ARGB", "GA");
    }

    public void initHoaDonBan() {
        // HD1
        HoaDonBan hoaDonBan1 = new HoaDonBan("KH001", "NV001");
        // HD2  
        HoaDonBan hoaDonBan2 = new HoaDonBan("KH002", "NV001");
        // HD3
        HoaDonBan hoaDonBan3 = new HoaDonBan("KH003", "NV003");
        // HD4
        HoaDonBan hoaDonBan4 = new HoaDonBan("KH004", "NV003");
        // HD5
        HoaDonBan hoaDonBan5 = new HoaDonBan("KH005", "NV004");
        // HD6
        HoaDonBan hoaDonBan6 = new HoaDonBan("KH006", "NV004");
        // HD7
        HoaDonBan hoaDonBan7 = new HoaDonBan("KH007","NV004");
        // HD8
        HoaDonBan hoaDonBan8 = new HoaDonBan("KH008", "NV005");
        // HD9
        HoaDonBan hoaDonBan9 = new HoaDonBan("KH009", "NV005");
        // HD10
        HoaDonBan hoaDonBan10 = new HoaDonBan("KH001", "NV003");
    }

    public void initChiTietHoaDonBan() {
        // CTHD1
        ChiTietHoaDonBan chiTietHoaDonBan1 = new ChiTietHoaDonBan("HD1", "LP001", 2);
        // CTHD2
        ChiTietHoaDonBan chiTietHoaDonBan2 = new ChiTietHoaDonBan("HD2", "LP002", 2);
        // CTHD3
        ChiTietHoaDonBan chiTietHoaDonBan3 = new ChiTietHoaDonBan("HD3", "LP003", 2);
        // CTHD4
        ChiTietHoaDonBan chiTietHoaDonBan4 = new ChiTietHoaDonBan("HD4", "LP004", 2);
        // CTHD5
        ChiTietHoaDonBan chiTietHoaDonBan5 = new ChiTietHoaDonBan("HD5","LP005",2);
        // CTHD6
        ChiTietHoaDonBan chiTietHoaDonBan6 = new ChiTietHoaDonBan("HD6", "PC001", 5);
        // CTHD7
        ChiTietHoaDonBan chiTietHoaDonBan7 = new ChiTietHoaDonBan("HD7", "PC002", 3);
        // CTHD8
        ChiTietHoaDonBan chiTietHoaDonBan8 = new ChiTietHoaDonBan("HD8", "PC003", 5);
        // CTHD9
        ChiTietHoaDonBan chiTietHoaDonBan9 = new ChiTietHoaDonBan("HD9", "PC003", 6);
        // CTHD10
        ChiTietHoaDonBan chiTietHoaDonBan10 = new ChiTietHoaDonBan("HD10", "PC005", 6);
    }

    public void initPhieuNhap() {
        // PN1
        Date date1 = new Date(16, 2, 2021);
        PhieuNhap phieuNhap1 = new PhieuNhap("QL001", "GVN", date1);
        // PN2
        Date date2 = new Date(5, 4, 2021);
        PhieuNhap phieuNhap2 = new PhieuNhap("QL001", "GVN", date2);
        // PN3
        Date date3 = new Date(16, 4, 2021);
        PhieuNhap phieuNhap3 = new PhieuNhap("QL001", "GVN", date3);
        // PN4
        Date date4 = new Date(16, 5, 2021);
        PhieuNhap phieuNhap4 = new PhieuNhap("QL001", "GVN", date4);
        // PN5
        Date date5 = new Date(16, 6, 2021);
        PhieuNhap phieuNhap5 = new PhieuNhap("QL001", "GVN", date5);
        // PN6
        Date date6 = new Date(17, 8, 2021);
        PhieuNhap phieuNhap6 = new PhieuNhap("QL001", "GVN", date6);
        // PN7
        Date date7 = new Date(17, 9, 2021);
        PhieuNhap phieuNhap7 = new PhieuNhap("QL001", "GVN", date7);
        // PN8
        Date date8 = new Date(18, 10, 2021);
        PhieuNhap phieuNhap8 = new PhieuNhap("QL001", "GVN", date8);
        // PN9
        Date date9 = new Date(1, 2, 2022);
        PhieuNhap phieuNhap9 = new PhieuNhap("QL001", "GVN", date9);
        // PN10
        Date date10 = new Date(16, 2, 2022);
        PhieuNhap phieuNhap10 = new PhieuNhap("QL001", "GVN", date10);
    }

    public void initChiTietPhieuNhap() {
        // CTPN1
        ChiTietPhieuNhap chiTietPhieuNhap1 = new ChiTietPhieuNhap("PN1","LP001",5);
        // CTPN2
        ChiTietPhieuNhap chiTietPhieuNhap2 = new ChiTietPhieuNhap("PN2", "LP002", 5);
        // CTPN3
        ChiTietPhieuNhap chiTietPhieuNhap3 = new ChiTietPhieuNhap("PN3", "LP003", 5);
        // CTPN4
        ChiTietPhieuNhap chiTietPhieuNhap4 = new ChiTietPhieuNhap("PN4", "LP004", 5);
        // CTPN5
        ChiTietPhieuNhap chiTietPhieuNhap5 = new ChiTietPhieuNhap("PN5", "LP005", 5);
        // CTPN6
        ChiTietPhieuNhap chiTietPhieuNhap6 = new ChiTietPhieuNhap("PN6", "PC001", 5);
        // CTPN7
        ChiTietPhieuNhap chiTietPhieuNhap7 = new ChiTietPhieuNhap("PN7", "PC007", 5);
        // CTPN8
        ChiTietPhieuNhap chiTietPhieuNhap8 = new ChiTietPhieuNhap("PN8", "PC008", 5);
        // CTPN9
        ChiTietPhieuNhap chiTietPhieuNhap9 = new ChiTietPhieuNhap("PN9", "PC001", 5);
        // CTPN10
        ChiTietPhieuNhap chiTietPhieuNhap10 = new ChiTietPhieuNhap("PN10", "LP010", 5);
    }
}