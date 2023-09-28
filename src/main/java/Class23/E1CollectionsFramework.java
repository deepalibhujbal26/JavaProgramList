package Class23;


import java.util.Arrays;

public class E1CollectionsFramework {
    public static void main(String[] args) {
       String [] arr=new String[20]; //only 20 size of array can store init.
        arr[1]="Fahim";
        System.out.println(Arrays.toString(arr));
        //here we wasting the memory bcoz we are creating lots of space and storing one element only.


    }
}
