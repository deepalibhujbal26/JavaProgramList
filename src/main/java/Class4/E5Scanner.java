package Class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the  2 number");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Enter the name");
        String name= input.next();

        System.out.println("Addition  "+(a+b));
        System.out.println("name is "+ name);
    }
}
