package Class18;

public class GrandParent {
    public GrandParent(){
        System.out.println("Grandpa");
    }

}
class Parent extends GrandParent{
    Parent(){
        System.out.println("Parent");
    }
}
class child extends Parent{
    child(){
        System.out.println("Children");
    }
}
class Tester{
    public static void main(String[] args) {
        child c= new child();

    }
}