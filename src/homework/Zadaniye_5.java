package homework;

import java.util.Arrays;
import java.util.Random;

public class Zadaniye_5 {
    public static void main(String[] args) {
        int[][]numb = new int[3][3];

        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numb[i][j] = rnd.nextInt(10);
            }
        }

        for (int[] i : numb) {
            System.out.println(Arrays.toString(i));
        }


        for (int i = 0; i < 3; i++) {
            int a = numb[i][2];
            for (int j = 2; j >= 0; j--) {
                if (j==0) {
                    numb[i][j]=a;
                } else {
                    numb[i][j] = numb[i][j - 1];
                }
            }
        }

        System.out.println("------------------------------");

        for (int[] t : numb) {
            System.out.println(Arrays.toString(t));
        }


    }
}
