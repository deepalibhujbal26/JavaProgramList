package Class10;

public class DogTester {

    public static void main(String[] args) {
        //Creating object from the Dog class
        Dog lunaobj=new Dog();
        lunaobj.name="Luna";
        lunaobj.gender='F';
        lunaobj.breed="Shiba";
        lunaobj.weight=10;
        lunaobj.age=8;
        System.out.println(lunaobj.name);
        System.out.println(lunaobj.age);
        System.out.println(lunaobj.gender);


        lunaobj.eat();
        lunaobj.bark();
        lunaobj.sleep();


    }
}
