import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abca"));  // false
        // System.out.println(isPalindrome("racecar"));  // true
        // System.out.println(isPalindrome("madam"));  // true
        // System.out.println(isPalindrome(""));  // true
        // System.out.println(isPalindrome("a"));  // true
        System.out.println(factorial(5));  // 120
    }

    public static boolean isPalindrome( String s ){
        char[] charArray = s.toCharArray();

        if (charArray.length <= 1){
            return true;
        }

        if (charArray[0] == charArray[charArray.length-1]){
            char[] nextRecursionCharArray = Arrays.copyOfRange(charArray, 1, charArray.length-1);
            String nextRecursionString = new String(nextRecursionCharArray);
            return isPalindrome(nextRecursionString);
        }
        else
        {
            return false;
        }

    }

    public static int factorial( int n){
        if (n==0 || n == 1){
            return 1;
        } else{
            return (n * factorial(n-1));
        }
    }
}
