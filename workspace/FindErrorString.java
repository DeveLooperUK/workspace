package workspace;

import java.util.Scanner;

public class FindErrorString {
    public static boolean isError(String line) {
        boolean check = false;
        if(line.substring(0, 5).equalsIgnoreCase("error")){
            check =true;
        }
       return check;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
