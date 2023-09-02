package Class12;

public class HW1Prime {

    //Write a method to return whether given number is prime or not?

    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    //System.out.println("number can be divided by " + i);
                    return false;
                }
                //System.out.println("Looping " + (i-1) + " times");
            }
        }

        return true;
    }
}



