package Class5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Country Name");
        String name=scanner.nextLine();
        name=name.toLowerCase();

        switch(name){
            case "usa":
                System.out.println("English Lagunge is speak");
                break;
            case "india":
                System.out.println("Hindi languge is speak");
                break;
            case "mexico":
                System.out.println("Spanish Language is speak");
                break;
            case "france":
                System.out.println("French Language is speak");
                break;
            default:
                System.out.println("i dont know about this country which language is speak");
                break;
        }


    }
}
