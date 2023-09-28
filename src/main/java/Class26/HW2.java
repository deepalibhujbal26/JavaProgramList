package Class26;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW2 {
    /*
    Create a Map that will store Employee name and salary.
     Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {


        Map<String, Integer> Employee = new HashMap<>();
        Employee.put("Deepali",12000);
        Employee.put("John Smith",100000);
        Employee.put("Tina",4000);
        Employee.put("Aamna",22000);

        Integer max= Collections.max(Employee.values());
        System.out.println(max);

        Set<Map.Entry<String,Integer>>empDetails=Employee.entrySet();
        for(Map.Entry<String,Integer> a: empDetails){
            if(a.getValue()==max){
                System.out.println(a.getKey()+"=$"+a.getValue());
            }
        }



    }
}
