package exercise15;

public class NumberPalindrome {
    public static void main(String Args[]) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11221));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int newNumber = number;
        while (newNumber != 0) {
            reverse = reverse * 10;
            reverse = reverse + (newNumber % 10);

            newNumber = newNumber / 10;
            System.out.println("number: " + newNumber + " reverse: " + reverse);
        }
        if (number == reverse) {
            return true;
        } else return false;
    }
}
