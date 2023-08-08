package Class6;

import java.util.Scanner;

public class E10WhileLoop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Start point");
        int start=scanner.nextInt();

        System.out.println("Enter your End point");
        int end=scanner.nextInt();
        System.out.println("Enter your Steps as well");
        int step =scanner.nextInt();
        while(start<=end)
        {
            System.out.print(start+" ");
            start+=step;

        }
    }

}
