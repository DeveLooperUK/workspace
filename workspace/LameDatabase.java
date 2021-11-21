package workspace;

import java.util.Scanner;

public class LameDatabase {
    public static String lameDb(String db, String op, String id, String data) {
        String[] databaseLame = db.split("#");
        String newDB = "";
        if (op.equals("delete")) {
            for (int i = 0; i < databaseLame.length; i++) {
                if (databaseLame[i].substring(0,1).equals(id)) {
                    continue;
                }
                newDB += databaseLame[i];
                if (i != databaseLame.length-1) {
                    newDB += "#";
                }
            }
        }
        else if (op.equals("edit")) {
            for (int i = 0; i < databaseLame.length; i++) {
                if (databaseLame[i].substring(0,1).equals(id)) {
                    databaseLame[i] = databaseLame[i].substring(0,1) + data;
                }
                newDB += databaseLame[i];
                if (i != databaseLame.length-1) {
                    newDB += "#";
                }
            }
        }
        else if (op.equals("edit")) {
            for (int i = 0; i < databaseLame.length; i++) {
                if (databaseLame[i].substring(0,1).equals(id)) {
                    databaseLame[i] = databaseLame[i].substring(0,1) + data;
                }
                newDB += databaseLame[i];
                if (i != databaseLame.length-1) {
                    newDB += "#";
                }
            }
        }
        else if (op.equals("add")) {
            String[] databaseAdd = new String[databaseLame.length+1];
            int counter = 0;
            for (int i = 0; i < databaseAdd.length; i++) {
                if (i+1 == Integer.valueOf(id)) {
                    databaseAdd[i] = id + data;
                    counter++;
                }
                else databaseAdd[i] = i+1+databaseLame[i-counter].substring(1);
                newDB += databaseAdd[i];
                if (i != databaseAdd.length-1) {
                    newDB += "#";
                }
            }
        }
        return newDB;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
