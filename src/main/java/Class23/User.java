package Class23;

public class User {

    private String name;
    private int age;
    private String userName;
    private String password;

    public User(String name, int age, String userName, String password) {
        /*this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password; */
        setAge(age);   //we are using set method value here
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
