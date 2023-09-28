package Class26;

import java.util.HashMap;
import java.util.Map;

public class Practica1Map {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<>();
        names.put("Deepali", 1);
        names.put("Ayesha", 12);
        names.put("Abi", 11);
        names.put("Jamel", 21);
        names.put("Guilia", 31);
        System.out.println(names); //print all
        names.forEach((k, v) -> System.out.println(k)); //print only keys

        //using for loop print all keys
        for (String a : names.keySet()) {
            System.out.println(a);
        }

        for (Integer a : names.values()) { //print all value
            System.out.println(a);
        }


    }
}
