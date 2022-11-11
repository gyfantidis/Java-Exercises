package exercise9;

public class minutesToYearDaysCalculator {
    public static void main (String Args[]){
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) minutes / 60;
            int days = hours / 24;
            int year = days / 365;
            int newDay = days % 365;

            System.out.println(minutes + " min = " + year + " y and " + newDay + " d");
        }
    }
}
