package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class E10 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        System.out.println(numbers);
        LinkedHashSet<Integer> set=new LinkedHashSet<>(numbers);
        System.out.println(set);

       // LinkedHashSet<Integer>a=new LinkedHashSet<>(numbers); //remove duplicate Order-Sequence
       // System.out.println(a);

       // TreeSet<Integer>t=new TreeSet<>(numbers);//remove duplicate order in low to high sequence SLOW process
       // System.out.println(t);

        numbers.clear();
        System.out.println(numbers);
        numbers.addAll(set);
        System.out.println(numbers);

    }
}
