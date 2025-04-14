package ProblemSet1X;

public class Question3 {

    public static void main(String[] args) {

        System.out.println( termsRequired(0.9)); // 6
        // Execute the function with your own test cases

    }

    static int termsRequired(double p){
        double total = 0;
        int i = 1;
        while (total < ((p * (Math.PI * Math.PI)) / 6)){
            total = total + (1.0 / (i * i));
            i = i + 1;
        }

        return i-1;
    }
}
