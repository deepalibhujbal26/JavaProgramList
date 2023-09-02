package Class6;

import java.util.Scanner;

public class E11ScannerDOwhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input;
        do{
            System.out.println("Please enter your name and shut down program ");

            input=scanner.nextLine();
            System.out.println("You are great "+input);
        }
        while(!input.equalsIgnoreCase("shutdown"));
    }
}
