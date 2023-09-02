package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
        System.out.println("Please Enter your Gender F/M");
        char gender=scanner.next().charAt(0);

        if(gender=='F')
        {
            System.out.println("your gender is "+ gender);
        }
        else  if (gender=='M'){
            System.out.println("Your Gender is " + gender);
        }
        else {
            System.out.println("check what are you typing ");
        }
    }
}
