package Class7;

public class Hw7 {
    public static void main(String[] args) {
        int[] numbers={11,22,34,24,51,17,80};
        int large=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>numbers[0])
            {
                large=numbers[i];
            }
        }
        System.out.println("largest value is "+ large);
    }
}
