package homework_7;

import java.util.SortedMap;

public class Zadaniye_1 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, doming delectus in has.\n" +
                "1. one 2. two 3. three\n" +
                "Vel alterum numquam vivendo ut, cu per prima clita quidam, no \n" +
                "duo quem omnesque voluptaria! Repudiare reformidans has ex, an \n" +
                "laudem omnesque est. Ius no audiam oporteat, ne pro fuisset \n" +
                "eleifend incorrupte. Ut nam choro semper lobortis, ei vide \n" +
                "nullam pri.";

        int numbers = 0;
        int letters = 0;
        int spaces = 0;
        int symbols = 0;

        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else if ("@#$%^&*()/|".indexOf(c) >= 0) {
                symbols++;
            }

        }

        System.out.println("Numbers = " + numbers);
        System.out.println("Letters = " + letters);
        System.out.println("Spaces = " + spaces);
        System.out.println("Symbols = " + symbols);

    }
}
