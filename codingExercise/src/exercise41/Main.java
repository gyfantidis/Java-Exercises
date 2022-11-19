package exercise41;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int[] getIntegers(int capacity){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for(int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element "+i +" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }



    public static void main(String Args[]){

        int[] array = getIntegers(5);
        printArray(array);
        int[] newArray = sortIntegers(array);
        System.out.println("****************");
        printArray(newArray);



    }


}
