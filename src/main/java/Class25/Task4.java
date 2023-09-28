package Class25;

import java.util.HashSet;

public class Task4 {
    /*
    Create a Set that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
﻿
     */
    public static void main(String[] args) {
        Student a = new Student("Deepali", 1);
        Student a1 = new Student("Ritvi", 2);
        Student a2 = new Student("Supresh", 3);

        HashSet<Student> students = new HashSet<>();
        students.add(a);
        students.add(a1);
        students.add(a2);

        // for(Student s: students){
        //     System.out.println(s.getName());
        //  }
        //OR
        students.forEach(x -> System.out.println(x.getName()));


    }
}

