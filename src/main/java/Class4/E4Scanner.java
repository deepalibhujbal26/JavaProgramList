package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
       String name= scanner.next();
      // String name2=scanner.next();
       // System.out.println("My name is "+ name);

        if(name.equals("Asghar"))
        {
            System.out.println("he is java Instructor "+ name);
        }
        else {
            System.out.println("We don`t know him" +name);
        }






    }
}
