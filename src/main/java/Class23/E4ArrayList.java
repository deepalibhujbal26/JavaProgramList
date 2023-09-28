package Class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Ace");
        arr.add("Habib");
        arr.add("Gulcan");
        System.out.println(arr.get(1)); // get method will use return index element prensert in list
        System.out.println(arr.isEmpty()); //return false when nothing in arraylist
        System.out.println(arr.contains("ace"));//return boolean if given string is present
        System.out.println(arr.indexOf("Habib")); //return the index value of given element
        System.out.println(arr.remove(0)); //remove the element
        System.out.println(arr.size()); //return the size o arraylist










    }
}
