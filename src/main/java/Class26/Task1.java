package Class26;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and its associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
      Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
         */
        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Facebook");
        building.put(4, "GooglePlus");
        building.put(5, "Syntax");
        building.put(1, "HP");
        building.put(7, "Apple");
        building.put(2, "Google");
        System.out.println(building);
        System.out.println(" Entries Size : " + building.size());
        System.out.println("Replace the value of key 4  : " + building.replace(4, "Microsoft"));
        System.out.println("Remove the key 7 : " + building.remove(7));
        System.out.println(" Updated building Map : " + building);


    }
}
