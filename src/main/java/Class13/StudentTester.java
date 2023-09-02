package Class13;

public class StudentTester {

    public static void main(String[] args) {

        Student obj=new Student();
        obj.studentID=101;
        obj.studentName="Deepali";
        Student.numberOfStudents++;

        Student obj1=new Student();
        obj.studentID=102;
        obj.studentName="Diya";
        Student.numberOfStudents++;


        Student obj2=new Student();
        obj.studentID=101;
        obj.studentName="Deepa";
        Student.numberOfStudents++;


        System.out.println("Total No of Student "+Student.numberOfStudents);

    }
}

