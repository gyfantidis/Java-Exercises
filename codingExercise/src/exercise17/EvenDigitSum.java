package exercise17;

public class EvenDigitSum {
    public static void main(String Args[]){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if (number <0){
            return -1;
        }

        int sum = 0;
        int num = 0;

        while(number!=0){
            num=number % 10;
            if((num % 2) == 0){
                sum = sum +num;
            }
            number = number / 10;
        }
        return sum;
    }
}
