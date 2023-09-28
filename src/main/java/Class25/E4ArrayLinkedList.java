package Class25;

import java.util.LinkedList;

public class E4ArrayLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();

        //1695485434746-1695485537891
        long startingTime=System.currentTimeMillis();

        System.out.println(startingTime);
        for (int i = 0; i <100000 ; i++) {
            numbers.add(0,i); //shfting data is faster in linkedList compare to Arraylist

        }
        long endTime=System.currentTimeMillis();

        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);


    }
}

