import java.util.Scanner;

class replit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean userAns = scanner.nextBoolean();
        String eligibility = "Unknown";
        if (userAns == true) {
            System.out.println("What is your credit score?");
            double creditScore = scanner.nextDouble();
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore < 800) {
                eligibility = "Eligible";
            } else if (creditScore > 800) {
                eligibility = "Definitely eligible";
            }

        } else {
            System.out.println("The eligibility is " + eligibility);
        }

    }
}