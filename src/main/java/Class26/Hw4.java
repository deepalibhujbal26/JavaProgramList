package Class26;

import java.util.ArrayList;

public class Hw4 {
    public static void main(String[] args) {
        /*
        Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
         */

        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(21);
        number.add(10);
        number.add(23);
        number.add(3);
        number.add(50);
        number.add(10);
        number.add(12);
        int sum=0;
        for(Integer a: number){
            sum+=a;
        }
        System.out.println("Total of all integers : "+sum);
    }
}
