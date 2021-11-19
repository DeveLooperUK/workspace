package workspace;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
//    method isPalindrome checks the given String
//    and returns true if check is palindrome and false if it is not.
    public static boolean isPalindrome(String check) {
       check = check.replaceAll(" ", "").toLowerCase();
        String reversedCheck = "";
        for(int i = check.length()-1; i >= 0; i--){
            reversedCheck += check.charAt(i);
        }
        System.out.println("reversedCheck "+reversedCheck + "\ncheck " +check);
        if(reversedCheck.equals(check)){return true;}
        else return false;

    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
