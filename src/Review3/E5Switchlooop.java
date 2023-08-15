package Review3;

import java.util.Scanner;

public class E5Switchlooop {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the fruits name");
        String fruit=scanner.nextLine();


        switch (fruit) {
            case "mango":
                System.out.println("Its in Yellow with red color");
                break;
            case "apple":
                System.out.println("Its in Red color");
                break;
            case "banana":
                System.out.println("it Yellow color");
                break;
            case "orange":
                System.out.println("it an Orange color");
                break;
            case "blue berry":
                System.out.println("blue berries are blue in color");
                break;
            default:
                System.out.println("i don't like fruits");
                //break;
        }
        }
    }
}
