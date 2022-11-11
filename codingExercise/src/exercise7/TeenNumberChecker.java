package exercise7;

public class TeenNumberChecker {
    public static boolean hasTeen(int numA, int numB, int numC){

        if ((numA>=13 && numA<=19) || (numB>=13 && numB<=19) || (numC>=13 && numC<=19) ){
            return true;
        }else return false;

    }

    public static boolean isTeen(int number){
        if (number>=13 && number<=19){
            return true;
        }else return false;
    }
}
