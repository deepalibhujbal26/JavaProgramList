package Class5;

import java.util.Scanner;

public class T2Operator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please thee enter Height in inches");
        double height=scanner.nextDouble();
        if(height<60){
            System.out.println("Short");
        }
        else if (height>=60&& height<72)
        {
            System.out.println("medium");
        }
        else
            System.out.println("tall");
        }

    }

