package Review2;

import java.util.Scanner;

public class E8Scannerprogram {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your full name");
        String fName=scanner.nextLine();
        System.out.println("enter your city");
       // System.out.println("");
        String city=scanner.nextLine();
        System.out.println(fName+ " " +city);
    }
}
