package Class9;

public class E3TwoDimArray {
    public static void main(String[] args) {

        int[][]numbers={{10,12,13,14},{21,22,23,24},{31,32,33,34}};

        for (int row = 0; row <numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length; col++) {     //we have to numbers[row]. to get COl
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();

        }




    }
}
