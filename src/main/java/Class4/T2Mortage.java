package Class4;

public class T2Mortage {
    public static void main(String[] args) {

        double mortgageRate=2.5;
        double mortgagePrice=65000;

       if(mortgageRate>4.5){
           System.out.println("User will not buy house");
       }
       else {
           System.out.println("User will think of buying house");
           if(mortgagePrice>50000)
           {
               System.out.println("User will Take Loan");
           }
           else {
               System.out.println("User will pay in cash");
           }

       }


    }
}
