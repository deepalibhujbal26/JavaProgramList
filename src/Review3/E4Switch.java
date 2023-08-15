package Review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the fruits name");
        String fruit=scanner.nextLine();

        switch (fruit){
            case "Mango":
                System.out.println("Its in Yellow with red color");
                break;
            case "apple":
                System.out.println("Its in Red color");
                break;
            case "Banana":
                System.out.println("it Yellow color");
                break;
            case "Oragne":
                System.out.println("it an oragnge color");
                break;
            case "Blue berry":
                System.out.println("blue berries are blue in color");
                break;
            default:
                System.out.println("i dont like fruits");
                break;
        }
    }
}
