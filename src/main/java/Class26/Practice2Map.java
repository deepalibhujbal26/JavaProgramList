package Class26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Practice2Map {
    public static void main(String[] args) {
        Map<Integer,String>counties=new HashMap<>();
        counties.put(1,"India");
        counties.put(2,"USA");
        counties.put(3,"Canada");
        counties.put(4,"Russia");
        counties.put(5,"China");
        counties.put(6,"Japan");
        counties.put(7,"Brazil");

        //System.out.println(counties);
        System.out.println("Remove who keys 2 "+counties.remove(2));
        System.out.println(counties);
        counties.put(6,"New Japan");
        System.out.println(counties);
        System.out.println("Contains value CHina "+counties.containsValue("China"));

        //print only key
        Collection<Integer>keyID=counties.keySet();
        System.out.println(keyID);

        //print only values
        Collection<String>values= counties.values();
        System.out.println(values);


    }
}
