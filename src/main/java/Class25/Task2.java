package Class25;

import java.util.TreeSet;
/*
Create a Set in which you need to add names of the countries(10).
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.
     */


public class Task2 {
    public static void main(String[] args) {
        TreeSet<String>aList=new TreeSet<>();
        aList.add("Uganda");
        aList.add("Brazil");
        aList.add("India");
        aList.add("Canada");
        aList.add("America");
        aList.add("Iran");
        aList.add("Austrlia");
        aList.add("Zimbave");
        aList.add("France");
        System.out.println(aList);
        System.out.println();
        //loop
        for(String a: aList){
            System.out.println(a);
        }
        //lambda
        aList.forEach(x-> System.out.println(x));

    }
}
