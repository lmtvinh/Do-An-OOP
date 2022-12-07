package DoAnOOP.SanPham.Laptop;

import java.util.Scanner;
import java.util.Objects;

public class DanhSachLaptop {
    final static Scanner scanner = new Scanner(System.in);
    private Laptop[] arrLaptop;
    private int length;
    public DanhSachLaptop() {
        arrLaptop = null;
        length = 0;
    }
    public DanhSachLaptop(int length) {
        this.length = length;
        arrLaptop = new Laptop[length];
    }
    public Laptop get(int index) {
        return arrLaptop[index];
    }
    public void addLaptop(Laptop a) {
        if (length == 0) {
            arrLaptop = new Laptop[1];
            arrLaptop[0] = a;
            length++;
        } else {
            Laptop[] temp = new Laptop[length + 1];
            for (int i = 0; i < length; i++) {
                temp[i] = arrLaptop[i];
            }
            temp[length] = a;
            arrLaptop = temp;
            length++;
        }
    }
    public void set(Laptop a, int index, Laptop[] arr) {
        arr[index] = a;
    }
    public void remove(int index, Laptop a) {
        if (index < 0 || index > length) return;
        for (int i = index; i < length; i++){
            set(a,index,arrLaptop);
        }
    }
    public void removeLaptop() {
        System.out.print("Nhap ma Laptop: ");
        String check = scanner.nextLine();
        for (int i = 0; i < length; i++) {
            boolean result = get(i).getMaLaptop().equalsIgnoreCase(check);
            if (result) {
                remove(i,get(i));
            }
        }
    }

    public void updateLaptop(String indexMaLaptop) {
        int temp = -1;
        Laptop newLaptop = null;
        for(int i = 0; i < length; i++) {
            if (arrLaptop[i].getMaLaptop().equals(indexMaLaptop)) {
                temp = i;
                newLaptop = arrLaptop[i];
            }
        }
        if (temp != -1 && newLaptop != null) {
            Laptop newLt = null;
            newLt.input();
            set(newLt, temp, arrLaptop);
        } else {
            System.out.println("Khong co ID trong Danh Sach.");
        }
    }

    // public void output() {

    // }
    
    public void findByMaSanPham(String maSanPham) {
        int flag = -1, count = -1;
        for (int i = 0; i < length; i++) {
            boolean result = get(i).getMaLaptop().equalsIgnoreCase(maSanPham);
            if (result) {
                flag = 1;
                count = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("\n\tTHONG TIN CUA SAN PHAM BAN CAN TIM.");
            // get(count).output();
        } else {
            System.out.println("\n\tKHONG TIM THAY THONG TIN CUA SAN PHAM.");
        }
    }

    public void findByPrice(float min, float max) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (arrLaptop[i].getPrice() >= min && arrLaptop[i].getPrice() <= max) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getPrice() >= min && arrLaptop[i].getPrice() <= max) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO GIA TU " + min + " DEN " + max + ".");
            for (int i = 0; i < count; i++) {
                // b[i].output;
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO GIA TU " + min + " DEN " + max + ".");
        }
    }

    public void findHangSanXuat(String nameMaker) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (arrLaptop[i].getThongTinNXS(nameMaker)!=null) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getThongTinNXS(nameMaker) != null) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO HANG SAN XUAT LA " + nameMaker);
            for (int i = 0; i < count; i++) {
                // b[i].output();
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + nameMaker);
        }
    }

    public void sortByAscendingPrice() {
        Laptop[] temp = new Laptop[length];
        temp = arrLaptop;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                if (arrLaptop[i].getPrice() > arrLaptop[j].getPrice()) {
                    Laptop temp1 = null;
                    temp1 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp1;
                }
            }
        }
        System.out.println("\n\tDANH SACH SAN PHAM CO GIA TANG DAN.");
        for (int i = 0; i < length; i++) {
            // temp[i].output();
        }
    }

    public void sortByDescendingPrice() {
        Laptop[] temp = new Laptop[length];
        temp = arrLaptop;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                if (arrLaptop[i].getPrice() < arrLaptop[j].getPrice()) {
                    Laptop temp1 = null;
                    temp1 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp1;
                }
            }
        }
        System.out.println("\n\tDANH SACH SAN PHAM CO GIA GIAM DAN.");
        for (int i = 0; i < length; i++) {
            // temp[i].output();
        }
    }

    public void findByCPU(String nameCPU) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLaptop[i].getCPU(), nameCPU)) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getCPU().contains(nameCPU)) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO CPU LOAI " + nameCPU + "LA.");
            for (int i = 0; i < count; i++) {
                // b[i].output();
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + nameCPU);
        }
    }

    public void findByRamCapacity(String ramCapacity) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLaptop[i].getRamCapacity(), ramCapacity)) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getRamCapacity().contains(ramCapacity)) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO DUNG LUONG RAM " + ramCapacity + "LA.");
            for (int i = 0; i < count; i++) {
                // b[i].output();
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO HANG SAN XUAT LA " + ramCapacity);
        }
    }

    public void findByScreensize(String checkScreensize) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLaptop[i].getScreensize(), checkScreensize)) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getScreensize().contains(checkScreensize)) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO KICH THUOC MAN HINH " + checkScreensize + "LA.");
            for (int i = 0; i < count; i++) {
                // b[i].output();
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO KICH THUOC MAN HINH LA " + checkScreensize);
        }
    }

    public void findByResolution(String checkResolution) {
        int count = 0, flag = 0;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLaptop[i].getResolution(), checkResolution)) {
                count++;
            }
        }
        if (count != 0) {
            Laptop[] b = new Laptop[count];
            for (int i = 0; i < count; i++) {
                if (arrLaptop[i].getResolution().contains(checkResolution)) {
                    b[flag] = arrLaptop[i];
                    flag++;
                }
            }
            System.out.println("\n\tTHONG TIN SAN PHAM CO DO PHAN GIAI " + checkResolution + "LA.");
            for (int i = 0; i < count; i++) {
                // b[i].output();
            }
        } else {
            System.out.println("\n\tKHONG CO SAN PHAM NAO CO DO PHAN GIAI LA " + checkResolution);
        }
    }

    public Laptop getByIdLaptop(String idCanCheck) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(arrLaptop[i].getMaLaptop(), idCanCheck)) {
                return arrLaptop[i];
            }
        }
        return null;
    }
}
