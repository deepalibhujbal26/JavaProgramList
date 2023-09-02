package Class12;

import java.util.Scanner;

public class Calculator {


        void add(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter first number");
            int num1=scanner.nextInt();
            System.out.println("Enter the Second Number");
            int num2=scanner.nextInt();
            int sum = num1+num2;
            System.out.println("Addition of these numbers are "+sum);
        }

        void substract(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter first number");
            int num1=scanner.nextInt();
            System.out.println("Enter the Second Number");
            int num2=scanner.nextInt();
            int sub = num1-num2;
            System.out.println("subtraction of these numbers are "+sub);
        }

        void multiply(int number1,int number2){
           // int number1=10;
            //int number2=20;
            System.out.println("Result of Multiplication "+number1*number2);
        }

    }

