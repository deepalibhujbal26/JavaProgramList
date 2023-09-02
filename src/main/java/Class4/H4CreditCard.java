package Class4;
import java.util.Scanner;
public class H4CreditCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("If You Have Credit Card Type 'Y' For Yes and 'N' for No");
        char value= scanner.next().charAt(0);
        if(value=='Y')
        {
            System.out.println("Please Enter the Balance of your Credit Card");
            double balance = scanner.nextDouble();
           if(balance>1000)
           {
               System.out.println(" pay off  immediately");
           }
           else {
               System.out.println("You can Spend more ");
           }
        }
        else  if (value=='N')
        {
            System.out.println("WE can offer you Credit card ");
        }
    }
}

