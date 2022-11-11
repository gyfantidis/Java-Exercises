package exercise26;

public class DiagonalStar {
    public static void main(String Args[]){
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(2);

    }

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i <= number; i++) {
                for (int k = 1; k <= number; k++) {
                    if ((i == 1) || (k == 1) || (i == number) || (k == number) || (k == i) || (k == (number - i + 1))) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println("");
            }
        }

    }
}
