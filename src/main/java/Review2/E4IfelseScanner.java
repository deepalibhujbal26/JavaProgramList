package Review2;

import java.util.Scanner;

public class E4IfelseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the price");
        double price=scanner.nextDouble();
        //System.out.println("Price is "+price);

        if(price>10000)
        {
            System.out.println(" I cant buy this item");
        }
        else {
            System.out.println("i can buy this item");
        }
    }
}
