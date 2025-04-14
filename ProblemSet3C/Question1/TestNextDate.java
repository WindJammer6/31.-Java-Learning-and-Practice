package ProblemSet3C.Question1;

public class TestNextDate {

    public static void main(String[] args) {

        Date dec312022 = new SimpleDate(31, 12, 2022);
        System.out.println(dec312022.getDay());
        System.out.println(dec312022.getMonth());
        System.out.println(dec312022.getYear());
        System.out.println(dec312022.isLeapYear());
        System.out.println(NextDate.nextDate(dec312022)); // 01-01-2023

        Date feb282022 = new SimpleDate(28, 02, 2022);
        System.out.println(NextDate.nextDate(feb282022)); // 01-03-2023
    }
}
