package workspace;

import java.util.Scanner;

public class CountLetterRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String result = "";
        for(int i = 0; i < str.length(); ){
            int count =0;
            for(int j = 0 ; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result += count + "" + str.charAt(i);
            str = str.replaceAll(str.substring(i, i+1), "");
        }
        return result;
    }
}
