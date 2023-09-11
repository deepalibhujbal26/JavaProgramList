package Class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE = 10;  // we cannot the change value of variable if we declare is as final
        //  Age=20;
        System.out.println(AGE);

    }
}

final class Parent {   ///we declare class as final as we cannot inherit to child class
    final void marry() { //we declare method as final, so we cannot override that method
        System.out.println("take our permission first");
    }
}

//class Child extends Parent {
//    void marry(){
    //    System.out.println("I want to marry someone else");
    // }
//}