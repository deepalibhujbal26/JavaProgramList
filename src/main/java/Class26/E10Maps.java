package Class26;

import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.5);
        makeUp.put("Foundation", 90.5);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("Concealer", 35.5);

      /*Set <Map .Entry<String,Double>>entries =makeUp.entrySet();
      for(Map.Entry<String,Double> e: entries) {
          System.out.println(e.getKey()+" "+e.getValue());
      } */

        //OR

        var entries = makeUp.entrySet(); //var will take care of
        for (var e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
