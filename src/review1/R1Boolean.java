package review1;

import java.util.Scanner;

public class R1Boolean {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the boolean value: ");
        boolean userInput=scanner.nextBoolean();
        if(userInput==true)
        {
            System.out.println("The value is true");
        }
        else
        {
            System.out.println("The value ia false");
        }
    }
}
