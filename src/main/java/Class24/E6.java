package Class24;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Milk");
        names.add("Banana");
        names.add("Coffee");
        names.add("Table");
        names.add("Tv");

        for(String x : names){
            System.out.println(x);
        }

        names.forEach(x-> System.out.println(x)); //lambada expersion to print list

        names.removeIf(y->y.contains("e"));  //lamba  expression remove elts which contains 'e'
        System.out.println(names);


    }
}
