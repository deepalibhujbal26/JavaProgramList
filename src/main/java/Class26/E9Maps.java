package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class E9Maps {
    public static void main(String[] args) {
        //<String> it store the object of string class inside this set
        LinkedList<ArrayList<Integer>> test=new LinkedList<>();
        ArrayList<String> names=new ArrayList<>();
        names.add("Jamel");
        // test.add(20) // error
        // test.add(names)
        LinkedList<Integer> numbers=new LinkedList<>();
        // test.add(numbers)
        Map<String,Integer> map=new HashMap<>();
        // test.add(map) error
        ArrayList<Integer> n=new ArrayList<>();
        test.add(n);

    }
}
