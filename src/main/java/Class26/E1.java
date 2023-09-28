package Class26;

import java.util.HashMap;
import java.util.Map;

public class E1 {
    public static void main(String[] args) {

        Map <String ,Integer>students=new HashMap<>();
        students.put("Deepali",56);
        students.put("Ayesha",6);
        students.put("Abi",5);
        students.put("Ehab",52);
        students.put("Jamel",51);
        students.put("Tahmin",12);
        students.put("Ayesha",34);
        System.out.println(students);
        System.out.println(students.get("Ehab"));
        System.out.println(students.containsValue(12));
        System.out.println(students.keySet());
        for (String key :students.keySet()){
            System.out.println(key +" : "+students.get(key));

        }





    }
}
