package Class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Practice3Map {
    public static void main(String[] args) {
        Map<Integer, String> counties = new LinkedHashMap<>();
        counties.put(1, "India");
        counties.put(2, "USA");
        counties.put(3, "Canada");
        counties.put(4, "Russia");
        counties.put(5, "China");
        counties.put(6, "Japan");
        counties.put(7, "Brazil");

        //using foreach loop convert into set then print all key and values
        Set<Map.Entry<Integer,String>>name=counties.entrySet();
        for(Map.Entry<Integer,String> a :name){
            System.out.println(a.getKey()+" "+a.getValue());

        }







    }
}