package Class5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter Second number");
        int b=scanner.nextInt();
        System.out.println("Enter the Operator");
        char op=scanner.next().charAt(0);

        if(op=='+')
        {
            System.out.println(a+b);
        }
        else if(op=='-'){
            System.out.println(a-b);
        }
        else if(op=='*')
        {
            System.out.println(a*b);
        }
        else if(op=='/')
        {
            System.out.println(a/b);
        }
        else {
            System.out.println("invalid");
        }





    }
}
