package Class12;

public class HW3Student {


    String getGrade(int score) {

        String grade;
        if (score > 90) {

            grade = "A";
        } else if (score > 80) {

            grade = "B";
        } else if (score > 70) {

            grade = "C";
        } else if (score > 50) {

            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }
}
