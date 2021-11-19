package workspace;

import java.util.Scanner;

public class Merge2Strings {
    public static String mergeStrings(String one, String two) {
        String mergedString = "";
        int longerLength = 0;
        if(one.length() > two.length()){ longerLength = one.length();}
        else longerLength = two.length();
        for(int i = 0; i < longerLength; i++){
            if(i < one.length()){ mergedString += one.substring(i, i+1) + "";}
            if(i < two.length()){ mergedString += two.substring(i, i+1) + "";}
        }
        return mergedString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings("12345","abcde"));//in.next(), in.next()
    }
}
