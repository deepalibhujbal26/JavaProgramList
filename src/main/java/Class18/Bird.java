package Class18;

/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define
printInfo methods as well create the object of each class and call the methods
 */
public class Bird {

    String name;
    int age;
    boolean canFly;
    String species;
    Bird(String name ,int age,boolean canFly,String species){
        this.name=name;
        this.age=age;
        this.canFly=canFly;
        this.species=species;

    }

}

class sparrow extends Bird {

    sparrow(String name ,int age,boolean canFly,String species){
        super( name , age, canFly,species);
    }

    void print(){
        System.out.println(name+" "+age+" "+canFly+" "+species);
    }
}

class parrot extends Bird {
    parrot(String name ,int age,boolean canFly,String species){
        super(name , age, canFly,species);

    }
    void print1(){
        System.out.println(name+" "+age+" "+canFly+" "+species);
    }
}
class task{
    public static void main(String[] args) {
        sparrow obj=new sparrow("chiau",12,true,"wild");
        obj.print();
        sparrow obj1=new sparrow("chimani",2,true,"wild animals");
        obj1.print();

    }
}
