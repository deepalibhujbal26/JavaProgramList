package Class12;

import java.util.Scanner;

public class HW1PrimeTester {
    public static void main(String[] args) {

        HW1Prime obj = new HW1Prime();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=scanner.nextInt();
        boolean isPrime = obj.isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}