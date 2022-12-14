package DoAnOOP.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class ADanhSach {
    public void ghiFile(String duongDan) {
        try {
            FileOutputStream fo = new FileOutputStream(duongDan);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(this);
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }
    }

    public abstract void copyFrom(ADanhSach newDanhSach);

    public void docFile(String duongDan) {
        try {
            FileInputStream fi = new FileInputStream(duongDan);
            ObjectInputStream ois = new ObjectInputStream(fi);
            var a = (ADanhSach)ois.readObject();
            this.copyFrom(a);
        } catch (Exception ignored) {
        }
    }
}
