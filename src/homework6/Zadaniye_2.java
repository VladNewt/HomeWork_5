package homework6;

import java.util.Random;

public class Zadaniye_2 {
    public static void main(String[] args) {

        String[] name = {"Ada","Janosh","Erih", "Richard", "Ralph", "John","Donald","Bjarne","Timothy","Alan"};
        String[] secondname = {"King","Janos","Steven","Larry","Douglas","Matthew","Ervin","Wayne","John","Mathison"};
        String[] sourname = {"Lovelace","Neumann","Gamma", "Helm", "Johnson", "Vlissides","Knuth","Stroustrup","Berners-Lee","Turing"};

        Random rnd = new Random();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            str.append(i+1 + " " + name[rnd.nextInt(10)] + " " + secondname[rnd.nextInt(10)] + " " + sourname[rnd.nextInt(10)] + '\n');
        }

        System.out.println(str);
    }




}
