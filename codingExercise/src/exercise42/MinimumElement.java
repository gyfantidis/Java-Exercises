package exercise42;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static void main(String Args[]){
        int count = readInteger();
        int[] array = readElements(count);
        int min = findMin(array);
        System.out.println("The array was : " + Arrays.toString(array));
        System.out.println("Minimum number of the array was : " + min);
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the count:");
        int count = scanner.nextInt();

        return count;

    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Give "+count + " numbers.");
        for(int i=0; i<count; i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i =0; i< array.length; i++){
            if(min> array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
