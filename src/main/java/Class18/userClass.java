package Class18;
/*
Write program: User that has a constructor that initializes
instance variable name and mobile number. Create a subclass/child class
userInfo that will have user address variable and it also being initialized
through constructor call. Print users name,
 mobile number and address in userDetails method. Test your code.
 */

public class userClass {
    String name;
    int mobileNumber;

    public userClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class subClass extends userClass {
    private String userAddress;

    public subClass(String name, int mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    void userDetails() {

        System.out.println(super.name + " " + super.mobileNumber + " " + userAddress);
    }
}

class main {
    public static void main(String[] args) {
        subClass obj = new subClass("Deepali", 985656767, "Boston");
        obj.userDetails();
    }
}
