package Class24;

import java.util.ArrayList;

public class T2ArrayListCar {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Toyota");
        names.add("BMW");
        names.add("Tesla");
        names.add("Range Rover");

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        System.out.println("******* Using Enhance loop way to print all elements  ******");


        for(String a : names){
            System.out.println(a);

        }
        System.out.println("*******2nd way using while loop to print all elements  ******");

        int i=0;
        while(i<names.size()){
            System.out.println(names.get(i));
            i++;
        }

    }
}
