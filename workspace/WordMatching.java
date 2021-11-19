package workspace;

import java.util.Scanner;

public class WordMatching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = "java, javascript, python, c#, c++, rust, ruby python, swift";//scan.nextLine();
        String word1 = "java", word2 = "python";
        int count1 = 0, count2 = 0;
        boolean flag = false;
        for(int i = 0; i < sentence.length()-3; i++){
                if(sentence.substring(i, i+4).equals(word1)) {
                    count1++;
                }
        }
        for(int i = 0; i < sentence.length()-5; i++){
                if(sentence.substring(i, i+6).equals(word2)){
                    count2++;
                }
        }
        System.out.println(count1);
        System.out.println(count2);
        if(count1 == count2){
            flag = true;
            System.out.println(flag);
        }
        else System.out.println(flag);
    }
}
