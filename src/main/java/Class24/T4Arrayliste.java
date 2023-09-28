package Class24;

import java.util.ArrayList;

public class T4Arrayliste {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Milk");
        names.add("Banana");
        names.add("COffeee");
        names.add("Table");
        names.add("Tv");

        System.out.println("Before " + names);

       /* for (int i = names.size() - 1; i > 0; i--) {  //for(int i=0; i<names.size();i++)

            String newNames = names.get(i);
            if (newNames.endsWith("e")) {
                names.remove(newNames);
                                                    //i--; after removing
            }
        } */


         /*names.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else {
                return  false;
            }
        }); */


        names.removeIf(x->x.endsWith("e"));  // Lambda Experssion


        System.out.println("After " + names);
    }
}
