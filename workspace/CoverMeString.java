package workspace;

import java.util.Scanner;

public class CoverMeString {
// The coverString method will take 2 string parameters from the caller.
// Your job is to write an important code that will :
// to search and find each appearance of coverME within main
// then surround it with square brackets [coverMe]
// if you cannot find the coverME within main then just return whole main itself covered [main].
// keep in mind that coverME value can be of any length.
//    coverString("java methods", "me") ) ; ==> "java [me]thods"
//    coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
                for(int j = 0; j <= main.length()-coverME.length(); j++) {
                    if (main.substring(j, j + coverME.length()).equalsIgnoreCase(coverME)) {
                        main = main.substring(0, j) + "[" + main.substring(j, j + coverME.length()) + "]" + main.substring(j + coverME.length());
                        j += 2;
                    }
                }
        return main;
    }
}
