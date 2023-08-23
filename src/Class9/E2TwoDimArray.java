package Class9;

import java.util.Arrays;

public class E2TwoDimArray {
    public static void main(String[] args) {
        //int [][] numbers={{}};

      // int [] row0={10,12,13,14};
      //  int [] row1={21,22,23,24};
      //  int [] row2={31,32,33,34};

        int[][]numbers={{10,12,13,14},{21,22,23,24},{31,32,33,34}};

          int[] row=numbers[0];   // return 1 d array
          System.out.println(Arrays.toString(row));
          int number=numbers[0][1];  // return single element from above row
          System.out.println(numbers[0][1]);
        System.out.println(number);




    }
}
