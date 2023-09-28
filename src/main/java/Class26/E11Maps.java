package Class26;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.5);
        makeUp.put("Foundation", 90.5);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("Concealer", 35.5);

        //removeIf method in present in Set so we convert map into set using EntrySet
        //then we remove
       // makeUp.entrySet().removeIf(x->x.getKey().contains("a"));
        //makeUp.entrySet().removeIf(x->x.getValue()>20);
        makeUp.entrySet().removeIf(x->x.getKey().contains("a") && x.getValue()>30);
        System.out.println(makeUp);



    }
}
