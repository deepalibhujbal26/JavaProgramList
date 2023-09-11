package Class20;

//public class StudentPoly {
public class StudentPoly {


    void homework() {
        System.out.println("Student is doing homework");
    }

    void exam() {
        System.out.println("student is taking an exam");
    }

    void study() {
        System.out.println("Student is studying");
    }

    void play() {
        System.out.println("Student likes to play Chess");
    }

    void extraCurricular() {
        System.out.println("Student likes to do extra curricular activites");
    }
}


class SyntaxStudent extends StudentPoly {
    void play() {
        System.out.println("Student likes to play cards");
    }
}


class CollegeStudent extends StudentPoly {
    @Override
    void extraCurricular() {
        System.out.println("Student likes to nap instead");

    }
}

class SchoolStudent extends StudentPoly {
    @Override
    void homework() {
        System.out.println("Student doesnt like to do homework, instead likes to chill all day");
    }

}

class Tester {
    public static void main(String[] args) {


        StudentPoly[] arr = {new StudentPoly(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].play();
            arr[i].extraCurricular();

        }

    }
}



