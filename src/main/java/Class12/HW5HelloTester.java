package Class12;

import java.util.Scanner;

public class HW5HelloTester {

    public static void main(String[] args) {


        HW4Hello obj=new HW4Hello();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the country name");
        String countryName=scanner.nextLine();

        System.out.println(countryName + " say Hello as : "+ obj.country(countryName));

    }

    }

