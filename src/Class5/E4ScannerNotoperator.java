package Class5;

import java.util.Scanner;

public class E4ScannerNotoperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Country");
        String country=scanner.nextLine();
       /* if(!country.equals("Iran"))
        {
            System.out.println("you are allowed");
        } */
        if(!country.equalsIgnoreCase("Iran"))
        {
            System.out.println("you are allowed");
        }
    }
}
