package Class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Practica4MapForloop {
    public static void main(String[] args) {

        Map<Integer,String>names=new LinkedHashMap<>();
        names.put(21,"deepali");
        names.put(22,"Ayesha");
        names.put(23,"Guilia");
        names.put(24,"Tahmin");
        names.put(25,"Laura");
        names.put(26,"Madina");


        System.out.println(names);
        System.out.println(names.keySet());
        System.out.println(names.values());

        names.forEach((k,v)-> System.out.println(k));
        names.forEach((k,v)-> System.out.println(v));

        //
        Set<Map.Entry<Integer, String>> setNames=names.entrySet();
        for(Map.Entry<Integer,String>a:setNames){
            System.out.println(a.getKey()+" "+a.getValue());
        }


    }
}
