package Class9;

public class Hw2 {

    public static void main(String[] args) {
        int[][] number = {{10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + " ");
                sum = sum + number[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of All numbers is " + sum);
    }
}
