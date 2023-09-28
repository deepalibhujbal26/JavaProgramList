package Class25;

import java.util.HashSet;

public class E2Sets {
    public static void main(String[] args) {
        //Remove Duplicate but order can be different /RANDOM
        HashSet<String>fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Organge");
        fruits.add("Banana");
        fruits.add("Banana");
        System.out.println(fruits);
        //no duplicate no Insertion
        fruits.forEach(x-> System.out.println(x));

        //we can used Foreach no need of index
        for(String a: fruits){
            System.out.println(a);
        }
    }

}
