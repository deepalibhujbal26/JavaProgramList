package Class25;

import java.util.LinkedHashSet;

public class E3LinkedSets {
    public static void main(String[] args) {
        //Linked give us unique data with order
        LinkedHashSet<Integer>UniqueNumbers=new LinkedHashSet<>();
        UniqueNumbers.add(23);
        UniqueNumbers.add(30);
        UniqueNumbers.add(20);
        UniqueNumbers.add(23);
        UniqueNumbers.add(2);
        System.out.println(UniqueNumbers);

    }
}
