package Class26;

import java.util.HashMap;
//using entryset Loop
//var
//lambda

public class Task4 {
    public static void main(String[] args) {

        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(235, "printer");
        bestBuy.put(25, "TV");
        bestBuy.put(4455, "Computer");
        bestBuy.put(2354, "Laptop");

       // bestBuy.forEach((k, v) -> System.out.println(k));
       // bestBuy.forEach((k, v) -> System.out.println(v));

        //OR
       /*Set<Map.Entry<Integer,String>> entries=bestBuy.entrySet();
        for(Map.Entry<Integer,String>e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        } */
        //OR
        var entry=bestBuy.entrySet();
        for(var a: entry ){
            System.out.println(a.getKey()+" "+ a.getValue());
        }

    }
}
