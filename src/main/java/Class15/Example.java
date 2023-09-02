package Class15;

public class Example {

    private String name;

    public Example(){

        System.out.println("First Constructor with no parameters ");
    }
    public Example(String cName){
        name=cName;
        System.out.println("Second Constructor with one parameters : " + name);
    }


}
