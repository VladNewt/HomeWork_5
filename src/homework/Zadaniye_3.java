package homework;

import java.util.Arrays;
import java.util.Random;

public class Zadaniye_3 {
    public static void main(String[] args) {
        byte[] first = new byte[4];
        byte[] second = new byte[4];
        byte[] third = new byte[4];

        Arrays.fill(first, (byte) 0);
        Arrays.fill(second, (byte) 1);

        Random rd = new Random();
        for (int i = 0; i < third.length; i++) {
            third[i] = (byte) rd.nextInt(2);
        }

        System.out.println(Arrays.toString(third));

        if(Arrays.equals(third, first)) {
            System.out.println("ZERO");
        } else if(Arrays.equals(third, first)) {
            System.out.println("ONE");
        }
    }
}
