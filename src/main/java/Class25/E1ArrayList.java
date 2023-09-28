package Class25;

import java.util.ArrayList;

public class E1ArrayList {

    public static void main(String[] args) {

        int [] arr=new int[4];
        //Arraylist is class of collection framework which contains Integer class to store int data type
        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);
        numbers.add(12);
        System.out.println(numbers);
        //for (Integer a: numbers){
       //     System.out.println(a);
       // }

        //remove single element
        numbers.remove(1);
        System.out.println(numbers);
        //remove multiple elements
        numbers.removeIf(x->x>12);
       // numbers.removeIf(x->x>12);
        System.out.println(numbers);


    }

}
