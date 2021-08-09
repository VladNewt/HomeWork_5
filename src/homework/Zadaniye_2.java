package homework;

import java.util.Arrays;

public class Zadaniye_2 {
    public static void main(String[] args) {
        int[] num = new int[16];

        for (int i = 15, j=0; i >= 0; i--,j++) {
            num[j] = (int) Math.pow(2, i);
        }

        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
