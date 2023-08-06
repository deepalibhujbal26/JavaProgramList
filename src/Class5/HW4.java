package Class5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the grade A/B/C/D/E");
        char grade= scanner.next().charAt(0);


        if(grade=='A')
        {
            System.out.println("Grade A-Excellent");
        }
      else  if(grade=='B')
        {
            System.out.println("Grade B- Good");
        }
       else if(grade=='C')
        {
            System.out.println("Grade C-Average");
        }
        else if(grade=='D')
        {
            System.out.println("Grade D- ok");
        }
      else  if(grade=='E')
        {
            System.out.println("Grade E- Bad ");
        }
      else  if(grade=='F')
        {
            System.out.println("Grade F-Fail");
        }
        else {
            System.out.println("It an invalid Grade");
        }







    }
}
