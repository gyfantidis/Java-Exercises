package exercise43;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String Args[]){
        int[] array ={5,1,2,3,8};
        reverse(array);

    }

    private static void reverse(int[] array){
        int lastValue= array.length -1;
        int halfValue = array.length /2;
        System.out.println("Array = " + Arrays.toString(array));

        for (int i=0; i<halfValue; i++){
            int temp = array[i];
            array[i] = array[lastValue-i];
            array[lastValue-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
