package Class16;

public class Student {

    private String name;
    private String address;

    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }

   void displayInfo(){
       System.out.println("Student details :");
       System.out.println("Student name :"+name);
       System.out.println("Student Address :" +address);
   }

    public static void main(String[] args) {
        Student obj=new Student("Deepali","Boston");
        obj.displayInfo();
    }
}

