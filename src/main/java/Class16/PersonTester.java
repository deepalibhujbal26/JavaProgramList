package Class16;

public class PersonTester {

    public static void main(String[] args) {
        Person p=new Person("Deepali",23,70,'F');
        p.printInfo();
        Person p1=new Person("Ayesha",34,65,'F',120000,"brown");
        p1.printInfo();
        Person p2=new Person("Ayesha",34,67);
        p2.printInfo();

    }
}
