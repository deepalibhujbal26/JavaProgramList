package Class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {


        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.5);
        makeUp.put("Foundation", 90.5);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("Concealer", 35.5);
      //  makeUp.forEach((keys, value) -> System.out.println(keys + " " + value)); //return both keys and values
        // OR
        // makeUp.forEach((k,v)-> System.out.println(k+" "+ v));

       // makeUp.forEach((keys, value) -> System.out.println(keys)); //return  only all the keys
        //makeUp.forEach((keys, value) -> System.out.println(value));//return  only all the values

        //whenever you need more than one parameter you need out parentheses.
        //similarly if we want to have more than one line of code to have curly brackets
        makeUp.forEach((k, v) -> {
            if (k.contains("a")) {
                System.out.println(v);
            }
        });



    }
}