package ProblemSet1X;

public class Question2 {

    public static void main(String[] args) {

        int a[] = {7, 10, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        System.out.println(sumUpTo(10)); // 55
        System.out.println( sumIntArrayAll(a) ); // 503
        System.out.println( sumIntArrayTwenty(a)); // 468
        System.out.println( countEvenNumbers(a)); // 6

    }
    static int sumUpTo( int n){
        int total = 0;
        for (int i = 1; i < n+1; i++){
            total = total + i;
        }
        return total;
    }

    static int sumIntArrayAll( int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total = total + array[i];
        }
        return total;
    }

    static int sumIntArrayTwenty( int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 20){
                total = total + array[i];
            }
        }
        return total;
    }

//    Check if negative number how Java handle modulus negative even numbers... is it =0 or sth else???
    static int countEvenNumbers(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                total = total + 1;
            }
        }
        return total;
    }
}
