package exercise20;

public class GreatestCommonDivisor {
    public static void main(String Args[]){
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10){
            return -1;
        }
        int greatestCommonDiv = 0;
        for(int i=first; i>0; i--){
           if(((first % i) == 0) && ((second % i)==0)){
               greatestCommonDiv = i;
               break;
           }
        }
        return greatestCommonDiv;
    }
}
