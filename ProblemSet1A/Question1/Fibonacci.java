// **ATTENTION**
// Edit just this file to submit your answer
// You need not edit the Main.java file 

public class Fibonacci{

    // Testing the created function
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
        // Test case inputs: 5    Expected outputs: 0, 1, 1, 2, 3
    }

    public static String fibonacci( int n ){
        int firstInt = 0;
        int secondInt = 1;

        String s = "";

        int counter = 0;
        while (counter < n){
            if (counter == 0){
                s = s + "0";
                counter = counter + 1;
            }

            else if (counter ==1){
                s = s + ",1";
                counter = counter + 1;
            }

            else{
                int nextInt = firstInt + secondInt;

                s = s + "," + nextInt;

                firstInt = secondInt;
                secondInt = nextInt;

                counter = counter + 1;
            }
        }

        return s;
    }
        
}