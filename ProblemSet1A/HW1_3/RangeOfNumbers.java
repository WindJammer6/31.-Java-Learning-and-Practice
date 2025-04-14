import java.util.ArrayList;
import java.util.List;

public class RangeOfNumbers {

    public static void main(String[] args) {

        System.out.println( getRangeOfInts(0, 10, 1));
        System.out.println( getRangeOfInts(2, 10, 2));
        // Test Case:                       Expected:
        // getRangeOfInts( 2, 10, 1)        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // getRangeOfInts( 2, 10, 2)        [2, 4, 6, 8]
    }

    public static List<Integer> getRangeOfInts (int start, int end, int increment){

        List<Integer> outList = new ArrayList<>();
        for (int i = start; i < end; i+=increment){
            outList.add(i);
        }

        return outList;
    }

}
