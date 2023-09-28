package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Map {
    public static void main(String[] args) {

        ArrayList<Double> priceOfMakeup = new ArrayList<>();
        priceOfMakeup.add(25.5);
        priceOfMakeup.add(30.2);
        priceOfMakeup.add(25.2);

        ArrayList<Double> priceOfFruits = new ArrayList<>();
        priceOfFruits.add(2.5);
        priceOfFruits.add(3.99);
        priceOfFruits.add(4.99);

        ArrayList<Double> priceOfDairy = new ArrayList<>();
        priceOfDairy.add(1.99);
        priceOfDairy.add(2.99);
        priceOfDairy.add(3.99);

        Map<String, ArrayList<Double>> arrayListMap = new HashMap<>();
        arrayListMap.put("priceOfMakeup", priceOfMakeup);
        arrayListMap.put("priceOfFruits", priceOfFruits);
        arrayListMap.put("priceOfDairy", priceOfDairy);
        System.out.println(arrayListMap);
    }
}
