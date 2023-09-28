package Class24;

import java.util.ArrayList;
/*
Create an ArrayList that will store 5 names into it.
• Find out whether the given ArrayList is empty or not?
• Check whether the specific name is present in an ArrayList or not?
• Find the size of your arrayList and print all values from that

 */

public class T1ArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Ayesha");
        names.add("Abi");
        names.add("Ehab");
        names.add("Guilia");
        names.add("Jamel");
        System.out.println(names);
        System.out.println("Check array list is empty or not : " + names.isEmpty());
        System.out.println("Check names is present in  : " + names.contains("Guilia"));
        System.out.println("Size of array list  : " + names.size());
        System.out.println("Value in array list   : "+names);
    }
}
