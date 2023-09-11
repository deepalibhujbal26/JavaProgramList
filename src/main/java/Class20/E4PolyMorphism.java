package Class20;

public class E4PolyMorphism {
    public static void main(String[] args) {
        Animal a=new Animal();
       Animal []arr={new Cat(),new Animal()};
        for (int i = 0; i <arr.length ; i++) {
            Animal obj=arr[i]; // arr[i].eat(); arr[i].sleep();
           obj.eat();
           obj.speak();
           obj.sleep();

        }

        /*
        with Enhance loop
        for(Animal obj1 : arr){
        obj1.eat();
        obj1.speak();
        obj1.sleep();
         */

            }

    }



