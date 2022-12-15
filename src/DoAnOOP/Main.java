package DoAnOOP;

import javax.swing.text.View;

import DoAnOOP.Data.Loader;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            DoAnOOP.View.Main.main(args);
        } else {
            DoAnOOP.Data.Loader.main(args);
        }
    }
}
