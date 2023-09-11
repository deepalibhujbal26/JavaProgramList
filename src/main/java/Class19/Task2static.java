package Class19;

public class Task2static {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each
    overloaded method with specific arguments and observe result.
     */

    static void printName(String firstName){
        System.out.println("First name is : "+firstName);
    }
    static void printName(String firstName,String lastName){
        System.out.println("First name is : "+firstName+" last name : "+ lastName);
    }
    static void printName(String firstName,String lastName,int age ){
        System.out.println("First name is : "+firstName+" last name : "+lastName+" Age is :"+age);
    }

    public static void main(String[] args) {
        printName("Deepali");
        printName("Deepali","Bhujbal");
        printName("Deepali ","bhujbal",32);
    }
}

