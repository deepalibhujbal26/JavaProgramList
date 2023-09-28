package Class23;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList names=new ArrayList();

        names.add("Sajana");
        names.add("avis");
        names.add(10);
        names.add('F');

        System.out.println(" Size = "+ names.size());  //size returns size of arraylist
        System.out.println(names);
        names.remove(0);  //Remove the element from zero 0 index from arraylist.
        System.out.println("Size =  "+ names.size());  //size returns size of arraylist
        System.out.println(names);




    }

}
