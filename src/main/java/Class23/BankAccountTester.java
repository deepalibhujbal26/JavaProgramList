package Class23;

public class BankAccountTester {
    public static void main(String[] args) {


        BankAccount obj = new BankAccount("Marta",
                12588992,
                78623537,
                "User123",
                "Pass123",
                "Checking");
        System.out.println(obj.getName());
        System.out.println(obj.getBankAccountNumber());

        obj.setName("Shawn");
        System.out.println(obj.getName());






    }

}
