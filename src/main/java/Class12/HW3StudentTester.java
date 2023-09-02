package Class12;

import java.util.Scanner;

public class HW3StudentTester {
    public static void main(String[] args) {


        HW3Student obj =new HW3Student();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Score");
        int score=scanner.nextInt();
        System.out.println("Grade is : " + obj.getGrade(score));
    }
}