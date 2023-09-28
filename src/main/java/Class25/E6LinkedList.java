package Class25;

import java.util.LinkedList;

public class E6LinkedList {
    public static void main(String[] args) {
        LinkedList <Dog>dogs=new LinkedList<>();
        dogs.add(new Dog("Jacky","Persian"));
        dogs.add(new Dog("Jim","German"));
        dogs.add(new Dog("Jacky","Persian"));

        Dog d=dogs.get(2);//getting object store inside index 2 .and store in d variable
        d.printInfo(); //then printInfo method is called using that variable d.




    }
}
class Dog {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name + " " + breed + " ");
    }
}