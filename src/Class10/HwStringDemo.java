package Class10;

public class HwStringDemo {
    public static void main(String[] args) {
        String username = "deepalibhujbal26";
        String pwd = "abc@12345";
        String confirmPwd = "abc@12345";

        if (username.isEmpty() || pwd.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (pwd.length() < 8) {
            System.out.println("Password is too short");
        } else if (pwd.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!pwd.equals(confirmPwd)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your Username and Password has been Created");
        }
    }
}
