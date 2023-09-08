package Class16;



/*
Write a java class that have 4 constructors with 4 different access
levels of constructors(private,public,default,protected) and create 4
objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package  and observe result.
 */


public class Task {

   private  Task(){
       System.out.println("Private");
   }
   Task(String name){
       System.out.println("Default");
   }
   protected Task(int number){
        System.out.println("protected");
    }
   public Task(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {
       new Task();
       new Task("Deepali");
       new Task(12);
       new Task(65);

    }
}
