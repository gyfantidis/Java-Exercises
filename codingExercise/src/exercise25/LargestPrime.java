package exercise25;

public class LargestPrime {
    public static void main(String Args[]) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <=1 ) {
            return -1;
        }

        int maxPrime = -1;
        boolean check = true;

        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                for (int k = 2; k < i; k++) {
                    if ((i % k) == 0) {
                        check = false;
                    }

                }
                if (check) {
                    maxPrime = i;
                    check = true;
                }
            }
        }
        return maxPrime;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
