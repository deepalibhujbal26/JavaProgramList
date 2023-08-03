package Class4;
import java.util.Scanner;
public class H5Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter numbers of worked years");
        int numberOfWorkedYrs=scanner.nextInt();
        System.out.println("Enter the annual salary");
        double annualSalary=scanner.nextDouble();
        if(numberOfWorkedYrs>=5)
        {
            System.out.println("Employee is Eligble for bonus");
            if(annualSalary>=50000){
                System.out.println("Bonus will be 5000");
            }
            else {
                System.out.println("bonus will be 3000");
            }
        }
        else {
            System.out.println("You are not Eligble for bonus");
        }
    }
}
