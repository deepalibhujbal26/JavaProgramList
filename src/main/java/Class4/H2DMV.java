package Class4;

import java.util.Scanner;

public class H2DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease Enter your age");
        int age=scanner.nextInt();
        if(age>=18)
        {
            System.out.println("We are able to issue the driving licence");
        }
        else
        {
            System.out.println("we can offer you learners permit");
        }

    }
}
