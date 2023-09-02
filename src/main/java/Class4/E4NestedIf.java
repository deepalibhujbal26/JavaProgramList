package Class4;

public class E4NestedIf {
    public static void main(String[] args) {
        double accountBalance=70000;

        if(accountBalance>28000)
        {
            System.out.println("We can afford Normal TOYOTA");
            if(accountBalance>50000)
            {
                System.out.println("We can afford Luxury Car as well");
            }

        }
        else {
            System.out.println("WE need to save more");
        }
    }
}
