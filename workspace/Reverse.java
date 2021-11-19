package workspace;

import java.util.Scanner;

public class Reverse {
    // The reverse method will reverse the given String
    // reverse("student") ==> "tneduts"
    public static String reverse(String input){
        String reversedInput = "";
       for(int i = input.length()-1; i >= 0; i--){
           reversedInput += input.charAt(i) + "";
       }
       return reversedInput;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

}
