package Review6;

public class E1StringMethod {

    public static void main(String[] args) {

        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);
        //System.out.println(str1);
        System.out.println(word.isEmpty());

    }
}
