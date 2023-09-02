package Class9;

import java.util.Arrays;

public class E5TwoDimArray {
    public static void main(String[] args) {   //Print only Odd numbers

        int[][]numbers={{10,12,13,14},{21,22,23,24},{31,32,33,34}};

        int [] row=numbers[0];
      System.out.println(Arrays.toString(row));

        for(int i :row){
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }











    }
}
