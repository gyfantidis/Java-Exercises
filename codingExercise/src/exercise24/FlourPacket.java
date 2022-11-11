package exercise24;

import java.sql.SQLOutput;

public class FlourPacket {
    public static void main(String Args[]) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        while ((goal >= 5) && (bigCount > 0)) {
            goal = goal - 5;
            bigCount--;
        }

        while ((goal > 0) && (smallCount > 0)) {
            goal = goal - 1;
            smallCount--;
        }


        if (goal == 0) {
            return true;
        } else return false;
    }
}
