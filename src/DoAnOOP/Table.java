package DoAnOOP;

import java.util.ArrayList;

public class Table {
    public static String createTable(ArrayList<?extends Output> data) {
        int[] doRongCacCot = new int[data.get(0).getThuocTinh().length];
        for (int i = 0; i < data.get(0).getThuocTinh().length; i++) {
            doRongCacCot[i] = data.get(0).getThuocTinh()[i].length();
        }
        for (var row:data) {
            for (int i = 0; i < row.getThuocTinh().length; i++) {
                if (doRongCacCot[i] < row.getDuLieu()[i].length()) {
                    doRongCacCot[i] = row.getDuLieu()[i].length();
                }
            }
        }
        String rs = createRow(data.get(0).getThuocTinh(),doRongCacCot);
        for (var row:data) {
            rs += createRow(row.getThuocTinh(),doRongCacCot);
        }
        return rs;
    }

    public static void printTable(ArrayList<?extends Output> data) {
        if (data.size() == 0){
            System.out.println("DANH SACH RONG.");
            return;
        }
        System.out.println(createTable(data));
    }

    private static String createRow(String[] str,int[] doRongCacCot) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append("|");
            int lengthPrint = str[i].length();
            int lengthSpace = doRongCacCot[i] - lengthPrint + 2;
            stringBuilder.append(str[i]);
            stringBuilder.append(" ".repeat(Math.max(0, lengthSpace)));
        }
        stringBuilder.append("|\n");
        return stringBuilder.toString();
    }
}
