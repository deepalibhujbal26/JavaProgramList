package Class18;
class Grandpa{
    String color="White";
}

public class Furniture extends Grandpa{
    String color="Black";
}
class Chair extends Furniture{
    String color="Brown";
    void printColor(){
        String color ="blue";
        System.out.println(super.color); //calling parent class variable color =white
        System.out.println(this.color); //calling instance variable color=brown
        System.out.println(color);//calling local variable color=blue
    }

}
class FurnitureTester{
    public static void main(String[] args) {
        Chair obj=new Chair();
        obj.printColor();
    }
}