package Review2;

import java.util.Scanner;

public class E3IfElseStmt {
    public static void main(String[] args) {
      // int age=18;

        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter your age");
        int age=scanner.nextInt();
        if(age>=18)
        {
            System.out.println("HE should work");
        }
        else {
            System.out.println("he is not eligble to work");
        }
    }
}
