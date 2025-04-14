package ProblemSet1X;

public class Question4 {

    public static void main(String[] args) {

        System.out.println( binaryToDecimal("1011")); // 11
        System.out.println( binaryToDecimal("0")); // 0
        //execute your function with your own test cases

    }

    // Converting a data from one datatype to another is not as straight forward in Java compared
    // to in Python. According to this tutorial, here are some ways to convert a 'char' datatype
    // to 'int' datatype:
    // (link: https://www.geeksforgeeks.org/java-program-to-convert-char-to-int/ (GeeksforGeeks)
    // 1. Using ASCII Values
    // 2. Using String.valueOf() Method
    // 3. Using Character.getNumericValue() Method
    static int charToIntConverter( Character c){
        // Using the '3. Using Character.getNumericValue() Method'
        int i = Character.getNumericValue(c);
        return i;
    }

    static int binaryToDecimal( String s){
        int total = 0;
        int largestListIndex = s.length() - 1;

        // Iterating through an array/a range of numbers in reverse
        for (int i = 0; i < s.length(); i++){
            char charAtIndex = s.charAt(i);
            int j = charToIntConverter(charAtIndex);

            double newTermDouble = j * Math.pow(2, largestListIndex - i);
            int newTermInteger = (int) newTermDouble;

            total = total + (j * newTermInteger);
        }
        return total;
    }
}
