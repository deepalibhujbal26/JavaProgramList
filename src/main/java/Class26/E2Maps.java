package Class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(1, "Adam");
        students.put(2, "Ehab");
        students.put(3, "Marta");
        students.put(4, "Ahmed");
        System.out.println(students);
        students.remove(3); //remove the value of key 3
        System.out.println(students);
        students.replace(2,"Jamel"); //replace the value of key 2 with new value as jamel
        System.out.println(students);






    }
}
