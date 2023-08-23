package Class9;

public class E7TwoDimArray {
    public static void main(String[] args) {

        int[][] numbers = {{10, 20, 30, 40},
                           {15, 30, 35, 45},
                           {16, 20, 32, 22}};

        int sum = 0;

        for (int row = 0; row < 4; row++) {
            System.out.println(numbers[1][row]); //  first row constant only col is change {15,30,35,45}
            System.out.println(numbers[row][0]); //   {10,15,16}

            System.out.println(numbers[row][2]); //Row 000 col 2 ans is


        }
    }

}

