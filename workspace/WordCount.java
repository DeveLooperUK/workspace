package workspace;

import java.util.Scanner;

public class WordCount {
    // wordCount accepts String and returns how many words are in the given String
    public static int wordCount(String words) {
        // your code
        int count = 0;
        for(int i = 0; i < words.length(); i++){
            if(words.substring(i, i+1).equals(" ")){
                count++;
            }
        }
        return count + 1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
