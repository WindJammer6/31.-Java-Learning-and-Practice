package ProblemSet3C.Question1;

public class NextDate {

    public static Date nextDate(Date date){

        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        int tomorrowDay = day + 1;
        int tomorrowMonth = month;
        int tomorrowYear = year;

        // write code to take care of the various edge cases
        // you can use if-else or the switch structure
        switch (tomorrowDay) {
            case 29:
                switch (month) {
                    case 2:
                        if (!date.isLeapYear()) {
                            tomorrowDay = 1;
                            tomorrowMonth += 1;
                        }
                        break;
                    default:
                        // no change needed, already set to 29
                        break;
                }
                break;

            case 30:
                switch (month) {
                    case 2:
                        tomorrowDay = 1;
                        tomorrowMonth += 1;
                        break;
                    default:
                        // leave as 30
                        break;
                }
                break;

            case 31:
                switch (month) {
                    case 4: case 6: case 9: case 11:
                        tomorrowDay = 1;
                        tomorrowMonth += 1;
                        break;
                    default:
                        // leave as 31
                        break;
                }
                break;

            case 32:
                switch (month) {
                    case 12:
                        tomorrowDay = 1;
                        tomorrowMonth = 1;
                        tomorrowYear += 1;
                        break;
                    default:
                        tomorrowDay = 1;
                        tomorrowMonth += 1;
                        break;
                }
                break;
        }
  
        return new SimpleDate(tomorrowDay, tomorrowMonth, tomorrowYear);

    }
}
