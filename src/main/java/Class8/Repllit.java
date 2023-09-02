package Class8;

import java.util.Scanner;

public class Repllit {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        int [] no= new int[5];
         for(int j=0;j<5;j++){
            no[j]= scanner.nextInt();
         }
       // System.out.println(Arrays.toString(no));
        for(int i=no.length-1;i>=0;i--){
             System.out.println(no[i]);
         }
       }
    }

