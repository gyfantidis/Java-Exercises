package exercise27;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String Args[]) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double counter = 0;

        while (true) {
            System.out.println("");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum = sum + scanner.nextInt();
                counter++;
            } else {
                break;
            }
        }

       double avg = 0;
        //long avg2 = 0;
        if (counter > 0) {
            avg = (sum / counter) ;
        }

        avg=Math.round(avg);
        System.out.println("SUM = " + (int) sum + " AVG = " + (int) avg);


        scanner.close();
    }
}
