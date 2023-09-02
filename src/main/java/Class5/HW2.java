package Class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score of Quiz out of 100");
        int quiz=scanner.nextInt();
        System.out.println("Enter the score of Mid Term out of 100");
        int midTerm=scanner.nextInt();
        System.out.println("Enter the score of Final Score out of 100");
        int finalScore=scanner.nextInt();

        int avgScore=(quiz+midTerm+finalScore)/3;
        System.out.println("The Avg Score is "+avgScore);

        if(avgScore>=90)
        {
            System.out.println("Grade : A");
        }
        else if(avgScore>=70 && avgScore<90)
        {
            System.out.println("Grade : B");
        }
        else if (avgScore>=50 && avgScore<70)
        {
            System.out.println("Grade : C");
        }
        else if(avgScore<50)
        {
            System.out.println("Grade : F");
        }
        else {
            System.out.println("its Invalid data");
        }

    }


}
