package Class15;

public class Student {

    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public Student(String cName,double cMarks1,double cMarks2,double cMarks3){
        name=cName;
        marks1=cMarks1;
        marks2=cMarks2;
        marks3=cMarks3;
    }

    void printInfo(){
        System.out.println("Student name  : " + name);
        System.out.println("Average Marks is  " + averageTest());
    }

    public double averageTest(){

        double avg=(marks1+marks2+marks3)/3;
        return Math.round(avg);
       // return avg;
    }
}
