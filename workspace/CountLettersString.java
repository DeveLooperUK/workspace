package workspace;

import java.util.Scanner;

public class CountLettersString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String result = "";
        int count =0;
            for(int j = 0 ; j < str.length(); j++) {
                if (str.charAt(0) == str.charAt(j)) {
                    count++;
                }
            }
            result += count + "" + str.charAt(0);
            str = str.replaceAll(str.substring(0,1), "");
        if(str.isEmpty()){ return result; }
        else return result += countLetters(str);
    }
}
