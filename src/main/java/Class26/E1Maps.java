package Class26;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        //Contains two key value

        //Number class in parent class of DOuble,int,float
        //if the key is already present , then it will override the value with latest data
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("kiwi",8.0);
        fruit.put("Apple",4.0); //it will override price  of apple key.
        System.out.println(fruit);
        System.out.println(fruit.size()); //find the size
        System.out.println(fruit.containsKey("Apple")); // return the boolean if present
        System.out.println(fruit.containsValue(4.0)); //return booleaan if present
        System.out.println(fruit.containsValue(44)); //return false value is not prsent
        System.out.println(fruit.isEmpty()); //check whether its emtpy or not





    }
}
