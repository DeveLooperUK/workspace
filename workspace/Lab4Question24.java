package workspace;

public class Lab4Question24 {
    public static void main(String[] args) {

        int[] x = {2,3,2,3,2};
        int a = 3;
        System.out.println(isEverywhere(x, a));
    }
    public static boolean isEverywhere(int[] arr, int number) {
        int evens = arr[0];
        int odds = arr[1];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && evens == arr[i]) {
                count1++;
            }
            if (i % 2 == 1 && odds == arr[i]) {
                count2++;
            }
        }

        if (count2 == arr.length/2 || (count1 == arr.length/2 || count1 == (arr.length/2 +1))) {
            return true;
        }
        else return false;

    }
}
