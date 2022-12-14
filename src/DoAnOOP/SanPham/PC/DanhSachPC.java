// package DoAnOOP.SanPham.PC;

// import DoAnOOP.Help.Check;

// import java.util.Objects;
// import java.util.Scanner;

// public class DanhSachPC {
//     final static Scanner scanner = new Scanner(System.in);
//     private PC[] arrPC;
//     private int length;
//     public DanhSachPC() {
//         arrPC = null;
//         length = 0;
//     }

//     public DanhSachPC(int length) {
//         this.length = length;
//         arrPC = new PC[length];
//     }

//     public PC get(int index) {
//         return arrPC[index];
//     }

//     public void set(PC a, int index, PC[] arr) {
//         arr[index] = a;
//     }

//     public void addPC(PC a) {
//         if (length == 0) {
//             arrPC = new PC[1];
//             arrPC[0] = a;
//             length++;
//         } else {
//             PC[] temp = new PC[length + 1];
//             for (int i = 0; i < length; i++) {
//                 temp[i] = arrPC[i];
//             }
//             temp[length] = a;
//             arrPC = temp;
//             length++;
//         }
//     }

//     public void remove(int index, PC a) {
//         if (index < 0 || index > length) return;
//         for (int i = index; i < length; i++) {
//             set(a,index,arrPC);
//         }
//     }

//     public void removePC() {
//         System.out.print("Nhap ma PC: ");
//         String check = scanner.nextLine();
//         for (int i = 0;i < length; i++) {
//             boolean result = get(i).getMaPC().equalsIgnoreCase(check);
//             if(result) {
//                 remove(i,get(i));
//             }
//         }
//     }

//     public void updatePC(String indexMaPC) {
//         int temp = -1;
//         PC newPC = null;
//         for (int i = 0; i < length; i++) {
//             if (arrPC[i].getMaPC().equals(indexMaPC)) {
//                 temp = i;
//                 newPC = arrPC[i];
//             }
//         }
//         if (temp != -1 && newPC != null) {
//             PC newPC1 = null;
//             newPC1.input();
//             set(newPC1, temp, arrPC);
//         } else {
//             System.out.println("Khong co ID trong Danh Sach.");
//         }
//     }

// //    public void output() {
// //
// //    }

//     public void findByMaSanPham(String maSanPham) {
//         int flag = -1, count = -1;
//         for (int i = 0; i < length; i++) {
//             boolean result = get(i).getMaPC().equalsIgnoreCase(maSanPham);
//             if(result) {
//                 flag = 1;
//                 count = i;
//                 break;
//             }
//         }
//         if (flag == 1) {
//             System.out.println("\n\tTHONG TIN CUA SAN PHAM BAN CAN TIM.");
// //            get(count).output();
//         } else {
//             System.out.println("\n\tKHONG TIM THAY THONG TIN CUA SAN PHAM.");
//         }
//     }
//     public void findByPrice(int min, int max) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (arrPC[i].getPrice() >= min && arrPC[i].getPrice() <= max) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getPrice() >= min && arrPC[i].getPrice() <= max) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO GIA TU " + min + " DEN " + max + ".");
//             for (int i = 0; i < count; i++) {
// //            b[i].output;
//             }
//         }
//         else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO GIA TU " + min + " DEN " + max + ".");
//         }
//     }

//     public void findHangSanXuat(String nameMaker) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++){
//             if (arrPC[i].getThongTinNXS(nameMaker) != null) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getThongTinNXS(nameMaker) != null) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO HANG SAN XUAT LA " + nameMaker);
//             for (int i = 0; i < count; i++) {
// //            b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + nameMaker);
//         }
//     }

//     public void sortByAscendingPrice() {
//         PC[] temp = new PC[length];
//         temp = arrPC;
//         for (int i = 0; i < length - 1; i++) {
//             for (int j = 1; j < length; j++) {
//                 if (arrPC[i].getPrice() > arrPC[j].getPrice()) {
//                     PC temp1 = null;
//                     temp1 = temp[i];
//                     temp[i] = temp[j];
//                     temp[j] = temp1;
//                 }
//             }
//         }
//         System.out.println("\n\tDANH SACH SAN PHAM CO GIA TANG DAN.");
//         for (int i = 0; i < length; i++) {
// //            temp[i].output();
//         }
//     }

//     public void sortByDescendingPrice() {
//         PC[] temp = new PC[length];
//         temp = arrPC;
//         for (int i = 0; i < length - 1; i++) {
//             for (int j = 1; j < length; j++) {
//                 if (arrPC[i].getPrice() < arrPC[j].getPrice()) {
//                     PC temp1 = null;
//                     temp1 = temp[i];
//                     temp[i] = temp[j];
//                     temp[j] = temp1;
//                 }
//             }
//         }
//         System.out.println("\n\tDANH SACH SAN PHAM CO GIA GIAM DAN.");
//         for (int i = 0; i < length; i++) {
// //            temp[i].output();
//         }
//     }

//     public void findByCPU(String nameCPU) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getCPU(), nameCPU)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getCPU().contains(nameCPU)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO CPU LOAI " + nameCPU + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + nameCPU);
//         }
//     }

