package ProblemSet1B.Question3;

import java.util.ArrayList;
import java.util.Collections;

public class TestBaseInteger {
    public static void main(String[] args) {

        // Test 1
        BaseInteger baseInteger1 = new BaseInteger( "1,1", 17);
        System.out.println(baseInteger1.getDecimalValue());
        System.out.println(baseInteger1.getDigitsString());
        System.out.println(baseInteger1);

        BaseInteger baseInteger2 = new BaseInteger( "1,1", 60);
        BaseInteger baseInteger3 = baseInteger1.add( baseInteger2 , 16);
        System.out.println(baseInteger3.getDigitsString()); // [4, 15]
        System.out.println(baseInteger3.getDecimalValue()); // 79


        ///////////////////////////////////////////////////////////////////////////////////


        // Test 2
        // Instantiate test1, decimal value 24
        BaseInteger test1 = new BaseInteger("2,4", 10);
        System.out.println("Test convertRepresentationToArray() and getDigitsString: ");
        System.out.println(test1.getDigitsString());
        System.out.println("Test setDecimalValue() and getDecimalValue(): ");
        System.out.println(test1.getDecimalValue());
        System.out.println("Test toString() "); System.out.println(test1);

        // Instantiate test2, decimal value 232 to test add()
        BaseInteger test2 = new BaseInteger("2,3,2", 10);
        // add test1 with test 2 without changing base, store this into a new
        // BaseInteger object ans1. ans1 should give you decimal value 256
        BaseInteger ans1 = test1.add(test2,10);
        System.out.println("Test add(), decimal value of ans1 is: ");
        System.out.println(ans1.getDecimalValue());

        // add test1 with test2 changing it to base 16, store this into a new
        // BaseInteger object ans2
        BaseInteger ans2 = test1.add(test2,16);
        System.out.println("Test add() and change base, ans2 is: ");
        System.out.println(ans2);

        // ans1 and ans2 will have the same decimal value, just that they are
        // represented by different bases.
        System.out.println((ans1.getDecimalValue() == ans2.getDecimalValue()));

        //Expected Output:
        // Test convertRepresentationToArray() and getDigitsString:
        // [2, 4]
        // Test setDecimalValue() and getDecimalValue():
        // 24
        // Test toString()
        // 2,4 Base 10
        // Test add(), decimal value of ans1 is:
        // 256
        // Test add() and change base, ans2 is:
        // 1,0,0 Base 16
        // true
    }

}
