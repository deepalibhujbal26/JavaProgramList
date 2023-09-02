package Class4;

public class T1Diploma {
    public static void main(String[] args) {
        boolean degree=false;
        double Gpa=3;

        if(degree==true)
        {
            System.out.println("Congratulation");
            if(Gpa>=3.5)
            {
                System.out.println("You are Eligible for Scholarship");
            }
            else {
                System.out.println("You Should have studied harder");
            }
        }
        else
        {
            System.out.println("You should have degree");
        }

    }
}
