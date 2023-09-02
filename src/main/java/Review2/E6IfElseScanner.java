package Review2;

import java.util.Scanner;

public class E6IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scanner.nextInt();

        if(age==60){
            System.out.println("you will get 20% discount");
        }
        if(age==50){

            System.out.println("you will get 15% discount");
        }
        if(age==40)
        {
            System.out.println("you will get 10% discount");
        }
        else {
            System.out.println("no discount");
        }

    }
}
