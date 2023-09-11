package Class18;

public class Shape {
     float radius=3;
     void  printParent(){
         System.out.println("this is method of parent class");
     }

}
class circle extends Shape{

    void area(){
        double area=radius*radius*Math.PI;
        System.out.println("Area of circle : " + area);
      super.printParent();
    }

}
class test{
    public static void main(String[] args) {
        circle obj=new circle();
        obj.area();

    }
}
