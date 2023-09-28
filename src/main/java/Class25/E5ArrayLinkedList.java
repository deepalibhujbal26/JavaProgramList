package Class25;

import java.util.ArrayList;

public class E5ArrayLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        //1695485434746-1695485537891
        long startingTime=System.currentTimeMillis();

        System.out.println(startingTime);
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(i); //shifting data is faster in linkedList compare to Arraylist

        }
        for (int i = 0; i <1000 ; i++) {
            System.out.println(numbers.get(100000));

        }
        long endTime=System.currentTimeMillis();

        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);


    }
}

