package exercise18;

public class SharedDigit {
    public static void main(String Args[]) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {
            return false;
        }
        int firstFirst = firstNum % 10;
        int firstSecond = firstNum / 10;
        int secondFirst = secondNum % 10;
        int secondSecond = secondNum / 10;

        if ((firstFirst == secondFirst) || (firstFirst == secondSecond) || (firstSecond == secondFirst) || (firstSecond == secondSecond)) {
            return true;
        } else return false;
    }
}

