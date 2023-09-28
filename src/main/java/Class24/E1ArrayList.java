package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String >names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");
       // names.remove(0);  remove by index
       names.remove("Deepali");  //remove by object name

        System.out.println(names);
        names.add(2,"Ehab"); //add ehab on index 2

        System.out.println(names);

        names.set(1,"Jamel");
        System.out.println(names);


    }
}
