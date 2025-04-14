package ProblemSet1X;

public class Question1 {

    public static void main(String[] args) {

        System.out.println(addTime(6, 30, 4, 45));
        // Test Case:               Expected Output:
        // addTime(0, 20, 0, 30)    0 hours 50 minutes
        // addTime(0, 40, 0, 30)    1 hours 10 minutes
        // addTime(1, 30, 1, 31)    3 hours 1 minutes
        // addTime(6, 30, 4, 45)    11 hours 15 minutes

        System.out.println( isLeapYear(1600));
        // Test Case:         Expected Output:
        // isLeapYear(1600)   true
        // isLeapYear(1700)   false

        System.out.println( distance(3.0, 4.0));
        // Test Case:            Expected Output:
        // distance(3.0, 4.0)    5.0
    }

    static String addTime(int hour1, int min1, int hour2, int min2){
        int totalMin = min1 + min2;
        int totalHour = hour1 + hour2;

        if (totalMin >= 60){
            totalHour = totalHour + 1;
            totalMin = totalMin - 60;
        }

        if (totalHour >= 24){
            totalHour = totalHour - 24;
        }

        return String.format("%d hours %d minutes", totalHour, totalMin);
    }

    static boolean isLeapYear(int year){
        if (year % 4 == 0){

            if (year % 100 == 0){

                if (year % 400 == 0){
                    return true;
                } else{
                    return false;
                }

            } else{
                return true;
            }

        } else{
            return false;
        }
    }

    static double distance(double x, double y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
}