package workspace;
import java.util.*;
public class zombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int dayCounter = 0, sum;
        do{
            sum = 0;
            System.out.println("Day " + dayCounter + " " + Arrays.toString(inhabitants));
            int size = 0;
            for(int i = 0; i < inhabitants.length; i++){
                if(i > 0 && i < 7){
                    if(inhabitants[i-1] == 0 || inhabitants[i+1] == 0){size++;}}
                else if(i == 0 || i == 7){
                    if(inhabitants[1]==0 && i == 0){size++;}
                    if(inhabitants[6]==0 && i == 7){size++;}
                }
            }

            int[] indexHalves = new int[size];
            int indexHalf = 0;
            for(int j = 0; j < inhabitants.length; j++){
                if(j > 0 && j < 7){
                    if(inhabitants[j-1] == 0 || inhabitants[j+1] == 0){indexHalves[indexHalf] = j; indexHalf++;}}
                else if(j == 0 || j == 7){
                    if(inhabitants[1]==0 && j == 0){indexHalves[indexHalf] = 0; indexHalf++;}
                    if(inhabitants[6]==0 && j == 7){indexHalves[indexHalf] = 7; indexHalf++;}
                }
            }

            for(int j = 0; j < indexHalves.length; j++){
                inhabitants[indexHalves[j]] /= 2;
            }

            for(int j = 0; j < inhabitants.length; j++){
                sum += inhabitants[j];
            }
            dayCounter++;
        }while(sum>0);
        System.out.println("Day " + dayCounter + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
