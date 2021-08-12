package homework;

import java.util.Random;
import java.util.Scanner;

public class Zadaniye_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sd = sc.nextLine().split(" ");

        int amount = Integer.parseInt(sd[0]);
        int min = Integer.parseInt(sd[1]);
        int max = Integer.parseInt(sd[2]);

        int[] num = new int[amount];

        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rd.nextInt(max-min)+min;
        }

        for (int i : num) {
            System.out.println(i);
        }

    }
}
