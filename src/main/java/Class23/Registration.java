package Class23;

public class Registration {

    private String userName;
    private String password;
    private String emailId;

    public Registration(String userName, String password, String emailId) {
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Please enter username");
        }
       if(userName.length()<6) {
           System.out.println("Length of username should be greater than 6");
        }
       else if (userName.length()>6){
           this.userName=userName;
       }
    }

    public void setPassword(String password) {

        if (!password.isEmpty()) {
            if (!password.contains(userName)) {
                this.password = password;
            }
        }
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
