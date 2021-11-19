package workspace;

import java.util.Scanner;

public class TripleLetterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for(int i = 0; i < str.length()-2; i++){
            String findTriple = str.substring(i, i+1).repeat(3);//str.charAt(i)+""+str.charAt(i)+""+str.charAt(i);
            for(int j = i ; j < str.length()-2; j++) {
                // System.out.println("Searching "+"[index"+i+", "+findTriple+"]"+ " on where  " + str.substring(j, j+3)); // abcXXXabc
                if (str.substring(j, j+3).equals(findTriple)) {
                    count++;
                    // System.out.println("FOUND on index j= " + j);
                }
                // else System.out.println("NOT found on index " + j);
            }
            // System.out.println(str.substring(i, i+1) + " is removed from " + "["+str+"]");
            str = str.replaceAll(str.substring(i, i+1), " f");
            // System.out.println(str);
        }
        System.out.println(count);
    }
}
