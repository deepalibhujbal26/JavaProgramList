package Class5;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter Second number");
        int b=scanner.nextInt();
        System.out.println("Enter the Operator");
        char op=scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println( a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid");
                break;
        }





    }
}
