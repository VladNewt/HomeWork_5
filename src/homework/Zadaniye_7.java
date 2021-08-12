package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Zadaniye_7 {
    public static void main(String[] args) {

        int size = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            char oneSimbol = sc.next().charAt(0);

            char[] simbols = new char[size];

            char[] newArray = Arrays.copyOf(simbols,simbols.length+1);

            newArray[newArray.length-1] = oneSimbol;

            if (oneSimbol=='/') {
                System.out.println("Программа завершена");
                for (char ch : simbols) {
                    System.out.println(ch);
                }
                break;
            }


        }


    }
}
