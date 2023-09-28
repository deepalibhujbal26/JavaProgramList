package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //we can store all duplicate value
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        //Hashset remove the duplicate values from set
        HashSet<Integer> uniqNumbers = new HashSet<>();
        uniqNumbers.add(10);
        uniqNumbers.add(20);
        uniqNumbers.add(10);
        uniqNumbers.add(10);
        System.out.println(uniqNumbers);

    }

}

