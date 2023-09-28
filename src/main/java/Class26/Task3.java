package Class26;

import java.util.TreeMap;

public class Task3 {
    /*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */
    public static void main(String[] args) {


        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("India", "Delhi");
        countries.put("USA", "Washigton");
        countries.put("SriLanka", "Colombo");
        countries.put("UK", "London");
        countries.put("Australia", "Sydney");
        countries.put("United states of Arab", "abuDhabi");

       // System.out.println(countries);
       // countries.forEach((k, v) -> System.out.print(k + " "));
       // System.out.println();
       // countries.forEach((k, v) -> System.out.print(v + " "));

        countries.forEach((k,v)-> {
            if(k.length()>5 && v.contains("a")){
                System.out.println(k +" "+ v );
            }
        });
    }
}
