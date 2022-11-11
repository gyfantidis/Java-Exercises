package exercise10;

public class IntEqualityPrinter {
    public static void main(String Args[]){
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int parameter1, int parameter2, int parameter3){
        if (parameter1<0 || parameter2<0 || parameter3<0){
            System.out.println("Invalid Value");
        }
        else{
            if ((parameter1==parameter2) && (parameter1==parameter3)){
                System.out.println("All numbers are equal");
            }
            else if ((parameter1==parameter2) || (parameter2==parameter3) || (parameter1==parameter3)){
                System.out.println("Neither all are equal or different");
            }
            else {
                System.out.println("All numbers are different");
            }
        }
    }
}
