import java.util.ArrayList;
import java.util.List;

public class Sieve {

    public static void main(String[] args) {
        List<Integer> list = getPrimeNumbers(25);
        System.out.println(list);  // Expected Output: [2, 3, 5, 7, 11, 13, 17, 19, 23]
    }

    public static List<Integer> getPrimeNumbers(int n) {
        List<Integer> numberList = new ArrayList<>();

        // Sieve of Eratosthenes algorithm
        final int lim = n + 1; // inclusive
        int[] intArray = new int[lim - 2]; // exclude 1

        // Initialize array with numbers from 2 to lim
        for (int i = 2; i <= lim - 1; i++) {
            intArray[i - 2] = i;
        }

        int p = 2; // Start with the first prime number

        while (p * p <= lim) { // Corrected condition
            for (int i = p * p; i < lim; i += p) {
                intArray[i - 2] = 0; // Mark multiples as non-prime
            }

            // Find the next prime number
            do {
                p++;
            } while (p < lim && intArray[p - 2] == 0);
        }

        // Add non-zero numbers (primes) to the list
        for (int i = 0; i < lim - 2; i++) {
            if (intArray[i] != 0) {
                numberList.add(intArray[i]);
            }
        }

        return numberList;
    }
}
