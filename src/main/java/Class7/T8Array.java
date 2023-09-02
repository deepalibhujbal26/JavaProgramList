package Class7;

public class T8Array {
    public static void main(String[] args) {

        int[] numbers = {20, 29, 48, 69, 60}; ///creating the array  print the even no
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
