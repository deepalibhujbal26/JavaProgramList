package Class9;

public class HW3 {
    public static void main(String[] args) {
        int[][] number = {{10, 20, 30, 11},
                {40, 50, 60, 21},
                {70, 80, 90, 31}};

        System.out.println("Even Numbers from given 2D array");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    System.out.print(number[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
