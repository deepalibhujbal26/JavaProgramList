package Review2;

import java.util.Scanner;

public class E7NESTEDIF {
    public static void main(String[] args) {

        //String day="Sunday";
       // double accountBalance=5000;
        // == equals() !equals() for not equal to

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your day");
        String day=scanner.next(); //

        System.out.println("please enter your balance");
        double accountBalance=scanner.nextDouble();

        if(day.equals("Sunday")){
            System.out.println("its sunday");
            if(accountBalance>2000){

                System.out.println("we can buy this");
            }
            else {
                System.out.println("its too expensive");
            }
          //  System.out.println("Its sunday");

        }
        else {
            System.out.println("let wait for sunday");
        }


    }
}
