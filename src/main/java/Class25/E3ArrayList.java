package Class25;

import java.util.LinkedList;

public class E3ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer>numbers=new LinkedList<>();
        numbers.add(20);
        numbers.add(2);
        numbers.add(26);
        numbers.add(45);
        numbers.add(8);

        numbers.remove(0);
        System.out.println(numbers);


        numbers.add(45);
        //Remove elements using lambda experssion which are greater than 15
        numbers.removeIf(x->x>15);
        System.out.println(numbers);

        numbers.add(2,67);
        System.out.println(numbers);




    }
}
