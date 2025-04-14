// **ATTENTION**
// Edit just this file to submit your answer
// You need not edit the TestPset1.java file 

import java.util.Arrays;

public class Pset1 {
	public static boolean isAllCharacterUnique(String sIn) {
	  char[] myArray = sIn.toCharArray();
      int[] tempArray = new int[sIn.length()];

      for (int i = 0; i < myArray.length; i++){
          int ascii = myArray[i];

          for (int j = 0; j < i; j++){
              if (ascii == tempArray[j]){
                  return false;
              }
          }

          tempArray[i] = ascii;
      }
      return true;
	}
	public static boolean isPermutation(String sIn1, String sIn2) {
        char[] myArray1 = sIn1.toCharArray();
        char[] myArray2 = sIn2.toCharArray();

        int[] tempArray1 = new int[sIn1.length()];
        int[] tempArray2 = new int[sIn2.length()];

        for (int i = 0; i < sIn1.length(); i++){
            int ascii1 = myArray1[i];
            tempArray1[i] = ascii1;
        }

        for (int i = 0; i < sIn2.length(); i++){
            int ascii2 = myArray2[i];
            tempArray2[i] = ascii2;
        }

        // Sort the arrays
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        if (Arrays.equals(tempArray1, tempArray2) == true){
            return true;
        } else{
            return false;
        }
	}
}
