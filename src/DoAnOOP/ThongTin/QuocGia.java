package DoAnOOP.ThongTin;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class QuocGia implements Serializable {
    @Serial
    private static long serialVersion = 45645446546l;
    static final Scanner scanner = new Scanner(System.in);
    private String maQuocGia, tenQuocGia;
    public QuocGia() {
    }
    public QuocGia(String maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
//    ĐỌC TỪ FILE
    public void input() {
        System.out.print("Nhap Ma Quoc Gia: ");
        maQuocGia = scanner.nextLine();
        System.out.print("Nhap Ten Quoc Gia: ");
        tenQuocGia = scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%4d,%25s",maQuocGia,tenQuocGia);
    }
}
