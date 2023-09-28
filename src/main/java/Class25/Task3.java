package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String>city=new LinkedHashSet<>();
        city.add("Boston");
        city.add("Chicago");
        city.add("NewYork");
        city.add("Alaska");
        city.add("Washignton");
        city.add("Florida");
        city.add("Miami");
        city.add("Arlington");
        System.out.println(city);

        city.removeIf(x->x.toLowerCase().startsWith("A"));
        System.out.println(city);





    }
}
