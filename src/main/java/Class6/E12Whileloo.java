package Class6;

import java.util.Scanner;

public class E12Whileloo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no and -1 to terminate program");

        int input=scanner.nextInt();
        System.out.println("you have entered"+input);
        while(input!=-1)
        {
            System.out.println("enter the no and -1 to terminate program");
            input=  scanner.nextInt();
            System.out.println(input);

        }
    }
}
