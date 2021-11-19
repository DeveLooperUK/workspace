package workspace;

import java.util.Scanner;

public class PrintEachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
