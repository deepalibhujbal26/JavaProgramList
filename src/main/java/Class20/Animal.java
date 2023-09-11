package Class20;

public class Animal {
    void speak() {
        System.out.println("Animals can speak");
    }

    void sleep() {
        System.out.println("Animal sleep");
    }

    void eat() {
        System.out.println("Animals eat");
    }

}

class Dog extends Animal {

    void speak() {
        System.out.println("Wuff Wuff");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }
}