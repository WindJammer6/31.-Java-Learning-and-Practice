// ATTENTION 
// just edit this file
// you need not edit Main.java


import java.util.*;

public class IteratingExamples {

      // Testing the created function
      public static void main(String[] args) {

            ArrayList<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);
            intList.add(3);
            intList.add(4);
            intList.add(5);

            System.out.println(Act2ForEach(intList));
            // Test case inputs: (1, 2, 3, 4, 5)    Expected output: 15
      }

      public static int Act2ForEach(List<Integer> integers) {
            int sum = 0;

            // Insert code here to sum up input using an Iterator ...
            for (int i : integers){
                  sum = sum + i;
            }

            return sum;
      }
}
