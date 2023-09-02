package Class5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the time in 24 hr zone ");

        int time=scanner.nextInt();
        if(time>=1 && time<=11)
        {
            System.out.println("Its an Morning");
        }
        else if(time>=12 && time<=15){
            System.out.println("Its an Afternoon");
        }
        else if(time>=16 && time<=20){
            System.out.println("its an Evening");
        }
        else if(time>=21 && time <=24)
        {
            System.out.println("its night");
        }
        else {
            System.out.println("It Invalid timing format");
        }

    }
}
