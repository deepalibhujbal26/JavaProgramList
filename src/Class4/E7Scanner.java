package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name");
        String firstName=scanner.nextLine();
        System.out.println("MY Full name is "+firstName);

        System.out.println("please enter your age");
        int age=scanner.nextInt();
        System.out.println("my age is"+age);

       // System.out.println("enter your email id");
      //  String emailI= scanner.nextLine();
      //  System.out.println("wait here");
      //  System.out.println("my email id is"+ emailI);
    }
}
