package Class24;

import java.util.ArrayList;
/*
Create an arrayList of drinks call it. If any drink has letter “a”
or “e” replace the whole word with water.
 */

public class T3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("beer");
        drinks.add("Spirit");
        System.out.println(drinks);
        for (int i = 0; i < drinks.size(); i++) {

            String newDrink= drinks.get(i);
            if (newDrink.contains("a") || newDrink.contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }

    //OR
     /* if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                 drinks.set(i,"Water");
             }   */


}
