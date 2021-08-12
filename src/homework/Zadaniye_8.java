package homework;

import java.util.Arrays;
import java.util.Random;

public class Zadaniye_8 {
    public static void main(String[] args) {
        char[][] mass = new char[3][3];

        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (rnd.nextBoolean()) {
                    mass[i][j] = 'X';
                } else {
                    mass[i][j] = '0';
                }

            }
        }

        for (char[] s : mass) {
            System.out.println(Arrays.toString(s));
        }

    }
}
