package Class5;

import java.util.Scanner;

public class T4Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        double number=scanner.nextDouble();
        if(number>=1 && number<=10){
            System.out.println("its Small number");
        }
        else if(number>=11 && number<=100){
            System.out.println("its medium number");
        }
        else if(number>=101 && number<=1000)
        {
            System.out.println("its an larger number");
        }
        else {
            System.out.println("Invalid number for given criteria");
        }
    }
}
