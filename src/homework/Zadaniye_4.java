package homework;

import java.util.Random;

public class Zadaniye_4 {
    public static void main(String[] args) {
        char[] simbols = new char[30];

        Random rnd = new Random();

        for (int i = 0; i < simbols.length; i++) {
            simbols[i] = (char)(rnd.nextInt(Character.MAX_VALUE));
        }

        for (char s : simbols) {
            System.out.println(s);
        }
    }
}
