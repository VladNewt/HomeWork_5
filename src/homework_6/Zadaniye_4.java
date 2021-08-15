package homework_6;

public class Zadaniye_4 {
    public static void main(String[] args) {

        String str =
                "Падение Гипериона#Маракотова бездна#Молли Мун и волшебная "
                        +"книга гипноза#451 градус по Фаренгейту#Планета Ка-Пэкс#"
                        +"Цветы для Элджернона#Собачье сердце#Кукольных дел мастер#"
                        +"Пикник на обочине#Марсианские хроники#Понедельник начинается "
                +"в субботу#Марсианин#Трудно быть богом";
//
        String[] arr = str.split("#");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "*"+arr[i];
            System.out.println(arr[i]);
        }

    }
}
