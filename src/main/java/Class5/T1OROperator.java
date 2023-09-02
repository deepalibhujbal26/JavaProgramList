package Class5;

import java.util.Scanner;

public class T1OROperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String monthName=scanner.next();
        if(monthName.equalsIgnoreCase("March")||monthName.equalsIgnoreCase("April")||monthName.equalsIgnoreCase("May"))
        {
            System.out.println("Season is Spring");
        }
        else if(monthName.equalsIgnoreCase("June")||monthName.equalsIgnoreCase("July")||monthName.equalsIgnoreCase("August"))
        {
            System.out.println(" its Summer");
        }
        else if(monthName.equalsIgnoreCase("September")||monthName.equalsIgnoreCase("OCtober")||monthName.equalsIgnoreCase("Nov"))
        {
            System.out.println(" its Fall");
        }
        else if(monthName.equalsIgnoreCase("Dec")||monthName.equalsIgnoreCase("Jan")||monthName.equalsIgnoreCase("Feb"))
        {
            System.out.println("Its Winter");
        }
        else {
            System.out.println("its invalid month");
        }


    }
}
