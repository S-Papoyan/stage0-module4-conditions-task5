package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year == 2000 || year == 2004) {
            System.out.println("leap");
        }if (year == 1900) {
            System.out.println("not leap");
        }
    }
}
