package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Zadaniye_7 {
    public static void main(String[] args) {

        int size = 0;
        char[] simbols = new char[size];

        while (true) {
            Scanner sc = new Scanner(System.in);
            char oneSimbol = sc.next().charAt(0);

            if (oneSimbol=='/') {
                System.out.println("Программа завершена");
                for (char ch : simbols) {
                    System.out.println(ch);
                }
                break;
            }

            simbols = Arrays.copyOf(simbols, simbols.length + 1);
            simbols[simbols.length-1] = oneSimbol;

            size++;

        }


    }
}
