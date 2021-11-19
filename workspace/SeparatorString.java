package workspace;

import java.util.Scanner;

public class SeparatorString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print(word);
            if(i < count-1){System.out.print(separator);}
        }
    }
}
