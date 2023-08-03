package Class4;

import java.util.Scanner;

public class H3FarenhitToCelcius {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("PLease Enter your City Name");
        String city=scanner.nextLine();
        System.out.println("Please Enter your city Temperature in Fahrenheit ");
        double temp=scanner.nextDouble();

        double convertFTOC=((temp-32)*5)/9; // Conversion Formula
        System.out.println("The Temperature of your City is "+convertFTOC);
    }
}
