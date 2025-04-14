package ProblemSet1X;

import java.util.Arrays;

public class Question5 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};
        int[] b = middleArray(a);
        System.out.println(Arrays.toString(b));
        System.out.println(reverse("pikachu"));

    }

    static int[] middleArray(int[] a){
        if (a.length > 2){
            int[] newArray = new int[a.length-2];
            for (int i = 0; i < a.length - 2; i++){
                newArray[i] = a[i+1];
            }
            return newArray;

        } else if (a.length == 2){
            int[] emptyArray = new int[0];
            return emptyArray;
        } else{
            int[] emptyArrayTwo = new int[0];
            return emptyArrayTwo;
        }
    }

    static String reverse(String a){

        String r ="";

        char[] tempArray = a.toCharArray();

        for (int i = a.length() - 1; i >= 0; i--){
            r = r + tempArray[i];
        }

        return r;
    }

}

