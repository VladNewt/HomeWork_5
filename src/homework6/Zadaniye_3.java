package homework6;

public class Zadaniye_3 {
    public static void main(String[] args) {
        String str = "Keep.calm.and.listen.to.ROCK";
        String[] arr = str.split(".");

        String newstr = str.join(" ",arr);

        System.out.println(newstr);
    }
}
