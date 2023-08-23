package Class9;

public class E8TwoDimArray {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}
        };

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[1][i]+" ");  // first row constant col 0 1 2 = 15,30,35,45,20

        }
    }
}



