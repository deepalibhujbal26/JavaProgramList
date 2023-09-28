package Class23;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration obj=new Registration("Deepali","abc@123","abc123@gmail.com");
      System.out.println(obj.getUserName());
      System.out.println(obj.getPassword());
      System.out.println(obj.getEmailId());

        System.out.println("CHeck the data");

        obj.setUserName("Ritu");
        obj.setPassword("prq@456");
        obj.setEmailId("pqr@gmail.com");
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());
        System.out.println(obj.getEmailId());
    }
}
