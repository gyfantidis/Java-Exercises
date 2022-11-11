package exercise5;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        numOne = numOne * 1000;
        numTwo = numTwo * 1000;

        int firstNumber = (int)numOne;
        int secondNumber = (int)numTwo;

        if (firstNumber == secondNumber){
            return true;
        }else return false;
    }
}
