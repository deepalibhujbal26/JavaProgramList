package Class25;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);
        numbers.add(12);

        numbers.forEach(x-> System.out.println(x));

        numbers.add(2,45);
        System.out.println(numbers);
    }
}
