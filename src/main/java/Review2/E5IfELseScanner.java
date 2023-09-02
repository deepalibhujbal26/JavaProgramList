package Review2;

import java.util.Scanner;

public class E5IfELseScanner {
    public static void main(String[] args) {
        //
        // int age=56;
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();

        if(age>60)
        {
            System.out.println("you get 20% discount");
        }
        else if(age>50)
        {
            System.out.println("you get 15% discount");
        }
        else if (age>48){
            System.out.println("you get 10% discount");
        }
        else {
            System.out.println("no discount for you");
        }

    }
}
