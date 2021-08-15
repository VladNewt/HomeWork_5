package homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Zadaniye_1 {

    public static void main(String[] args) {
        String[][] str = new String[0][];

        while (true) {
            Scanner sc = new Scanner(System.in);

            String inp = sc.nextLine();

            if(inp.equalsIgnoreCase("/end")) {
                for (String[] arr : str) {
                    System.out.println(Arrays.toString(arr));
                }
                break;
            }

            str = Arrays.copyOf(str, str.length+1);
            str[str.length-1] = inp.split(" ");
        }


    }
}
