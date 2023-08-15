package Class8;

import java.util.Scanner;

public class E12Array {
    public static void main(String[] args) {      // sum of all arrray value
        int [] value=new int[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");

        for (int i = 0; i <value.length ; i++) {
            value[i]=scanner.nextInt();
        }
        int sum =0;
        for(int j:value){
            sum=sum+j;
        }
        System.out.println(sum);




    }
}
