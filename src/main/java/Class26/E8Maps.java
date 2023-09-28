package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class E8Maps {
    public static void main(String[] args) {

        LinkedList<ArrayList<Integer>>test=new LinkedList<>();
       // test.add(20);;  error its excepting array of an integer

        ArrayList<String >names=new ArrayList<>();
        names.add("Jamel");

        //test.add(20); //error
       // test.add(names); error we can add only arraylist of integer

        LinkedList<Integer>numbers=new LinkedList<>();
       // test.add(numbers); error beacaus its want arraylist of integer not linkedlist

        Map<String,Integer>map=new HashMap<>();
       // test.add(map); error its different data sttutro and tis

        ArrayList<Integer>n=new ArrayList<>();
        test.add(n);


    }
}
