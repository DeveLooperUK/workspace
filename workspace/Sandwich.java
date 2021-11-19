package workspace;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int indexFirst = 0;
        int indexLast = 0;
        String findWord = "bread";
        for(int i = 0; i <= str.length()-5; i++){
            if(str.substring(i, i+findWord.length()).equalsIgnoreCase(findWord)){
                indexLast = i;
            }
        }
        for(int i = str.length()-5; i >= 0; i--){
            if(str.substring(i, i+findWord.length()).equalsIgnoreCase(findWord)){
                indexFirst = i;
            }
        }
        if(indexLast > indexFirst + 5){ System.out.println(str.substring(indexFirst+findWord.length(), indexLast));}
        else System.out.println("nothing");
    }
}
