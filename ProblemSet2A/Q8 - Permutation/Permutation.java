import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private final String in;
    private final List<String> a = new ArrayList<>();


    //////////////////
    // Constructors //
    //////////////////
    // The 1-arg Constructor
    // additional attribute if needed
    Permutation(String str){
        // System.out.println("Permutation 1-Arg Constructor");
        in = str;
    }

    // The 1-arg Constructor
    Permutation(int number){
        // complete this constructor correctly
        // System.out.println("Permutation 1-Arg Constructor");
        in = String.valueOf(number);
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public Permutation permute(){
        // calls the recursive function to produce the permuted sequence of 'in' and store in 'a', recursively
        permuteString(in, 0);
        return this;
    }

    /* complete this recursive function - this is one algorithm, you are free to explore others
     * permute s from position i is solved as follows
     *
     * n is the length of s
     * if i is equal to n, append s to a
     * else
     *   for index j from i to n-1 both values inclusive
     *       swap elements i and j of s and assign the result back to s
     *       permute s from position i+1
     *       swap elements i and j of s and assign the result back to s
     */
    private void permuteString(String s, int i){
        int n = s.length();
        if (i == n){
            a.add(s);
        }
        else{
            for (int j = i; j < n; j++){
                s = swap(s, i, j);
                permuteString(s, i+1);
                s = swap(s, i, j);
            }
        }
    }

    /* complete this function to swap the characters at position i and j of s
    and return a new string*/
    private String swap(String s, int i, int j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];

        charArray[i] = charArray[j];
        charArray[j] = temp;

        String newString = new String(charArray);

        return newString;
    }

    public List<String> getA(){
        return a;
    }
}
