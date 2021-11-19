package workspace;

import java.util.Scanner;

public class RemoveSubstring {
    public static String clean (String text ,String badWord) {
        int count = 0;
        //for(int i = 0; i <= text.length()-badWord.length(); i++){
            if(text.contains(badWord)){
                for(int j = 0; j <= text.length()-badWord.length(); j++) {
                    if (text.substring(j, j + badWord.length()).equalsIgnoreCase(badWord)) {
                        text = (text.substring(0, j) + text.substring(j + badWord.length()).trim()).trim();
                        j--;
                    }
                    count++;
                }
            }
        //}
        System.out.println(count);
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String badWord = in.nextLine();
        System.out.println(text.length() + " " + badWord.length());
        System.out.println(text + " without " + badWord);
        System.out.println(clean(text, badWord));
    }
}
