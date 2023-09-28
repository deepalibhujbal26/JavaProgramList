package Class23;
/*
Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within
its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length
larger than 6 characters. Also valid password cannot contain userName.
 */

public class Register {
    private String userName;
    private String password;
    private String emailId;

    public Register(String userName, String password, String emailId) {
        setEmailId(emailId);
        setUserName(userName);
        setPassword(password);
    }

    public void setUserName(String userName) {

        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;

        } else {

            System.out.println("Field should not be empty and field not less than 6");
        }
    }

    public void setPassword(String password) {

        if (!password.isEmpty() && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("its should not be empty and not contain username");
        }
    }

    public void setEmailId(String emailId) {

        if (emailId.contains("yahoo")) {
            this.emailId = emailId;
        } else {
            System.out.println("not contain yahoo in email id ");
        }
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
}

