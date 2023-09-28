package Class26;

import java.util.LinkedHashSet;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create the collection that will store single uniques Objects
        of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.

         */
        LinkedHashSet<String>names=new LinkedHashSet<>();
        names.add("I");
        names.add("Likes");
        names.add("to");
        names.add("Sleep");

       for(String a: names){
           System.out.print(a+" ");
       }

    }
}
