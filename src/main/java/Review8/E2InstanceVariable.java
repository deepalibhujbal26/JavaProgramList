package Review8;

public class E2InstanceVariable {

    String name ;
    void printName(){
        System.out.println(name);
    }
    static void printInfo(){
     //   System.out.println(name); we cant access the instance variable in static
        System.out.println("hi");
    }

    public static void main(String[] args) {
        E2InstanceVariable obj=new E2InstanceVariable();
        printInfo();         //static method called
        obj.name="deepali";
        obj.printName();    // instance method called
    }
}
