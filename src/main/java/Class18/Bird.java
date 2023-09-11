package Class18;

/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define
printInfo methods as well create the object of each class and call the methods
 */
public class Bird {

    private String name;
    private int age;
    private boolean canFly;
    private String species;

    Bird(String name, int age, boolean canFly, String species) {
        this.name = name;
        this.age = age;
        this.canFly = canFly;
        this.species = species;
    }

    void print() {
        System.out.println(name + " " + age + " " + canFly + " " + species);
    }
}

class sparrow extends Bird {
    sparrow(String name, int age, boolean canFly, String species) {
        super(name, age, canFly, species);
    }
}

class parrot extends Bird {
    parrot(String name, int age, boolean canFly, String species) {
        super(name, age, canFly, species);
    }
}

class task {
    public static void main(String[] args) {
        Bird obj = new Bird("chiau", 12, true, "wild");
        obj.print();
        parrot obj1 = new parrot("chimani", 2, true, "wild animals");
        obj1.print();

    }
}
