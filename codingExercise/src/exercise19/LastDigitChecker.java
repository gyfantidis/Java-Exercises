package exercise19;

public class LastDigitChecker {
    public static void main(String Args[]) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if ( (!isValid(firstNum)) || (!isValid(secondNum)) || (!isValid(thirdNum))) {
            return false;
        }

        int firstNumRightmostDigit = firstNum % 10;
        int secondNumRightmostDigit = secondNum % 10;
        int thirdNumRightmostDigit = thirdNum % 10;

        if ((firstNumRightmostDigit != secondNumRightmostDigit) && (firstNumRightmostDigit != thirdNumRightmostDigit)
                && (secondNumRightmostDigit != thirdNumRightmostDigit)) {
            return false;
        } else return true;

    }

    public static boolean isValid(int number){
        if (number< 10 || number >1000){
            return false;
        }else return true;
    }
}
