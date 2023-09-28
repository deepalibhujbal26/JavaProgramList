package Class26;

import java.util.Map;
import java.util.TreeMap;

public class HW1 {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.
     */

    public static void main(String[] args) {
        Map<Integer, Person> PersonMap = new TreeMap<>();
        Person p1 = new Person("Deepali", "bhujbal", 32, 12000);
        Person p2 = new Person("Supresh", "Bhujbal", 28, 22000);
        Person p3 = new Person("Pushpa", "JAdhav", 30, 32000);


        PersonMap.put(1, p1);
        PersonMap.put(2, p2);
        PersonMap.put(3, p3);

      // PersonMap.forEach((k,v)-> System.out.println(k ));
      //PersonMap.forEach((k,v)->v.print());

      PersonMap.forEach((k,v)->{
          System.out.println("ID " + k);
          v.print();
      });





    }
}
