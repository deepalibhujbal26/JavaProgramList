package Class16;

public class Cat1 {

   private String name;
   private String color;
   private int age;
   //private String breed;
 //  private String eyeColor;

   public Cat1(String name,String color,int age){
       this.name=name;
       this.color=color;
       this.age=age;
   }

  /* public Cat1(String breed ,String eyeColor){


       this.breed=breed;
       this.eyeColor=eyeColor;
   }
   */




   public void printInfo(){
       System.out.println("Cat details :");
       System.out.println("Cat Name :"+ name);
       System.out.println("Cat Color :"+ color);
       System.out.println("Cat Age :"+ age);
   }
}

