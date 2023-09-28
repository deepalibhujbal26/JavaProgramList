package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
 Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("India", "Delhi");
        countries.put("USA", "Washigton");
        countries.put("SriLanka", "Colombo");
        countries.put("UK", "London");
        countries.put("Australia", "Sydney");

        System.out.println(countries);

        countries.forEach((k, v) -> System.out.print(k + " "));
        System.out.println();
        countries.forEach((k, v) -> System.out.print(v + " "));

    //using for each loop   OR  Set<Map.Entry<String,String>>aCountry we can us var aCountry=
        Set<Map.Entry<String,String>>aCountry=countries.entrySet();
        for(Map.Entry<String,String> a:aCountry){
            System.out.println(a.getKey()+" "+a.getValue());
        }


    }
}
