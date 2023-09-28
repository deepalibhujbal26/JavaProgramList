package Class21;

public  abstract class  Animal {

    abstract void  speak();

   abstract void  sleep();
    abstract void eat();
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Wuff Wufff");
    }
    @Override
    void sleep(){
        System.out.println("Sleeoing for 10 hrs");

    }
    void eat(){
        System.out.println("Eating bonessss.........");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
       // super.speak();
        System.out.println("Meow Meow");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hrs");
    }

    @Override
    void eat() {
        System.out.println("like to eat fish");
    }
}
