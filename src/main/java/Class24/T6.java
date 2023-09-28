package Class24;

import java.util.ArrayList;

public class T6 {
    public static void main(String[] args) {
        /*
        create an arrayList of fruit then remove all the fruit which contains
        the letter a or ends with the letter e
         */

        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("kiwi");
        fruits.add("Strawberry");
        fruits.add("plum");



        System.out.println(fruits);
        fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruits);




    }
}
