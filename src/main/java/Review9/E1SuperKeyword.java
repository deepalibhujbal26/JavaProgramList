package Review9;

public class E1SuperKeyword {

    String name="james";
    int age=10;
    void print(){
        System.out.println("Hello world");
    }
    E1SuperKeyword(){
        System.out.println("Parent class Construtor");
    }

    E1SuperKeyword(String n){
        System.out.println("Parent class with paramters");
    }

}
class ChildSuper extends E1SuperKeyword{



    String name="John";
   // int age=20;
    void  print(){
        System.out.println("Hello java");
    }
    void test(){
        String name ="White";
        System.out.println(super.name); /// parent variable name is called using super
        System.out.println(this.name); //calling instance  variable name which is part of child
        System.out.println(name);
       // System.out.println(super.age);
    }
    public ChildSuper(){
     // System.out.println("Hello i am child constructor")
        super("name"); // parent const with paramter
    }



    void methodTest1(){
       super. print(); //calling parent class method using super
    }
}
class ParentTester {
    public static void main(String[] args) {
        ChildSuper c=new ChildSuper();
        //c.test();
        c.methodTest1();
    }
}