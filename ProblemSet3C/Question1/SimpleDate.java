package ProblemSet3C.Question1;

public class SimpleDate implements Date {

    private int month;
    private int day;
    private int year;

    private boolean isLeapYear;

    public SimpleDate(int day, int month, int year){
        if (!isValuesValid(day, month, year)){
            throw new IllegalArgumentException();
        }
        this.isLeapYear = isLeapYearCalculate(year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean isValuesValid(int day, int month, int year){
        if (isYearValid(year) == true && isMonthValid(month) == true && isDayValid(day, month, year) == true) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isYearValid(int year) {
        if (year <= 2100 && year >= 1583) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMonthValid(int month){
        if (month <= 12 && month >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDayValid(int day, int month, int year){
        if (month == 2) {
            if (isLeapYearCalculate(year)) {
                return day >= 1 && day <= 29;
            } else {
                return day >= 1 && day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            return day >= 1 && day <= 30;
        } else {
            return day >= 1 && day <= 31;
        }
    }

    public int daysInMonth(int month, int year){
        int[] array = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

         if (isLeapYearCalculate(year) == true && month == 2){
            return array[month] + 1;
        } else{
            return array[month];
         }
    }

    public boolean isLeapYearCalculate( int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        SimpleDate that = (SimpleDate) o;
        return getMonth() == that.getMonth() && getDay() == that.getDay() && getYear() == that.getYear() && isLeapYear() == that.isLeapYear();
    }

    @Override
    public int hashCode() {
        int result = getMonth();
        result = 31 * result + getDay();
        result = 31 * result + getYear();
        result = 31 * result + Boolean.hashCode(isLeapYear());
        return result;
    }

    @Override
    public int getDay() {
        return this.day;
    }

    @Override
    public int getMonth() {
        return this.month;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public boolean isLeapYear() {
        return this.isLeapYear;
    }
}
