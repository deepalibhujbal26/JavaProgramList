package Class7;

public class T9Array {
    public static void main(String[] args) {

        int[] numbers = {20, 10, 50, 30, 40}; ///creating the array
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
        }
    }

