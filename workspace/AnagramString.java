package workspace;

import java.util.Locale;
import java.util.Scanner;

public class AnagramString {
    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase().replaceAll(" ", "");
        word2 = word2.toLowerCase().replaceAll(" ", "");
        if(word1.length() != word2.length()){return false;}
        String result1 = "" , result2 = "";
        for(int i = 0; i < word1.length(); ){
            int count1 = 0, count2 = 0;
            for(int j = 0 ; j < word1.length(); j++) {
                if(word1.charAt(i) == word1.charAt(j)) {
                    count1++;
                }
                if(word1.charAt(i) == word2.charAt(j)){
                    count2++;
                }
            }
            String wordPass = word1;
            result1 += count1 + "" + word1.charAt(i);
            result2 += count2 + "" + word1.charAt(i);
            word1 = word1.replaceAll(word1.substring(0, 1), "");
            word2 = word2.replaceAll(wordPass.substring(0, 1), "");

        }
        if(result1.equals(result2)){return true;}
        else return false;
    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
