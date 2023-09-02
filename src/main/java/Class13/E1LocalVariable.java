package Class13;

public class E1LocalVariable {
    String country="USA";
    public static void main(String[] args) {

        String name="Java";  //localvar inside main

        if(10>5){
            int age=7; /// inside if block age variable
            System.out.println("Java");
        }
        //System.out.println(age);   not able to used age variable outside the class called local var
        //Local variable only used inside the block of code where they are declared.
        System.out.println(name);
       // System.out.println(country);


    }
}
