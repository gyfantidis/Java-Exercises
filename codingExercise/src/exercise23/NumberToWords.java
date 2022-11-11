package exercise23;

public class NumberToWords {
    public static void main(String Args[]) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(1212));
        System.out.println(reverse(-121));
        System.out.println(reverse(1234));
        System.out.println(reverse(1));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        System.out.println("");
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int numberReverse = reverse(number);
        int revNumber = reverse(number);
        int numToString = 0;

        if (number == 0) {
            System.out.println("Zero");
        }

        while (numberReverse != 0) {
            numToString = numberReverse % 10;
            numberReverse = numberReverse / 10;

            switch (numToString) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;

            }
        }

        if (getDigitCount(number) != getDigitCount(revNumber)) {
            for (int i = getDigitCount(revNumber); i < getDigitCount(number); i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitsNumber = 0;
        while (number != 0) {
            number = number / 10;
            digitsNumber++;
        }
        return digitsNumber;

    }
}
