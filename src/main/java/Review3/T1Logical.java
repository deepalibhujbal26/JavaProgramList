package Review3;

import java.util.Scanner;

public class T1Logical {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first boolean value");
        boolean value1=scanner.nextBoolean();
        System.out.println("Enter the second boolean value");
        boolean value2=scanner.nextBoolean();

        if(value1&& value2) {
            System.out.println("both value are true.");
        }
        else {
            System.out.println("both values are false.");
        }

    }
}
