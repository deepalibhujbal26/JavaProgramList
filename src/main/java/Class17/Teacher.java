package Class17;

public class Teacher {

    String name;
    int age;
    String subject;

    public static void main(String[] args) {

       ChemistryTeacher obj=new ChemistryTeacher();
       obj.name="priya";
       obj.age=32;
       obj.subject="Chemistry";
       obj.printDetailsChem();

      //  System.out.println();
        MathTeacher obj1=new MathTeacher();
        obj1.name="Anusha";
        obj1.age=30;
        obj1.subject="Maths";
        obj1.printM();

        PianoTeacher obj2=new PianoTeacher();
        obj2.name="Saideep";
        obj2.age=29;
        obj2.subject="Piano";
        obj2.print();





    }
}
