package Class26;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");
        names.add("deepali");

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


        ArrayList<ArrayList<String>>arrayLists=new ArrayList<>(); //nesting of arraylist
        arrayLists.add(names);
        System.out.println(arrayLists);




    }
}