//     public void findByRamCapacity(String ramCapacity) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getRamCapacity(), ramCapacity)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getRamCapacity().contains(ramCapacity)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO DUNG LUONG RAM " + ramCapacity + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + ramCapacity);
//         }
//     }

//     public void findBySSD(String checkSSD) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getSSD(), checkSSD)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getSSD().contains(checkSSD)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO LOAI " + checkSSD + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO LOAI LA " + checkSSD);
//         }
//     }

//     public void findByHHD(String checkHHD) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getHHD(), checkHHD)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getHHD().contains(checkHHD)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO LOAI HHD " + checkHHD + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO LOAI HHD " + checkHHD);
//         }
//     }

//     public void findByCooling(String checkCooling) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getCooling(), checkCooling)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getCooling().contains(checkCooling)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO LOAI TAN NHIET " + checkCooling + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO LOAI TAN NHIET " + checkCooling);
//         }
//     }

//     public void findByVGA(String checkVGA) {
//         int count = 0, flag = 0;
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getVGA(), checkVGA)) {
//                 count++;
//             }
//         }
//         if (count != 0) {
//             PC[] b = new PC[count];
//             for (int i = 0; i < count; i++) {
//                 if (arrPC[i].getVGA().contains(checkVGA)) {
//                     b[flag] = arrPC[i];
//                     flag++;
//                 }
//             }
//             System.out.println("\n\tTHONG TIN SAN PHAM CO CARD DO HOA " + checkVGA + "LA.");
//             for (int i = 0; i < count; i++) {
//                 // b[i].output();
//             }
//         } else {
//             System.out.println("\n\tKHONG CO SAN PHAM NAO CO CARD DO HOA " + checkVGA);
//         }
//     }

//     public PC getByIdPC(String idCanCheck) {
//         for (int i = 0; i < length; i++) {
//             if (Objects.equals(arrPC[i].getMaPC(), idCanCheck)) {
//                 return arrPC[i];
//             }
//         }
//         return null;
//     }

//     public void menuPC() {
//         String luachon;
//         do {
//             System.out.println("MENU PC");
//             System.out.println("1.Them vao PC");
//             System.out.println("2.Sua Danh Sach PC.");
//             System.out.println("3.Xoa PC trong Danh Sach.");
//             System.out.println("4.Xem Danh Sach PC");
//             System.out.println("4.Sap xep Danh sach PC theo gia ban Tang Dan.");
//             System.out.println("5.Sap xep Danh sach PC theo gia ban Giam Dan.");
//             System.out.println("6.Tim Kiem Theo Ma San Pham.");
//             System.out.println("7.Tim Kiem San Pham Theo Ten CPU.");
//             System.out.println("8.Tim Kiem San Pham Theo Dung luong Ram.");
//             System.out.println("9.Tim Kiem San Pham Theo Gia.");
//             System.out.println("0.Thoat.");
//             System.out.print("Nhap lua chon cua ban: ");
//             luachon = scanner.nextLine();
//             switch (luachon) {
//                 case "1" -> {
//                     System.out.println("Nhap thong tin PC can them vao Danh Sach.");
//                     PC newPC = new PC();
//                     newPC.input();
//                     addPC(newPC);
//                 }
//                 case "2" -> {
//                     System.out.println("Danh Sach PC.");
// //                    output();
//                     System.out.print("Nhap ma PC can sua: ");
//                     String maPCCanSua = scanner.nextLine();
//                     updatePC(maPCCanSua);
//                 }
//                 case "3" -> {
//                     System.out.println("Danh Sach PC.");
// //                    output();
//                     removePC();
//                 }
//                 case "4" -> {
//                     sortByAscendingPrice();
//                 }
//                 case "5" -> {
//                     sortByDescendingPrice();
//                 }
//                 case "6" -> {
//                     System.out.println("Danh Sach PC.");
// //                    output();
//                     System.out.print("Nhap ma PC: ");
//                     String maPC = scanner.nextLine();
//                     findByMaSanPham(maPC);
//                 }
//                 case "7" -> {
//                     System.out.println("Danh Sach PC.");
// //                    output();
//                     System.out.print("Nhap ten CPU: ");
//                     String tenCPUCanTim = scanner.nextLine();
//                     findByCPU(tenCPUCanTim);
//                 }
//                 case "8" -> {
//                     System.out.println("Danh Sach PC.");
// //                    output();
//                     System.out.print("Nhap dung luong Ram: ");
//                     String ramCapacity = scanner.nextLine();
//                     findByRamCapacity(ramCapacity);
//                 }
//                 case "9" -> {
//                     System.out.print("Nhap gia min: ");
//                     int min = Check.checkInputInteger();
//                     System.out.print("Nhap gia max: ");
//                     int max = Check.checkInputInteger();
//                     findByPrice(min, max);
//                 }
//                 case "0" -> {
//                     System.err.println("Thoat.");
//                 }
//                 default -> {
//                     System.err.println("LUA CHON CUA BAN KHONG PHU HOP.");
//                 }
//             }
//         } while (luachon != "0");
//     }
// }
