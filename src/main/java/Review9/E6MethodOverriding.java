package Review9;

public class E6MethodOverriding {
    void sleep(){
        System.out.println("animal sleep");

    }
    void speak(){
        System.out.println("Animal sepak");

    }


}
class Dog extends E6MethodOverriding {
    @Override
    void sleep() {   //we are overriding method of parent class  so child can have their own input
        System.out.println("Dog sleep 10 hrs");
    }

    @Override
    void speak() {  //we are overriding method of parent class  so child can have their own input
        System.out.println("Dogs say wuff wuff");
    }
}
class TesterDog{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sleep();
        d.speak();

        E6MethodOverriding obj=new Dog(); //type casting

    }
}
