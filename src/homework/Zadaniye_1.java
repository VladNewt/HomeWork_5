package homework;

import java.util.Arrays;
import java.util.Random;

public class Zadaniye_1 {

    public static void main(String[] args) {
        int[] num = new int[100];
        Random rnd = new Random();
        Random logic = new Random();

        for (int i = 0; i < 100; i++) {
            if(logic.nextBoolean()) {
                num[i]=rnd.nextInt(30);
            } else {
                num[i]=(-1)*rnd.nextInt(30);
            }
            //System.out.println(num[i]);
        }

        System.out.println("Min num = " + Arrays.stream(num).min());
        System.out.println("Max num = " + Arrays.stream(num).max());

        //Находим сумму элементов массива
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum+num[i];
        }

        double mid = (double)(sum)/(double)(num.length);
        double midDown = Math.floor(mid);
        double midUp = Math.ceil(mid);

        System.out.println("Sum = " + sum);
        System.out.println("Abs(sum) = " + sum);
        System.out.printf("Middle = %.3f \n", mid);
        System.out.printf("MiddleDown = %.1f\n", midDown);
        System.out.printf("MiddleUp = %.1f", midUp);
    }
}
