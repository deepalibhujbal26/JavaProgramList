package Class12;

import java.util.Scanner;

public class E1Method {

    //Method

    public static void main(String[] args) {
        takeUserInput();
        System.out.println("Enter the details");

    }


        static void takeUserInput(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your name");
            String name = scanner.nextLine();
            System.out.println("Please Enter your age");
            int age = scanner.nextInt();
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        }


    }

