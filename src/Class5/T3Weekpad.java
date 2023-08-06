package Class5;

import java.util.Scanner;

public class T3Weekpad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the day");
        int day=scanner.nextInt();

        if(day>=1 && day<=5)
        {
            System.out.println("its weekday");
        }
        else if (day==6 ||day==7){

            System.out.println("its weekend");
        }
        else {
            System.out.println("its invalid");
        }
    }
}
