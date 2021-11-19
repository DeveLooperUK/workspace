package workspace;

import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }
    // uniqueChars is a method that will accept any String
    // and return the String without any duplicate characters
    // uniqueChars("mama") ==> "ma"
    // uniqueChars("spoon") ==> "spon"

    public static String uniqueChars(String str) {
        //TODO: write your code
        //String manipulatedString = String.valueOf(str.charAt(0));
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){ str = str.substring(0, j) + str.substring(j+1).replaceAll(str.substring(j,j+1),"");}
                }
        }
        return str;
    }
}
