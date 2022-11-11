package exercise22;

public class PerfectNumber {
    public static void main(String Args[]){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int sum = 0;
        for(int i=(number/2); i>=1; i--){
            if((number % i) ==0){
                sum = sum + i;
            }
            //System.out.println("number: " +number+" i: "+i+" sum: "+sum);
        }
        if(sum == number){
            return true;
        }else return false;
    }
}
