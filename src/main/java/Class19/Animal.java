package Class19;

public class Animal {
    private String name;
    private String color;
    private int age;
    int num = 10;  // public instance variable


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo() {
        System.out.print(name + " " + color + " " + age);
    }
}

class Dog extends Animal {

    double weight;

    public Dog(String name, String color, int age, double weight) {
        super(name, color, age); //calling parent class constructor.
        this.weight = weight;
    }

    public void printInfo() {
        // System.out.println(name+" "+color+" "+age);
        super.printInfo();
        System.out.print(" " + weight);
    }
}

