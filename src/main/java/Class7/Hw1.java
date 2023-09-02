package Class7;

public class Hw1 {
    public static void main(String[] args) {
       char[] grades={'A','B','C','D'};   //First way of Creating Array
      System.out.println(grades[1]);
        char[] grades1=new char[4]; //Second way of Creating array
        grades1[0]='A';
        grades1[1]='B';
        grades1[2]='C';
        grades1[3]='D';
        System.out.println(grades1[1]);
    }
}
