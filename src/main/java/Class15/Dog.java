package Class15;

public class Dog {
  private   String name; //Instance variables
    private String  breed;
    private String color;
    private  int age;
     public Dog (String dName,String dBreed,String dColor,int dAge){
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;// or we can do this
        if(dAge<0 || dAge>30){
            System.out.println("not allowed");
        }else{
            age=dAge;
        }
    }
   public void bark(){
        System.out.println("Wuff Wuff");
    }
    public void printInfo(){
        System.out.println(name+ " "+breed+" "+color);
    }



}
